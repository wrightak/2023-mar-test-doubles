package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static rocket.Launcher.launchRocket;

class LauncherTest {
//    @Test
//    void givenExpiredLaunchCode_rocketIsNotLaunchedAndIsDisabled_Spy() {
//        SpyRocket spyRocket = new SpyRocket();
//
//        launchRocket(spyRocket, new ExpiredLaunchCodeStub());
//
//        assertFalse(spyRocket.launchWasCalled());
//        assertTrue(spyRocket.disableWasCalled());
//    }
//
//    @Test
//    void givenUnsignedLaunchCode_rocketIsNotLaunchedAndIsDisabled_Spy() {
//        SpyRocket spyRocket = new SpyRocket();
//
//        launchRocket(spyRocket, new UnsignedLaunchCodeStub());
//
//        assertFalse(spyRocket.launchWasCalled());
//        assertTrue(spyRocket.disableWasCalled());
//    }
//
//    @Test
//    void givenExpiredLaunchCode_codeRedAbort_Mock() {
//        MockRocket mockRocket = new MockRocket();
//
//        launchRocket(mockRocket, new ExpiredLaunchCodeStub());
//
//        mockRocket.verifyCodeRedAbort();
//    }
//
//    @Test
//    void givenUnsignedLaunchCode_codeRedAbort_Mock() {
//        MockRocket mockRocket = new MockRocket();
//
//        launchRocket(mockRocket, new UnsignedLaunchCodeStub());
//
//        mockRocket.verifyCodeRedAbort();
//    }
//
//    @Test
//    void givenGoodLaunchCode_rocketIsLaunchedNotDisabled() {
//        SpyRocket spyRocket = new SpyRocket();
//
//        launchRocket(spyRocket, new GoodLaunchCodeStub());
//
//        assertTrue(spyRocket.launchWasCalled());
//        assertFalse(spyRocket.disableWasCalled());
//    }
}
