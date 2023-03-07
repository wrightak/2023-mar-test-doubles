package rocket;

public interface UsedLaunchCodes {
    boolean contains(LaunchCode launchCode);
    void add(LaunchCode launchCode);
}
