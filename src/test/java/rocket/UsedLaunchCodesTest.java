package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsedLaunchCodesTest {
    @Test
    void contains() {
        UsedLaunchCodes usedLaunchCodes = new FakeUsedLaunchCodes();

        GoodLaunchCodeStub launchCode = new GoodLaunchCodeStub();
        
        assertFalse(usedLaunchCodes.contains(launchCode));
        
        usedLaunchCodes.add(launchCode);

        assertTrue(usedLaunchCodes.contains(launchCode));
    }
}
