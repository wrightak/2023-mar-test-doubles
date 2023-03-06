package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static rocket.Launcher.launchRocket;

class LauncherTest {
    @Test
    void givenExpiredLaunchCode_rocketIsNotLaunchedAndIsDisabled() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new ExpiredLaunchCodeStub());

        assertFalse(spyRocket.launchWasCalled());
        assertTrue(spyRocket.disableWasCalled());
    }

    @Test
    void givenGoodLaunchCode_rocketIsLaunchedNotDisabled() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new GoodLaunchCodeStub());

        assertTrue(spyRocket.launchWasCalled());
        assertFalse(spyRocket.disableWasCalled());
    }

    @Test
    void givenUnsignedLaunchCode_rocketIsNotLaunchedAndIsDisabled() {
        SpyRocket spyRocket = new SpyRocket();

        launchRocket(spyRocket, new UnsignedLaunchCodeStub());

        assertFalse(spyRocket.launchWasCalled());
        assertTrue(spyRocket.disableWasCalled());
    }
}
