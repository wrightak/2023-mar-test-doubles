package rocket;

public class ExpiredLaunchCodeStub implements LaunchCode {
    @Override
    public boolean isExpired() {
        return true;
    }

    @Override
    public boolean isSigned() {
        return true;
    }
}
