package oneToMany;



import javax.persistence.*;


@Entity
@Table(name="songs")
public class Song {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int no;
	
	private String songName;
	private float songDuration;
	private String singerName;
	
	@ManyToOne
	@JoinColumn(name="albumId")
	private Album album;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public float getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(float songDuration) {
		this.songDuration = songDuration;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
	
	
	
	
}
