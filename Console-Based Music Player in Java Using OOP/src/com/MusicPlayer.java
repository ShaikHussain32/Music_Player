package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MusicPlayer {
	
	List<PlaylistClass>playlists=new ArrayList<>();
	List<Song>allSongs=new ArrayList<>();
	
	PlaylistClass playlistClass=new PlaylistClass();
	
	//add song into music player 
	
	public void addSong(Song song) {
		allSongs.add(song);
		System.out.println("Song added successfully");
	}
	
	
	//update Song 
	public void updateSong(String title,Song song) {
		
		for(int i=0;i<allSongs.size();i++) {
			
			if(allSongs.get(i).getTitle().equals(title)){
				allSongs.set(i, song);
				
				System.out.println("Song updated succesffully");
				break;
			}
		}
	}
	
	//delete song
	public void deleteSong(String title) {
		
		for(int i=0;i<allSongs.size();i++) {
			
			if(allSongs.get(i).getTitle().equals(title)){
				allSongs.remove(i);
				System.out.println("Song deleted successfully");
				break;
			}
		}
	}
	
	
	// create a  playlist 
	
	public void createPlaylist(String playlistName) {
		
		playlists.add(new PlaylistClass(playlistName,new ArrayList<Song>()));
		System.out.println("playlist created successfully");
	}
	
	
	
	//displayallsongs
	public void displayAllSongs()
	{
		if(allSongs.size()==0) {
			System.out.println("There is no songs in the playlist");
			
		}
		for(Song s:allSongs) {
			System.out.println(s.getTitle());
		}
	}
	
	
	//add song to specific playlist 
		public void addSongToPlaylist(String playlistname, Song song) {
			
			for(PlaylistClass p:playlists) {
				
				if(p.getPlayListName().equals(playlistname)) {
					 p.addSong(song);
					System.out.println("Song add to the playlist");
					break;
				}
			}
			allSongs.add(song);
		}
		
		//get all songs in the playlist 
		public void getPlayList(String playlistname) {
			
			
			
			int i=0;
			
			for(PlaylistClass p:playlists) {
				
				
				
				if(p.getPlayListName().equals(playlistname)) {
					System.out.println("songs in the playlist "+ playlistname);
					p.displaySongs();
					
					break;
				}
				i++;
			}
			if(i>playlists.size()-1)
			{
				System.out.println("Playlist not found");
			}
			
			
		}
		
		//delete playlist
		public void deletePlayList(String playlistname) {
			
			int i=0;
			for(PlaylistClass p:playlists) {
				
				if(p.getPlayListName().equals(playlistname))
				{
					playlists.remove(i);
					System.out.println("PlayList Deleted successfully");
					break;
				}
				i++;
			}
			
			if(i>playlists.size()-1)
			{System.out.println("Playlist Not Found enter the correct playlist");
			}
			
		}
		
		//display all playlists
		public void displayAllPlayLists() {
			
			if(playlists.size()==0)
			{
				System.out.println("There are NO PLAYLISTS .....");
			}
			
			for(PlaylistClass p:playlists) {
				System.out.println(p.getPlayListName());
			}
		}
		
		//play playlist
		public void playPlaylist(String playListName) {
			
			System.out.println(playlists.get(0).getSongs().get(0).getTitle() + " is playing ");
		}
		
		//pause song in playlist
		public void pauseplaylist() {
			System.out.println("Playlist is paused");
		}
		
		//stop the song in playlist
		public void stopPlaylist() {
			System.out.println("Playlist is stopped");
		}
}
