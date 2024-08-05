package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		
		Driver driver1 = new Driver(1, 1290.35,"Lorry","Rakesh");
		Driver driver2 = new Driver(2, 1395.38,"Car","Harish");
		Driver driver3 = new Driver(3, 1119.57,"Auto","Sai");
		Driver driver4 = new Driver(4, 5980.99,"MotorBike","Srinu");
		Driver driver5 = new Driver(5, 1085.95,"Car","Johny");
		Driver driver6 = new Driver(6, 1590.35,"Flight","Swamy");
		Driver driver7 = new Driver(7, 1690.85,"Audi","Surendra");
		Driver driver8 = new Driver(8, 1890.55,"Benz","Chaitu");
		
		ArrayList<Driver> arrayList = new ArrayList<>();
		
		arrayList.add(driver1);
		arrayList.add(driver2);
		arrayList.add(driver3);
		arrayList.add(driver4);
		arrayList.add(driver5);
		arrayList.add(driver6);
		arrayList.add(driver7);
		arrayList.add(driver8);
		
		System.out.println(Travel.isCarDriver(driver2));
		
		System.out.println(Travel.RetrivebyDriverId(arrayList, 2));
		System.out.println(Travel.RetriveCountOfDriver(arrayList,"Car"));
		System.out.println(Travel.retriveDriver(arrayList, "Benz"));
		System.out.println(Travel.retriveMaximumDistanceTravelledDriver(arrayList));

	}

}
