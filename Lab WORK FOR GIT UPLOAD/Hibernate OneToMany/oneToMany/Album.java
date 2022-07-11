package oneToMany;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="album")
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    
    private String albumName;
    private int releaseYear;
    private String music;
    
    
    @OneToMany(mappedBy="album",cascade=CascadeType.PERSIST)
	private List<Song> song;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getMusic() {
		return music;
	}


	public void setMusic(String music) {
		this.music = music;
	}


	public List<Song> getSong() {
		return song;
	}


	public void setSong(List<Song> song) {
		this.song = song;
	} 
	
	
	
}
