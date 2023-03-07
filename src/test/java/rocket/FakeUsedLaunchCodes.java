package rocket;

import java.util.HashSet;

public class FakeUsedLaunchCodes implements UsedLaunchCodes {
    private HashSet<LaunchCode> launchCodes = new HashSet<>();

    @Override
    public boolean contains(LaunchCode launchCode) {
        return false;
    }

    @Override
    public void add(LaunchCode launchCode) {

    }
}
