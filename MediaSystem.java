package med;

import java.io.*;
import java.util.*;
public class MediaSystem  {

	
	
	public static void main(String[] args) throws Exception {
		Scanner inp=new Scanner(System.in);
		System.out.println("1.Songs");
		System.out.println("2.Movies");
		int ch=inp.nextInt();
		switch(ch)
		{
		case 1:
		{
			
			BufferedReader in = read("song.txt");
			List<songs> obj= new ArrayList<songs>();
			String str;
			int k=0;
			int flag=1;
			
			while((str = in.readLine()) != null)
	        {
	        	List<String> list = new ArrayList<String>();
	            list.add(str);
	            String[] stringArr = list.toArray(new String[0]);
	            String[] words=stringArr[0].split(",");
	            int l=words.length;
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
			//in.close();  
			 ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("songsSerialized.dat"));  
			 
			 for(int i=0 ; i<k ; i++)
			 {
				 out.writeObject(obj.get(i));  
			 }
			 out.flush();
			 ObjectInputStream input=new ObjectInputStream(new FileInputStream("songsSerialized.dat"));  
			 songs sin; 
			 int c=0;
			 	List<songs> objdec=new ArrayList<songs>();
				write(obj,k);
				System.out.println("Encryption:");
				outputstream test=new outputstream("test.txt");
				test.write(obj, k);
				inputstream t1=new inputstream("test.txt");
				objdec=t1.read();
				System.out.println("Decryption:");
				for(int i=0 ; i<10 ; i++)
				{
					System.out.println(objdec.get(i).getTitle()+" "+objdec.get(i).getMoviename());
				}
			 System.out.println("List of songs:");
			 while((sin=(songs)input.readObject())!=null) 
			 {
				 System.out.println("Song-"+c);
				 System.out.println("Song Title:"+sin.getTitle());
				 System.out.println("Artist:"+sin.getArtist());
				 System.out.println("Year of release:"+sin.getYear());
				 System.out.println("Genre:"+sin.getGenre());
				 System.out.println("Size:"+sin.getSize());
				 System.out.println("Rating:"+sin.getRating());
				 System.out.println("Duration(Mins):"+sin.getDuration());
				 System.out.println("Movie Name:"+sin.getMoviename());
				 System.out.println("");
				 System.out.println("");
				 System.out.println("");
				 c++;
				 if(c==k)
				 {
					 break;
				 }
				 
			 }
			  
			HashMap<String,String> songmapg=new HashMap<String,String>();
			List<media> al=new ArrayList<media>();
			
			
			for(int i=0 ; i<k ; i++)
			{
				 al.add(obj.get(i));
			}
			Collections.sort(al);
			System.out.println("No. of songs do you want to sort?");
			int nos=inp.nextInt();
			int sg=0;
			for(media s:al)
			{
				if(sg<nos)
				{
					System.out.println(s.getTitle()+" "+s.getRating());
					sg++;
				}
					
			}
			for(int i=0 ; i<k ; i++)
			{
				songmapg.put(obj.get(i).getTitle(),obj.get(i).getGenre());
			}
			System.out.println("Which genre?");
			String genre=inp.next();
			for(Map.Entry m:songmapg.entrySet()){
				if(m.getValue().equals(genre))
					System.out.println(m.getKey()+" "+m.getValue());
				    
			}
			HashMap<String,String> songsmapm=new HashMap<String,String>();
			for(int i=0 ; i<k ; i++)
			{
				songsmapm.put(obj.get(i).getTitle(),obj.get(i).getMoviename());
			}
			System.out.println("Songs of which movie do you want?");
			String movie=inp.next();
			for(Map.Entry m:songsmapm.entrySet()){
				if(m.getValue().equals(movie))
					System.out.println(m.getKey()+" "+m.getValue());
				    
			}
			System.out.println("No. of songs:"+k);
			System.out.println("Change rating-Enter Song:");
			String song=inp.next();
			for(int i=0 ; i<k ; i++)
			{
				if(obj.get(i).getTitle().equals(song))
				{
					System.out.println("Enter rating:");
					int rate=inp.nextInt();
					System.out.println("Rating of the song is changed from "+obj.get(i).getRating()+" to "+rate);
					obj.get(i).setRating(rate);
					break;
				}
			}
			
			
			break;
			
			
		}
		case 2:
			{
				
					BufferedReader inpot = new BufferedReader(new FileReader("movie.txt"));
				
				List<movies> objm= new ArrayList<movies>();
				int k = 0;
				int flag = 1;
				String str;
				while((str = inpot.readLine()) != null)
		        {
		        	List<String> list = new ArrayList<String>();
		            list.add(str);
		            String[] stringArr = list.toArray(new String[0]);
		            String[] words=stringArr[0].split(",");
		            int l=words.length;
		            int p=0;
		            if(flag==1)
		            {
		            	flag=0;
		            	continue;
		            }
		            else
		            	objm.add(new movies(words[p++],words[p++],Integer.parseInt(words[p++]),words[p++],Double.parseDouble(words[p++]),Integer.parseInt(words[p++]),words[p++],words[p++],words[p++],words[p++]));
		            k++;
		        }
				//in.close();
				System.out.println("Encryption:");
				objectstreamMovies test=new objectstreamMovies("test1.txt");
				test.write(objm, k);
				inputstreamMovies t1=new inputstreamMovies("test1.txt");
				movies[] objdecm=new movies[100];
				objdecm=t1.read();
				System.out.println("Decryption:");
				for(int i=0 ; i<10 ; i++)
				{
					System.out.println(objdecm[i].getTitle()+" "+objdecm[i].getArtist());
				}
				 ObjectOutputStream out1=new ObjectOutputStream(new FileOutputStream("moviesSerialized.dat"));  
				 
				 for(int i=0 ; i<k ; i++)
				 {
					
					out1.writeObject(objm.get(i));  
				 }
				 out1.flush();
				 ObjectInputStream input1=new ObjectInputStream(new FileInputStream("moviesSerialized.dat"));  
				 movies min; 
				 int c = 0;
				 System.out.println("List of Movies:");
				 while((min=(movies)input1.readObject())!=null) 
				 {
					 System.out.println("Movie-"+c);
					 System.out.println("Movie Title:"+min.getTitle());
					 System.out.println("Movie Artist:"+min.getArtist());
					 System.out.println("Movie Year:"+min.getYear());
					 System.out.println("Movie Genre:"+min.getGenre());
					 System.out.println("Movie Size:"+min.getSize());
					 System.out.println("Movie Rating:"+min.getRating());
					 System.out.println("Movie Duration(Mins):"+min.getDuration());
					 System.out.println("Movie Director:"+min.director);
					 System.out.println("Movie Producer:"+min.getProducer());
					 System.out.println("Movie Certification:"+min.getCertification());
					 System.out.println("");
					 System.out.println("");
					 System.out.println("");
					 
					 c++;
					 if(c==k)
					 {
						 break;
					 }
					 
				 }
				  
				HashMap<String,String> moviemapg=new HashMap<String,String>();
				List<media> alm=new ArrayList<media>();
				
				
				for(int i=0 ; i<k ; i++)
				{
					 alm.add(objm.get(i));
				}
				Collections.sort(alm);
				System.out.println("No. of movies do you want to sort?");
				int nosm=inp.nextInt();
				int sgm=0;
				for(media s:alm)
				{
					if(sgm<nosm)
					{
						System.out.println(s.getTitle()+" "+s.getRating());
						sgm++;
					}
						
				}
				for(int i=0 ; i<k ; i++)
				{
					moviemapg.put(objm.get(i).getTitle(),objm.get(i).director);
				}
				System.out.println("Which director?");
				String directorm=inp.next();
				for(Map.Entry m:moviemapg.entrySet()){
					if(m.getValue().equals(directorm))
						System.out.println(m.getKey()+" "+m.getValue());
					    
				}
				System.out.println("Change rating-Enter Movie:");
				String moviem=inp.next();
				for(int i=0 ; i<k ; i++)
				{
					if(objm.get(i).getTitle().equals(moviem))
					{
						System.out.println("Enter rating:");
						int rate=inp.nextInt();
						System.out.println("Rating of the song is changed from "+objm.get(i).getRating()+" to "+rate);
						objm.get(i).setRating(rate);
						break;
					}
				}
				writeMovie(objm,k);
				
				break;
			}
		}
		
		
		
		
	}
	public static void write(List<songs> obj,int size) throws IOException
	{
		File f=new File("song.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write("Song,Movie Name,Artist,Year of Release,Genre,Size,Rating,Duration");
		bw.newLine();
		for(int i=0 ; i<size ; i++)
		{
			bw.write(obj.get(i).getTitle()+",");
			bw.write(obj.get(i).getMoviename()+",");
			bw.write(obj.get(i).getArtist()+",");
			String n=Integer.toString(obj.get(i).getYear());
			bw.write(n+",");
			bw.write(obj.get(i).getGenre()+",");
			String o=Double.toString(obj.get(i).getSize());
			bw.write(o+",");
			String fo=Integer.toString(obj.get(i).getRating());
			bw.write(fo+",");
			//System.out.println("njnjk");
			bw.write(obj.get(i).getDuration());
			
			bw.newLine();
		}
		bw.close();
	}
	public static BufferedReader read(String file) throws Exception
	{
		BufferedReader in=new BufferedReader(new FileReader(file));
		return in;
	}
	public static void writeMovie(List<movies> obj,int size) throws IOException
	{
		File f=new File("movie.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write("Movie,Artist,Year of Release,Genre,Size,Rating,Duration,Director,Producer,Certification");
		bw.newLine();
		for(int i=0 ; i<size ; i++)
		{
			bw.write(obj.get(i).getTitle()+",");
			bw.write(obj.get(i).getArtist()+",");
			String n=Integer.toString(obj.get(i).getYear());
			bw.write(n+",");
			bw.write(obj.get(i).getGenre()+",");
			String o=Double.toString(obj.get(i).getSize());
			bw.write(o+",");
			String fo=Integer.toString(obj.get(i).getRating());
			bw.write(fo+",");
			//System.out.println("njnjk");
			bw.write(obj.get(i).getDuration()+",");
			bw.write(obj.get(i).director+",");
			bw.write(obj.get(i).getProducer()+",");
			bw.write(obj.get(i).getCertification());
			
			bw.newLine();
		}
		bw.close();
	}

}
