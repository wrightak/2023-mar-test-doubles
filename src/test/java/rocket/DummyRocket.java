package rocket;

public class DummyRocket implements Rocket {
    @Override
    public void launch() {
        throw new RuntimeException();
    }

    @Override
    public void disable() {
        throw new RuntimeException();
    }
}
