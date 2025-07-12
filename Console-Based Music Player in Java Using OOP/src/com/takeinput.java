package com;
import java.util.Scanner;
public class takeinput {
	
	 Scanner sc=new Scanner(System.in);
	public Song inputforaddingsong() {
		
		// TODO Auto-generated method stub
		System.out.print("add songId: ");
		int songId = sc.nextInt();
		sc.nextLine(); // consume the leftover newline

		System.out.print("add title: ");
		String title = sc.nextLine();

		System.out.print("add artistName: ");
		String artist = sc.nextLine();

		System.out.print("add duration: ");
		double duration = sc.nextDouble();
    	return new  Song(songId,title,artist,duration);	
    	

	}
}
