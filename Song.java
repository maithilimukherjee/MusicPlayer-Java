public class Song extends MusicPlayer {

    String title;
    String artist;
    double duration;
    String genre;

    // Parameterized constructor (the one causing the error)
    public Song(String title, String artist, double duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    // Default constructor (optional but good practice)
    public Song() {
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
    }

    String getArtist() {
        return artist;
    }

    double getDuration() {
        return duration;
    }
}
