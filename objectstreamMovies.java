package med;

import java.io.FileOutputStream;
import java.util.List;


public class objectstreamMovies {

	public String f;
	public objectstreamMovies(String f)
	{
		this.f=f;
	}
	public void write(List<movies> obj,int size) throws Exception
	{
		FileOutputStream fout=new FileOutputStream(f);
		for(int i=0 ; i<size ; i++)
		{
			String s=obj.get(i).getTitle()+","+obj.get(i).getArtist()+","+obj.get(i).getYear()+","+obj.get(i).getGenre()+","+obj.get(i).getSize()+","+obj.get(i).getRating()+","+obj.get(i).getDuration()+","+obj.get(i).director+","+obj.get(i).getProducer()+","+obj.get(i).getCertification();
			s=s+"MoviesAreenrcryptedENCRYPTION!!!"+'\n';
			byte b[]=s.getBytes();
			fout.write(b);
			
			
		}
		fout.close();
		
	}

}



