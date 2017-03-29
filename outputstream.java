package med;

import java.io.FileOutputStream;
import java.util.List;


public class outputstream 
{

	public String f;
	public outputstream(String f)
	{
		this.f=f;
	}
	public void write(List<songs> obj,int size) throws Exception
	{
		FileOutputStream fout=new FileOutputStream(f);
		for(int i=0 ; i<size ; i++)
		{
			String s=obj.get(i).getTitle()+","+obj.get(i).getMoviename()+","+obj.get(i).getArtist()+","+obj.get(i).getYear()+","+obj.get(i).getGenre()+","+obj.get(i).getSize()+","+obj.get(i).getRating()+","+obj.get(i).getDuration();
			s=s+"SongsAreEncrypted!!!"+'\n';
			byte b[]=s.getBytes();
			fout.write(b);
			
			
		}
		fout.close();
		
	}

}
