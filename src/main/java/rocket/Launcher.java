package rocket;

public class Launcher {
    static void launchRocket(Rocket rocket, LaunchCode launchCode) {
        if (launchCode.isExpired() || !launchCode.isSigned()) {
            rocket.disable();
        } else {
            rocket.launch();
        }
    }
}
