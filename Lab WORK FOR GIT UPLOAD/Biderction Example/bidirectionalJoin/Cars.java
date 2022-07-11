package bidirectionalJoin;

import javax.persistence.*;


@Entity
@Table(name="cars")
public class Cars {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int car_id;
	
	private String brand;
	private String model;
	private int modelYear;
	private String owner;
	
	

	@OneToOne(mappedBy="cars",cascade=CascadeType.PERSIST)
	private Function function;

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
