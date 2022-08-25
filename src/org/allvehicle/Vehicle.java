package org.allvehicle;
import org.twowheeler.TwoWheller;
import org.threewheeler.ThreeWheeler;
public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("Engine");
		
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		TwoWheller t=new TwoWheller();
		ThreeWheeler r=new ThreeWheeler();
		v.VehicleNecessery();
		t.Bike();
		t.Cycle();
		r.Auto();
	}
}
