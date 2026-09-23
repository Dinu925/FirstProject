package com;

import java.util.Scanner;

public class Main {
	
	  private static Scanner scanner = new Scanner(System.in);
	    private static MusicPlayer musicPlayer = new MusicPlayer();

	    public static void main(String[] args) {

	        int choice;

	        System.out.println("==========================================");
	        System.out.println("       WELCOME TO MUSIC PLAYER");
	        System.out.println("==========================================");

	        do {

	            displayMenu();

	            choice = readInt("Enter your choice: ");

	            switch (choice) {

	                case 1:
	                    addNewSong();
	                    break;

	                case 2:
	                    updateExistingSong();
	                    break;

	                case 3:
	                    deleteSong();
	                    break;

	                case 4:
	                    musicPlayer.displayAllSongs();
	                    break;

	                case 5:
	                    createNewPlaylist();
	                    break;

	                case 6:
	                    addSongToPlaylist();
	                    break;

	                case 7:
	                    musicPlayer.displayAllPlaylists();
	                    break;

	                case 8:
	                    displaySongsInPlaylist();
	                    break;

	                case 9:
	                    playSongInPlaylist();
	                    break;

	                case 10:
	                    pauseSongInPlaylist();
	                    break;

	                case 11:
	                    stopSongInPlaylist();
	                    break;

	                case 12:
	                    System.out.println("\nThank you for using Music Player!");
	                    break;

	                default:
	                    System.out.println(
	                            "\nInvalid choice. Please select 1-12."
	                    );
	            }

	        } while (choice != 12);

	        scanner.close();
	    }

	    // ==========================================
	    // DISPLAY MENU
	    // ==========================================

	    private static void displayMenu() {

	        System.out.println("\n");
	        System.out.println("==========================================");
	        System.out.println("          MUSIC PLAYER MENU");
	        System.out.println("==========================================");

	        System.out.println("1. Add New Song");
	        System.out.println("2. Update Existing Song");
	        System.out.println("3. Delete Song");
	        System.out.println("4. Display All Songs");
	        System.out.println("5. Create New Playlist");
	        System.out.println("6. Add Song to Playlist");
	        System.out.println("7. Display All Playlists");
	        System.out.println("8. Display Songs in Playlist");
	        System.out.println("9. Play Song in Playlist");
	        System.out.println("10. Pause Song in Playlist");
	        System.out.println("11. Stop Song in Playlist");
	        System.out.println("12. Exit");

	        System.out.println("==========================================");
	    }

	    // ==========================================
	    // OPTION 1 - ADD SONG
	    // ==========================================

	    private static void addNewSong() {

	        System.out.println("\n========== ADD NEW SONG ==========");

	        int songId = readInt("Enter Song ID: ");

	        if (musicPlayer.getSongById(songId) != null) {
	            System.out.println("Song ID already exists.");
	            return;
	        }

	        String title = readString("Enter Song Title: ");

	        String artist = readString("Enter Artist Name: ");

	        double duration =
	                readDouble("Enter Duration (minutes): ");

	        if (duration <= 0) {
	            System.out.println(
	                    "Duration must be greater than zero."
	            );
	            return;
	        }

	        Song song =
	                new Song(songId, title, artist, duration);

	        musicPlayer.addSong(song);
	    }

	    // ==========================================
	    // OPTION 2 - UPDATE SONG
	    // ==========================================

	    private static void updateExistingSong() {

	        System.out.println("\n========== UPDATE SONG ==========");

	        String oldTitle =
	                readString("Enter the title of the song to update: ");

	        Song existingSong =
	                musicPlayer.getSongByTitle(oldTitle);

	        if (existingSong == null) {
	            System.out.println("Song not found.");
	            return;
	        }

	        System.out.println("\nCurrent Song Details:");
	        System.out.println(existingSong);

	        int newId =
	                readInt("Enter New Song ID: ");

	        String newTitle =
	                readString("Enter New Song Title: ");

	        String newArtist =
	                readString("Enter New Artist Name: ");

	        double newDuration =
	                readDouble("Enter New Duration (minutes): ");

	        Song updatedSong =
	                new Song(
	                        newId,
	                        newTitle,
	                        newArtist,
	                        newDuration
	                );

	        musicPlayer.updateSong(
	                oldTitle,
	                updatedSong
	        );
	    }

	    // ==========================================
	    // OPTION 3 - DELETE SONG
	    // ==========================================

	    private static void deleteSong() {

	        System.out.println("\n========== DELETE SONG ==========");

	        String title =
	                readString("Enter Song Title to delete: ");

	        musicPlayer.deleteSong(title);
	    }

	    // ==========================================
	    // OPTION 5 - CREATE PLAYLIST
	    // ==========================================

	    private static void createNewPlaylist() {

	        System.out.println("\n========== CREATE PLAYLIST ==========");

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        musicPlayer.createPlaylist(playlistName);
	    }

	    // ==========================================
	    // OPTION 6 - ADD SONG TO PLAYLIST
	    // ==========================================

