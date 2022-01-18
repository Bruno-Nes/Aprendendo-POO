package encapsulameto;

import encapsulameto.Controller;

public class RemoteControl implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;

    public RemoteControl() {
        this.volume = 10;
        this.on = false;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void on() {
        this.setOn(true);
    }

    @Override
    public void off() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Is on? " + isOn());
        System.out.println("Is playing? " + isPlaying());
        System.out.println("Volume: " + getVolume());

        for(int i = 0; i <= getVolume(); i++) {
            System.out.print(i+"-");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("The menu is closing...");
    }

    @Override
    public void increaseVolume() {
        if(this.isOn()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void decreaseVolume() {
        if(this.isOn()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void turnOnMute() {
        if(this.isOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void turnOffMute() {
        if(this.isOn() && this.getVolume() == 0) {
            this.setVolume(10);
        }
    }

    @Override
    public void play() {
        if(this.isOn() && !(this.isPlaying())) {
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.isOn() && this.isPlaying()) {
            this.setPlaying(false);
        }
    }
}
