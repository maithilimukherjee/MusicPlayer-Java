public class Song extends MusicPlayer {
    
    String title;
    String artist;
    double duration; // duration in minutes
    String genre;


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
