package com.solo.quiz.crawling;

public class SongVO {

	String title;
	String artist;
	
	public SongVO(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "SongVO [title=" + title + ", artist=" + artist + "]";
	}	
	
	
}
