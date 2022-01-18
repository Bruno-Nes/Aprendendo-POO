package encapsulameto;

public interface Controller {
    public abstract void on();
    public abstract void off();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void increaseVolume();
    public abstract void decreaseVolume();
    public abstract void turnOnMute();
    public abstract void turnOffMute();
    public abstract void play();
    public abstract void pause();
}
