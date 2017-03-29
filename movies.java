package med;


public class movies extends media {
	String director;
	private String producer;
	private String certification;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	
	public movies(String title,String artist,int year,String genre,double size,int rating,String duration,String director,String producer,String certification)
	{
		super(title,artist,year,size,rating,duration,genre);
		this.director=director;
		this.producer=producer;
		this.certification=certification;
	}

	
}
