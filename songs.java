package med;

public class songs extends media{

	private String moviename;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public songs(String title,String moviename,String artist,int year,String genre,double size,int rating,String duration)
	{
		super(title,artist,year,size,rating,duration,genre);
		this.moviename=moviename;
	}
	

}
