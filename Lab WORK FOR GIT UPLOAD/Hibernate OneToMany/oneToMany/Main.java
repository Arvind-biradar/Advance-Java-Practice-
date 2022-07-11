package oneToMany;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		GenericDeo gd=new GenericDeo();
		Album a=new Album();
		/*a.setAlbumName("Aap ka Saroor");
		a.setMusic("HR Music");
		a.setReleaseYear(2007);
		gd.save(a);*/
		/*a.setAlbumName("Aashiqui 2");
		a.setMusic("T Series Music");
		a.setReleaseYear(2013);
		gd.save(a);*/
		
		
    	Album a1=(Album)gd.fetchById(Album.class, 1);
	    Song s=new Song();
		//List<Song> list=new ArrayList<Song>();
		/*s.setSingerName("Himesh Reshmiya");
		s.setSongDuration(4.55f);
		s.setSongName("Tera Suroor...");
		s.setAlbum(a1);
		gd.save(s);*/
		//list.add(s);
		
		s=new Song();
		s.setSingerName("Himesh Reshmiya");
		s.setSongDuration(4.2f);
		s.setSongName("Dil Ki Surkh Diwaro Pe...");
		s.setAlbum(a1);
		gd.save(s);
	//	list.add(s);
		
		/*s=new Song();
		s.setSingerName("Himesh Reshmiya & Sherya Ghoshal");
		s.setSongDuration(5.0f);
		s.setSongName("Jhoot Nahi Bolana ...");
		list.add(s);
		
		a.setSong(list);*/
	//Album a1=(Album)gd.fetchById(Album.class, 2);
	  //  Song s=new Song();
		/*//List<Song> list=new ArrayList<Song>();
		s.setSingerName("Arijeet Singh");
		s.setSongDuration(5.57f);
		s.setSongName("Tum Hi Ho...");
		s.setAlbum(a1);
		gd.save(s);
		s.setSingerName("Tulsi Kumar & Arijeet Singh");
		s.setSongDuration(4.5f);
		s.setSongName("Chahu Mai Aana...");
		s.setAlbum(a1);
		gd.save(s);*/
		
		/*s.setSingerName(" Arijeet Singh");
		s.setSongDuration(4.5f);
		s.setSongName("Milne Tujse ai Aayi...");
		s.setAlbum(a1);
		gd.save(s);*/
	    
	    //For Delete the song Add this and delete
		/*s.setSingerName("  Singh");
		s.setSongDuration(4.5f);
		s.setSongName(" Tujse ai Aayi...");
		s.setAlbum(a1);
		gd.save(s);*/		
		
	    gd.delete(Song.class,6);
	
		
	//	AlbumSong as =new AlbumSong();
		
		/*List<Song> list=as.fetchAllSOngByAlbumName("Aap Ka Saroor");
		for(Song s:list) {
			System.out.println(s.getNo()+" "+s.getSingerName()+" "+s.getSongDuration()+" "+s.getSongName());
		}*/
		

		/*List<Song> list1=as.fetchAllSongBYSIngerName("ar");
		for(Song s:list1) {
			System.out.println(s.getNo()+" "+s.getSingerName()+" "+s.getSongDuration()+" "+s.getSongName());
		}*/
		
		
	}

}
