import java.util.*;

public class SpotifyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist myPlaylist = new Playlist("My Favorite Songs");

        myPlaylist.addSong(new Song("Revolving Door", "Tate McRae", 3.16, "Pop"));
        myPlaylist.addSong(new Song("Blinding Lights", "The Weeknd", 3.20, "Synthwave"));
        myPlaylist.addSong(new Song("Someone Like You", "Adele", 4.45, "Soul"));
        myPlaylist.addSong(new Song("Believer", "Imagine Dragons", 3.24, "Rock"));

        int choice;

        do {
            System.out.println("\n===============================");
            System.out.println("Spotify Playlist Simulator");
            System.out.println("===============================");
            System.out.println("1. Show Playlist");
            System.out.println("2. Play All Songs");
            System.out.println("3. Shuffle Play");
            System.out.println("4. Search Song");
            System.out.println("5. Add More Songs");
            System.out.println("6. Remove Song");
            System.out.println("7. Change Volume");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> myPlaylist.showPlaylist();
                case 2 -> myPlaylist.playAll();
                case 3 -> myPlaylist.shufflePlay();
                case 4 -> {
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    myPlaylist.searchSong(keyword);
                }
                case 5 -> {
                    System.out.println("\nAdd Your Own Song:");
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    double duration = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
                    Song newSong = new Song(title, artist, duration, genre);
                    myPlaylist.addSong(newSong);
                    System.out.println("\"" + title + "\" added successfully!");
                }
                case 6 -> {
                    System.out.print("Enter song title to remove: ");
                    String title = sc.nextLine();
                    myPlaylist.removeSong(title);
                }
                case 7 -> {
                    System.out.print("Enter new volume level (0–100): ");
                    int vol = sc.nextInt();
                    myPlaylist.setVolume(vol);
                }
                case 0 -> System.out.println("Exiting Spotify... Goodbye!");
                default -> System.out.println("Invalid choice, try again!");
            }

        } while (choice != 0);

        sc.close();
    }
}
