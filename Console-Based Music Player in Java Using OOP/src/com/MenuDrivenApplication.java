package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDrivenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        MusicPlayer musicPlayer = new MusicPlayer(); 
	        PlaylistClass playlistClass=new PlaylistClass();
	        takeinput tip=new takeinput();
	       
	        Song s1 = new Song(16, "Butta Bomma", "Armaan Malik", 3.1);
	        Song s2 = new Song(17, "Samajavaragamana", "Sid Sriram", 4.3);
	        Song s3 = new Song(18, "Naatu Naatu", "Rahul Sipligunj & Kaala Bhairava", 3.5);
	        Song s4 = new Song(19, "Srivalli", "Javed Ali", 3.4);
	        Song s5 = new Song(20, "Inkem Inkem Inkem Kaavaale", "Sid Sriram", 3.8);
	        Song s6 = new Song(11, "Kesariya", "Arijit Singh", 3.5);
	        Song s7 = new Song(12, "Tujh Mein Rab Dikhta Hai", "Roop Kumar Rathod", 4.2);
	        Song s8 = new Song(13, "Tum Mile", "Neeraj Shridhar", 3.9);
	        Song s9 = new Song(14, "Raataan Lambiyan", "Jubin Nautiyal & Asees Kaur", 3.7);
	        Song s10 = new Song(15, "Kalank Title Track", "Arijit Singh", 5.0);
	        
	        musicPlayer.addSong(s1);
	        musicPlayer.addSong(s2);
	        musicPlayer.addSong(s3);
	        musicPlayer.addSong(s4);
	        musicPlayer.addSong(s5);
	        musicPlayer.addSong(s6);
	        musicPlayer.addSong(s7);
	        musicPlayer.addSong(s8);
	        musicPlayer.addSong(s9);
	        musicPlayer.addSong(s10);
	       
	       
	        
	        while (true) {
	            System.out.println("\n========= MUSIC PLAYER MENU =========");
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
	            System.out.print("Enter your choice: ");

	            System.out.println();
	            System.out.println();
	            
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline
	            	
	            switch (choice) {
	                case 1:
	                    // add a new song 
	                	Song song2=tip.inputforaddingsong();
	                	musicPlayer.addSong(song2);
	                    break;
	                case 2:
	                    //  Update Existing Song
	                	System.out.println("enter the songName/title  which you need to Update");
	                	String string=sc.nextLine();
	                	musicPlayer.updateSong(string, tip.inputforaddingsong());
	                	
	                    break;
	                case 3:
	                    // Delete Song
	                	System.out.println("enter the songName/title  which you need to delete");
	                	musicPlayer.deleteSong(sc.nextLine());
	                    break;
	                case 4:
	                    // Display All Songs
	                	musicPlayer.displayAllSongs();
	                    break;
	                case 5:
	                    // Create New Playlist
	                	System.out.println("enter new playlist Name");
	             
	                	musicPlayer.createPlaylist(sc.nextLine());
	                    break;
	                case 6:
	                    // Add Song to Playlist
	                	System.out.println("add song to the playlist");
	                	System.out.println("Enter the playlist name");
	                	musicPlayer.addSongToPlaylist(sc.nextLine(), tip.inputforaddingsong());
	                    break;
	                case 7:
	                    // Display All Playlists
	                	System.out.println("All playlists");
	                	musicPlayer.displayAllPlayLists();
	                    break;
	                case 8:
	                    // Display Songs in Playlist
	                	System.out.println("Enter the playListName");
	                	musicPlayer.getPlayList(sc.nextLine());
	                    break;
	                case 9:
	                    // Play Song in Playlist
	                	System.out.println("Enter the playlist Name");
	                	String playlistnameString=sc.nextLine();
	                	System.out.println("playing song from the playist" +playlistnameString);
	                	musicPlayer.playPlaylist(playlistnameString);
	                    break;
	                case 10:
	                    // Pause Song in Playlist
	                	musicPlayer.pauseplaylist();
	                    break;
	                case 11:
	                    // Stop Song in Playlist
	                	musicPlayer.stopPlaylist();
	                    break;
	                
	                case 12:
	                    System.out.println("Exiting Music Player. Goodbye!");
	                    sc.close();
	                    return; // or use System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
		
		
	}

}
