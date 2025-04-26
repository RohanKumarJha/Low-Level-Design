package Main;

import com.pattern.Vehicle.Alto;
import com.pattern.Vehicle.Audi;
import com.pattern.Vehicle.Bus;
import com.pattern.Vehicle.Mercedes;
import com.pattern.Vehicle.Scarpio;
import com.pattern.Vehicle.Thar;

public class Main {

	public static void main(String[] args) {
		Bus obj1 = new Bus();
		obj1.drive();
		
		Alto obj2 = new Alto();
		obj2.drive();
		
		Scarpio obj3 = new Scarpio();
		obj3.drive();
		
		Audi obj4 = new Audi();
		obj4.drive();
		
		Mercedes obj5 = new Mercedes();
		obj5.drive();
		
		Thar obj6 = new Thar();
		obj6.drive();

	}

}
