package med;

import java.io.Serializable;
public class media implements Comparable<media>,Serializable
{
	private String title;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	private String artist;
	private int year;
	private double size;
	private int rating;
	private String duration;
	private String genre;
	
	public media(String title,String artist,int year,double size,int rating,String duration,String genre)
	{
		this.title=title;
		this.artist=artist;
		this.duration=duration;
		this.genre=genre;
		this.rating=rating;
		this.size=size;
		this.year=year;
	}
	public int compareTo(media ob)
	{
		if(rating==ob.rating)
			return 0;
		else if(rating>ob.rating)
			return 1;
		else
			return -1;
	}

}
 