package rocket;

public class Launcher {
    static void launchRocket(Rocket rocket, LaunchCode launchCode, UsedLaunchCodes usedLaunchCodes) {
        if (usedLaunchCodes.contains(launchCode) ||
                launchCode.isExpired() || 
                !launchCode.isSigned()) {
            rocket.disable();
        } else {
            usedLaunchCodes.add(launchCode);
            rocket.launch();
        }
    }
}
