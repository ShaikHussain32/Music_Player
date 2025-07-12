package com;

import java.util.ArrayList;
import java.util.List;

public class PlaylistClass implements Playable {

	
	//private int playListId;
	private  String playListName;
	
	private List<Song>songs=new ArrayList<>();
	
	public PlaylistClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PlaylistClass(String playListName, List<Song> songs) {
		super();
		//this.playListId = playListId;
		this.playListName = playListName;
		this.songs = songs;
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
		songs.add(song);
	}
	
	public void removeSong(String title) {
		
		for(Song s:songs) {
			if(s.getTitle()==title) {
				songs.remove(s);
			}
		}
	}
	
	public void removeSong(int songId) {
		for(Song s:songs) {
			if(s.getSongId()==songId) {
				songs.remove(s);
			}
		}
	}
	
	public void displaySongs() {
		
		if(songs.size()==0)
		{
			System.out.println("Playlist is empty ");
		}
		for(Song s:songs) {
			System.out.println(s.getTitle());
		}
	}
	
	
	@Override
	public void play(String title) {
		// TODO Auto-generated method stub
		System.out.println(title + " is playing ");
		
	}

	@Override
	public void play(int songId) {
		// TODO Auto-generated method stub
		System.out.println(songId + " is playing ");
	}

	@Override
	public void pause(String title) {
		// TODO Auto-generated method stub
		System.out.println(title + " is paused");
		
	}

	@Override
	public void pause(int songId) {
		// TODO Auto-generated method stub
		System.out.println(songId + " is paused");
		
	}

	@Override
	public void stop(String title) {
		// TODO Auto-generated method stub
		System.out.println(title +" is stoped");
		
	}

	@Override
	public void stop(int songId) {
		// TODO Auto-generated method stub
		System.out.println(songId+" is stoped");
		
	}
	
	

}
