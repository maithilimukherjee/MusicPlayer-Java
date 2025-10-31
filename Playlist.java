import java.util.ArrayList;
import java.util.Collections;

public class Playlist extends MusicPlayer {
    String playlistName;
    ArrayList<Song> songs = new ArrayList<>();

    Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " + song.title + " by " + song.artist);
    }

    void removeSong(String title) {
        songs.removeIf(song -> song.title.equalsIgnoreCase(title));
        System.out.println("Removed song: " + title);
    }

    void playAll() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }
        System.out.println("\nNow playing playlist: " + playlistName);
        for (Song song : songs) {
            song.play();
            song.displayDetails();
            try { Thread.sleep(1000); } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            song.stop();
        }
    }

    void showPlaylist() {
        System.out.println("\nPlaylist: " + playlistName);
        if (songs.isEmpty()) {
            System.out.println("(No songs added yet)");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i).title + " - " + songs.get(i).artist);
            }
        }
    }

    void shufflePlay() {
        if (songs.isEmpty()) {
            System.out.println("No songs to shuffle!");
            return;
        }
        Collections.shuffle(songs);
        playAll();
    }

    void searchSong(String keyword) {
        System.out.println("\nSearch results for \"" + keyword + "\":");
        for (Song s : songs) {
            if (s.title.toLowerCase().contains(keyword.toLowerCase())) {
                s.displayDetails();
            }
        }
    }
}
