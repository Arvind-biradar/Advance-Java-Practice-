


/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/



package bidirectionalJoin;

import java.util.List;

public class CarFunction {

	public static void main(String[] args) {
		
		
		Cars c=new Cars();
//		c.setBrand("Renault");
//	    c.setModel("Zeo");
//	    c.setModelYear(2015);
//	    c.setOwner("Aniket");

	    Function f =new Function();
//	    f.setBatteryWarranty(5);
//	    f.setBatteryEnergyCapacity(40);
//	    f.setBatteryAcCharging(25);
//	    f.setBatteryDcCharging(30);
		
//		c.setFunction(f);
//        f.setCars(c);
        Dao deo=new Dao();
//        deo.add(c);
//        List<Cars> c1=deo.getCarName("Ankit");
//        for(Cars c2:c1) {
//        	System.out.println(" "+c2.getBrand()+" "+c2.getModel()+" "+c2.getModelYear());
//        }
//        
//        List<Function> c1=deo.getCarDetailsByCarID(3);
//        for(Function f2:c1) {
//        	System.out.println(" "+f2.getBatteryAcCharging()+" "+f2.getBatteryDcCharging()+" "+f2.getBatteryEnergyCapacity()+" "+f2.getBatteryEnergyCapacity());
//        }
        List<Cars> c1=deo.getCarSubString("l");
      for(Cars c2:c1) {
      	System.out.println(" "+c2.getBrand()+" "+c2.getModel()+" "+c2.getModelYear());
      }
        
	}

}
