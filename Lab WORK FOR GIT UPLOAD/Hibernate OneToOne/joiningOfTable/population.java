package joiningOfTable;

import javax.persistence.*;

@Entity
@Table(name="population")
public class population {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="statepin")
	private int statePin;
	

	@Column(name="population")
	private int popul;

	@Column(name="food")
	private String food ;

	public int getStatePin() {
		return statePin;
	}


	public void setStatePin(int statePin) {
		this.statePin = statePin;
	}


	public int getPopulation() {
		return popul;
	}


	public void setPopulation(int population) {
		this.popul = population;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}
	
	

}
