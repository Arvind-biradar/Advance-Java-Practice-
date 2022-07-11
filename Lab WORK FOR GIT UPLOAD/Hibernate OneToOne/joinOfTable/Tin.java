package joinOfTable;
import javax.persistence.*;


@Entity
@Table(name="tbl_tin")
public class Tin {

	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tin")
	private int tin;
	
	private String stateCode;

	public int getTin() {
		return tin;
	}

	public void setTin(int tin) {
		this.tin = tin;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
}
