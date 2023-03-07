package rocket;

import java.util.HashSet;

public class FakeUsedLaunchCodes implements UsedLaunchCodes {
    private HashSet<LaunchCode> launchCodes = new HashSet<>();

    @Override
    public boolean contains(LaunchCode launchCode) {
        return launchCodes.contains(launchCode);
    }

    @Override
    public void add(LaunchCode launchCode) {
        launchCodes.add(launchCode);
    }
}