	    private static void addSongToPlaylist() {

	        System.out.println(
	                "\n========== ADD SONG TO PLAYLIST =========="
	        );

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        PlayList playlist =
	                (PlayList) musicPlayer.getPlaylist(playlistName);

	        if (playlist == null) {
	            System.out.println("Playlist not found.");
	            return;
	        }

	        int songId =
	                readInt("Enter Song ID to add: ");

	        Song song =
	                (Song) musicPlayer.getSongById(songId);

	        if (song == null) {
	            System.out.println("Song not found in music library.");
	            return;
	        }

	        musicPlayer.addSongToPlaylist(
	                playlistName,
	                song
	        );
	    }

	    // ==========================================
	    // OPTION 8 - DISPLAY PLAYLIST SONGS
	    // ==========================================

	    private static void displaySongsInPlaylist() {

	        System.out.println(
	                "\n========== PLAYLIST SONGS =========="
	        );

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        PlayList playlist =
	                (PlayList) musicPlayer.getPlaylist(playlistName);

	        if (playlist == null) {
	            System.out.println("Playlist not found.");
	            return;
	        }

	        playlist.displaySongs();
	    }

	    // ==========================================
	    // OPTION 9 - PLAY SONG
	    // ==========================================

	    private static void playSongInPlaylist() {

	        System.out.println(
	                "\n========== PLAY SONG =========="
	        );

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        PlayList playlist =
	                (PlayList) musicPlayer.getPlaylist(playlistName);

	        if (playlist == null) {
	            System.out.println("Playlist not found.");
	            return;
	        }

	        if (playlist.getSongs().isEmpty()) {
	            System.out.println(
	                    "No songs available in this playlist."
	            );
	            return;
	        }

	        System.out.println("\n1. Play by Song ID");
	        System.out.println("2. Play by Song Title");

	        int choice =
	                readInt("Choose option: ");

	        switch (choice) {

	            case 1:

	                int songId =
	                        readInt("Enter Song ID: ");

	                playlist.play(songId);

	                break;

	            case 2:

	                String title =
	                        readString("Enter Song Title: ");

	                playlist.play(title);

	                break;

	            default:

	                System.out.println("Invalid option.");
	        }
	    }

	    // ==========================================
	    // OPTION 10 - PAUSE SONG
	    // ==========================================

	    private static void pauseSongInPlaylist() {

	        System.out.println(
	                "\n========== PAUSE SONG =========="
	        );

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        PlayList playlist =
	                (PlayList) musicPlayer.getPlaylist(playlistName);

	        if (playlist == null) {
	            System.out.println("Playlist not found.");
	            return;
	        }

	        System.out.println("\n1. Pause by Song ID");
	        System.out.println("2. Pause by Song Title");

	        int choice =
	                readInt("Choose option: ");

	        switch (choice) {

	            case 1:

	                int songId =
	                        readInt("Enter Song ID: ");

	                playlist.pause(songId);

	                break;

	            case 2:

	                String title =
	                        readString("Enter Song Title: ");

	                playlist.pause(title);

	                break;

	            default:

	                System.out.println("Invalid option.");
	        }
	    }

	    // ==========================================
	    // OPTION 11 - STOP SONG
	    // ==========================================

	    private static void stopSongInPlaylist() {

	        System.out.println(
	                "\n========== STOP SONG =========="
	        );

	        String playlistName =
	                readString("Enter Playlist Name: ");

	        PlayList playlist =
	                (PlayList) musicPlayer.getPlaylist(playlistName);

	        if (playlist == null) {
	            System.out.println("Playlist not found.");
	            return;
	        }

	        System.out.println("\n1. Stop by Song ID");
	        System.out.println("2. Stop by Song Title");

	        int choice =
	                readInt("Choose option: ");

	        switch (choice) {

	            case 1:

	                int songId =
	                        readInt("Enter Song ID: ");

	                playlist.stop(songId);

	                break;

	            case 2:

	                String title =
	                        readString("Enter Song Title: ");

	                playlist.stop(title);

	                break;

	            default:

	                System.out.println("Invalid option.");
	        }
	    }

	    // ==========================================
	    // INPUT METHODS
	    // ==========================================

	    private static int readInt(String message) {

	        while (true) {

	            try {

	                System.out.print(message);

	                String input =
	                        scanner.nextLine().trim();

	                return Integer.parseInt(input);

	            } catch (NumberFormatException e) {

	                System.out.println(
	                        "Please enter a valid integer."
	                );
	            }
	        }
	    }

	    private static double readDouble(String message) {

	        while (true) {

	            try {

	                System.out.print(message);

	                String input =
	                        scanner.nextLine().trim();

	                return Double.parseDouble(input);

	            } catch (NumberFormatException e) {

	                System.out.println(
	                        "Please enter a valid number."
	                );
	            }
	        }
	    }

	    private static String readString(String message) {

	        while (true) {

	            System.out.print(message);

	            String input =
	                    scanner.nextLine().trim();

	            if (!input.isEmpty()) {
	                return input;
	            }

	            System.out.println(
	                    "Input cannot be empty."
	            );
	        }
	    }

}
