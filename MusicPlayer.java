package com;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	
	 private List<Song> allSongs;
	    private List<PlayList> playlists;

	    private int nextPlaylistId = 1;
	    
	    public MusicPlayer() {
	        allSongs = new ArrayList<>();
	        playlists = new ArrayList<>();
	    }
	    public void addSong(Song song) {

	        if (song == null) {
	            System.out.println("Invalid song.");
	            return;
	        }

	        if (getSongById1(song.getSongId()) != null) {
	            System.out.println("Song ID already exists.");
	            return;
	        }

	        allSongs.add(song);

	        System.out.println("Song added successfully.");
	    }
		Object getSongById1(int songId) {
			// TODO Auto-generated method stub
			return null;
		}
		public void updateSong(String title, Song updatedSong) {

	        Song existingSong = getSongByTitle(title);

	        if (existingSong == null) {
	            System.out.println("Song not found.");
	            return;
	        }

	        existingSong.setSongId(updatedSong.getSongId());
	        existingSong.setTitle(updatedSong.getTitle());
	        existingSong.setArtist(updatedSong.getArtist());
	        existingSong.setDuration(updatedSong.getDuration());

	        System.out.println("Song updated successfully.");
	    }
		Song getSongByTitle(String title) {
			// TODO Auto-generated method stub
			return null;
		}
		 public void deleteSong(String title) {

		        Song song = getSongByTitle(title);

		        if (song == null) {
		            System.out.println("Song not found.");
		            return;
		        }

		        // Remove song from main library
		        allSongs.remove(song);

		        // Also remove the song from all playlists
		        for (PlayList playlist : playlists) {
		            playlist.removeSong(song.getSongId());
		        }

		        System.out.println("Song deleted successfully.");
		    }
		 public void displayAllSongs() {

		        if (allSongs.isEmpty()) {
		            System.out.println("No songs available.");
		            return;
		        }

		        System.out.println("\n==========================================");
		        System.out.println("              ALL SONGS");
		        System.out.println("==========================================");

		        for (Song song : allSongs) {
		            System.out.println(song);
		        }

		        System.out.println("==========================================");
		    }
		 public void createPlaylist(String playlistName) {

		        if (playlistName == null || playlistName.trim().isEmpty()) {
		            System.out.println("Playlist name cannot be empty.");
		            return;
		        }

		        if (getPlaylist(playlistName) != null) {
		            System.out.println("Playlist already exists.");
		            return;
		        }

		        PlayList playlist =
		                new PlayList(nextPlaylistId++, playlistName);

		        playlists.add(playlist);

		        System.out.println(
		                "Playlist created successfully. " +
		                "Playlist ID: " +
		                playlist.getPlaylistId()
		        );
		    }
		 Object getPlaylist(String playlistName) {
			// TODO Auto-generated method stub
			return null;
		 }
		 public void addSongToPlaylist(String playlistName, Song song) {

		        PlayList playlist = (PlayList) getPlaylist(playlistName);

		        if (playlist == null) {
		            System.out.println("Playlist not found.");
		            return;
		        }

		        if (song == null) {
		            System.out.println("Song not found.");
		            return;
		        }

		        playlist.addSong(song);
		    }
		  public void deletePlaylist(String playlistName) {

		        PlayList playlist = (PlayList) getPlaylist(playlistName);

		        if (playlist == null) {
		            System.out.println("Playlist not found.");
		            return;
		        }

		        playlists.remove(playlist);

		        System.out.println("Playlist deleted successfully.");
		    }
		  public void playPlaylist(String playlistName) {

		        PlayList playlist = (PlayList) getPlaylist(playlistName);

		        if (playlist == null) {
		            System.out.println("Playlist not found.");
		            return;
		        }

		        if (playlist.getSongs().isEmpty()) {
		            System.out.println("Playlist has no songs.");
		            return;
		        }

		        System.out.println("\nPlaying playlist: " +
		                playlist.getPlayListName());

		        for (Song song : playlist.getSongs()) {
		            playlist.play(song.getSongId());
		        }
		    }
		  public PlayList getPlaylist1(String playlistName) {

		        for (PlayList playlist : playlists) {

		            if (playlist.getPlayListName()
		                    .equalsIgnoreCase(playlistName)) {

		                return playlist;
		            }
		        }

		        return null;
		    }
		  public void displayAllPlaylists() {

		        if (playlists.isEmpty()) {
		            System.out.println("No playlists available.");
		            return;
		        }

		        System.out.println("\n==========================================");
		        System.out.println("            ALL PLAYLISTS");
		        System.out.println("==========================================");

		        for (PlayList playlist : playlists) {
		            System.out.println(playlist);
		        }

		        System.out.println("==========================================");
		    }
		  
		  public Song getSongById(int songId) {

		        for (Song song : allSongs) {

		            if (song.getSongId() == songId) {
		                return song;
		            }
		        }

		        return null;
		    }

		    public Song getSongByTitle1(String title) {

		        for (Song song : allSongs) {

		            if (song.getTitle()
		                    .equalsIgnoreCase(title)) {

		                return song;
		            }
		        }

		        return null;
		    }

		    // Getter for all songs
		    public List<Song> getAllSongs() {
		        return allSongs;
		    }

		    // Getter for playLists
		    public List<PlayList> getPlaylists() {
		        return playlists;
		    }
		    

}
