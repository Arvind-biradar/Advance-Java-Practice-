package joiningOfTable;
import javax.persistence.*;

@Entity
@Table(name="state")
public class state {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stateno")
	private int stateNo;
	
	
	private String stateName;
	
	
	@OneToOne
	@JoinColumn(name="statepin")
	private population statePin;

	
	
	public int getStateNo() {
		return stateNo;
	}


	public void setStateNo(int stateNo) {
		this.stateNo = stateNo;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public population getStatePin() {
		return statePin;
	}


	public void setStatePin(population statePin) {
		this.statePin = statePin;
	}


	
	
	
}
