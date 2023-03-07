package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsedLaunchCodesTest {
    @Test
    void contains() {
        UsedLaunchCodes usedLaunchCodes = new FakeUsedLaunchCodes();

        GoodLaunchCodeStub launchCode1 = new GoodLaunchCodeStub();
        GoodLaunchCodeStub launchCode2 = new GoodLaunchCodeStub();

        assertFalse(usedLaunchCodes.contains(launchCode1));
        assertFalse(usedLaunchCodes.contains(launchCode2));

        usedLaunchCodes.add(launchCode1);

        assertTrue(usedLaunchCodes.contains(launchCode1));
        assertFalse(usedLaunchCodes.contains(launchCode2));
    }
}
