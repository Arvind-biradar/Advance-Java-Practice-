package bidirectionalJoin;
import javax.persistence.*;


@Entity
@Table(name="functions")
public class Function {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fun_id ;
	private int batteryWarranty ;
	private int batteryEnergyCapacity ;
	private int batteryAcCharging ;
	private int batteryDcCharging ;
	
	@OneToOne
	@JoinColumn(name="CarID")
	private Cars cars ;                    //Use this for join table like Function.cars

	public int getFun_id() {
		return fun_id ;
	}

	public void setFun_id(int fun_id) {
		this.fun_id = fun_id;
	}

	public int getBatteryWarranty() {
		return batteryWarranty;
	}

	public void setBatteryWarranty(int batteryWarranty) {
		this.batteryWarranty = batteryWarranty;
	}

	public int getBatteryEnergyCapacity() {
		return batteryEnergyCapacity;
	}

	public void setBatteryEnergyCapacity(int batteryEnergyCapacity) {
		this.batteryEnergyCapacity = batteryEnergyCapacity;
	}

	public int getBatteryAcCharging() {
		return batteryAcCharging;
	}

	public void setBatteryAcCharging(int batteryAcCharging) {
		this.batteryAcCharging = batteryAcCharging;
	}

	public int getBatteryDcCharging() {
		return batteryDcCharging;
	}

	public void setBatteryDcCharging(int batteryDcCharging) {
		this.batteryDcCharging = batteryDcCharging;
	}

	public Cars getCars() {
		return cars;
	}

	public void setCars(Cars cars) {
		this.cars = cars;
	}
	
	
	
}
