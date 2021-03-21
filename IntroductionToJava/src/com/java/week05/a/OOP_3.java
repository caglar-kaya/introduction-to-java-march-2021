package com.java.week05.a;

import java.util.Arrays;

public class OOP_3 {

	public static void main(String[] args) {
		
		YoutubeVideo video1 = new YoutubeVideo();
		video1.videoName = "Relaxing Musics";
		for (int i = 0; i < 10; i++) {
			video1.dislike();
		}
		System.out.println("I like video 1 : " + video1.dislikeNumber);
		
		YoutubeVideo video2 = new YoutubeVideo();
		video2.videoName = "Data Types in Java";
		for (int i = 0; i < 20; i++) {
			video2.like();
		}
		System.out.println("I dislike video 2 : " + video2.likeNumber);
		
		String [] arr = {"Greate Video", "I hate it"};
		video1.comments = arr;
		
		String [] arr2 = {"Very Useful", "I don't understand"};
		video2.comments = arr2;
		
		System.out.println(Arrays.toString(video1.comments));
	}

}

class YoutubeVideo {
	//Attributes
	String [] comments = new String[2];
	int likeNumber, dislikeNumber;
	String videoName;
	
	//Methods
	void like() {
		likeNumber++;
	}
	
	void dislike() {
		dislikeNumber++;
	}
}






