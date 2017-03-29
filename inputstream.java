package med;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class inputstream {

	public String f;
	public inputstream(String f)
	{
		this.f=f;
	}
	public List<songs> read() throws Exception
	{
		List<songs> obj=new ArrayList<songs>();
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
            	obj.add(new songs(words[p++],words[p++],words[p++],Integer.parseInt(words[p++]),words[p++],Double.parseDouble(words[p++]),Integer.parseInt(words[p++]),words[p++]));
            k++;
        }
		return obj;
	}

}
