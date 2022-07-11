package joinOfTable;
import javax.persistence.*;


@Entity
@Table(name="tbl_state")
public class State {

	@Id
	@Column(name="srno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)   // Auto generation of no.
	private int no;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.PERSIST)  //Automatic data inserted in TIn table without calling add
	@JoinColumn(name="tin")
	private Tin tin;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tin getTin() {
		return tin;
	}

	public void setTin(Tin tin) {
		this.tin = tin;
	}
	
	
}
