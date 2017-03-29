package med;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class inputstreamMovies {

	public String f;
	public inputstreamMovies(String f)
	{
		this.f=f;
	}
	public movies[] read() throws Exception
	{
		movies objm[]=new movies[100];
		BufferedReader inpot = new BufferedReader(new FileReader(f));
		
		
		String str;
		int k=0;
		int flag=1;
		
		while((str = inpot.readLine()) != null)
        {
        	List<String> list = new ArrayList<String>();
        	int l=str.length();
        	String abc=str.substring(0,l-2);
            list.add(abc);
            
            String[] stringArr = list.toArray(new String[0]);
            String[] words=stringArr[0].split(",");
            int l1=words.length;
            int p=0;
            if(flag==1)
            {
            	flag=0;
            	continue;
            }
            else
            	objm[k]=new movies(words[p++],words[p++],Integer.parseInt(words[p++]),words[p++],Double.parseDouble(words[p++]),Integer.parseInt(words[p++]),words[p++],words[p++],words[p++],words[p++]);
            k++;
        }
		return objm;
	}

}
