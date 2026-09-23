package com;

import java.util.List;

public class PlayList implements Playable {
	
	private int playListId;
	private String playListName;
	 private List<Song> songs;
	 public PlayList(int i, String playlistName2) {
		// TODO Auto-generated constructor stub
	}
	 public int getPlayListId() {
		 return playListId;
	 }
	 public void setPlayListId(int playListId) {
		 this.playListId = playListId;
	 }
	 public String getPlayListName() {
		 return playListName;
	 }
	 public void setPlayListName(String playListName) {
		 this.playListName = playListName;
	 }
	 public List<Song> getSongs() {
		 return songs;
	 }
	 public void setSongs(List<Song> songs) {
		 this.songs = songs;
	 }
	
	 public void addSong(Song song) {

	        if (song == null) {
	            System.out.println("Invalid song.");
	            return;
	        }
	        songs.add(song);

	        System.out.println("Song added to playlist successfully.");
	 }
	        
	  public static  void removeSong(int songId) {

	            Song song = null;
				try {
					song = findSongById(songId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            if (song != null) {
	                song.remove(song);
	                System.out.println("Song removed from playlist successfully.");
	            } else {
	            	System.out.println("Error....");
	            }
	  }
	            
	   
	  private Song findSongByTitle(String title) {

	        for (Song song : songs) {
	            if (song.getTitle().equalsIgnoreCase(title)) {
	                return song;
	            }
	        }

	        return null;
	    }
	  private static Song findSongById(int songId) {

	        Song[] song = null;
			for (Song song1 : song) {
	            if (song1.getSongId() == songId) {
	                return song1;
	            }
	        }

	        return null;
	    }

	    // Display all songs
	    public void displaySongs() {

	        if (songs.isEmpty()) {
	            System.out.println("No songs available in this playlist.");
	            return;
	        }

	        System.out.println("\n------------------------------------------");
	        System.out.println("Playlist: " + playListName);
	        System.out.println("------------------------------------------");

	        for (Song song : songs) {
	            System.out.println(song);
	        }

	        System.out.println("------------------------------------------");
	    }

	    // Play by title
	    public void play(String title) {

	        Song song = findSongByTitle(title);

	        if (song != null) {
	            System.out.println(
	                    "▶ Playing: " +
	                    song.getTitle() +
	                    " - " +
	                    song.getArtist()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    // Play by ID
	    public void play(int songId) {

	        Song song = findSongById(songId);

	        if (song != null) {
	            System.out.println(
	                    "▶ Playing: " +
	                    song.getTitle() +
	                    " - " +
	                    song.getArtist()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    // Pause by title
	    public void pause(String title) {

	        Song song = findSongByTitle(title);

	        if (song != null) {
	            System.out.println(
	                    "⏸ Paused: " +
	                    song.getTitle()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    // Pause by ID
	    public void pause(int songId) {

	        Song song = findSongById(songId);

	        if (song != null) {
	            System.out.println(
	                    "⏸ Paused: " +
	                    song.getTitle()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    // Stop by title
	    public void stop(String title) {

	        Song song = findSongByTitle(title);

	        if (song != null) {
	            System.out.println(
	                    "⏹ Stopped: " +
	                    song.getTitle()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    // Stop by ID
	    public void stop(int songId) {

	        Song song = findSongById(songId);

	        if (song != null) {
	            System.out.println(
	                    "⏹ Stopped: " +
	                    song.getTitle()
	            );
	        } else {
	            System.out.println("Song not found in playlist.");
	        }
	    }

	    
	    public String toString() {
	        return "Playlist ID: " + playListId +
	                " | Playlist Name: " + playListName +
	                " | Songs: " + songs.size();
	    }
		public String getPlaylistId() {
			// TODO Auto-generated method stub
			return null;
		}
	    }

	 


