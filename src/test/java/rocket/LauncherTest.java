package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static rocket.Launcher.launchRocket;

class LauncherTest {
    @Test
    void givenExpiredLaunchCode_rocketIsNotLaunchedAndIsDisabled_Spy() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new ExpiredLaunchCodeStub(), new FakeUsedLaunchCodes());

        assertFalse(spyRocket.launchWasCalled());
        assertTrue(spyRocket.disableWasCalled());
    }

    @Test
    void givenUnsignedLaunchCode_rocketIsNotLaunchedAndIsDisabled_Spy() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new UnsignedLaunchCodeStub(), new FakeUsedLaunchCodes());

        assertFalse(spyRocket.launchWasCalled());
        assertTrue(spyRocket.disableWasCalled());
    }

    @Test
    void givenExpiredLaunchCode_codeRedAbort_Mock() {
        MockRocket mockRocket = new MockRocket();

        launchRocket(mockRocket, new ExpiredLaunchCodeStub(), new FakeUsedLaunchCodes());

        mockRocket.verifyCodeRedAbort();
    }

    @Test
    void givenUnsignedLaunchCode_codeRedAbort_Mock() {
        MockRocket mockRocket = new MockRocket();

        launchRocket(mockRocket, new UnsignedLaunchCodeStub(), new FakeUsedLaunchCodes());

        mockRocket.verifyCodeRedAbort();
    }

    @Test
    void givenGoodLaunchCode_rocketIsLaunchedNotDisabled() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new GoodLaunchCodeStub(), new FakeUsedLaunchCodes());

        assertTrue(spyRocket.launchWasCalled());
        assertFalse(spyRocket.disableWasCalled());
    }

    @Test
    void launchCodeCanOnlyBeUsedOnce() {
        SpyRocket rocket1 = new SpyRocket();
        MockRocket rocket2 = new MockRocket();
        GoodLaunchCodeStub launchCode = new GoodLaunchCodeStub();
        FakeUsedLaunchCodes fakeUsedLaunchCodes = new FakeUsedLaunchCodes();

        launchRocket(rocket1, launchCode, fakeUsedLaunchCodes);
        launchRocket(rocket2, launchCode, fakeUsedLaunchCodes);

        rocket2.verifyCodeRedAbort();
    }
}
