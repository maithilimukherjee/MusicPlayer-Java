import java.util.ArrayList;  // ✅ Required for ArrayList

public class Playlist extends MusicPlayer {
    
    String playlistName;
    ArrayList<Song> songs = new ArrayList<>();  // ✅ Must initialize the list

    void addSong(Song song) {
        songs.add(song);
        System.out.println("Song \"" + song.title + "\" added to playlist \"" + playlistName + "\"");
    }

    void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Song \"" + song.title + "\" removed from playlist \"" + playlistName + "\"");
    }

    void playAll() {
        if (songs.isEmpty()) {
            System.out.println("Playlist \"" + playlistName + "\" is empty.");
            return;
        }

        System.out.println("🎵 Playing all songs in playlist \"" + playlistName + "\":");
        for (Song song : songs) {
            song.play();             // inherited method from MusicPlayer
            song.displayDetails();   // from Song
            System.out.println();
        }
    }

    void showPlaylist() {
        System.out.println("📀 Playlist: " + playlistName);
        if (songs.isEmpty()) {
            System.out.println("(No songs added yet)");
        } else {
            for (Song song : songs) {
                System.out.println("- " + song.title + " by " + song.artist);
            }
        }
    }
}
