public class MusicPlayer {
    String brand;
    boolean isPlaying;
    int volumeLevel;

    void play() {
        isPlaying = true;
        System.out.println("Music is playing.");
    }

    void pause() {
        isPlaying = false;
        System.out.println("Music is paused.");
    }

    void stop() {
        isPlaying = false;
        System.out.println("Music is stopped.");
    }

    void setVolume(int level) {
        volumeLevel = level;
        System.out.println("Volume set to " + volumeLevel);
    }
}
