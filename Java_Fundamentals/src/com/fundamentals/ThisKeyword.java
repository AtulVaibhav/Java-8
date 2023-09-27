package com.fundamentals;


class Two_Wheeler{
	Two_Wheeler(){
		System.out.println("Value of this ="+this.hashCode());
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		Two_Wheeler two_Wheeler = new Two_Wheeler();
		System.out.println("Value of two_Wheeler ="+two_Wheeler.hashCode());
        
		Two_Wheeler two_Wheeler2 = new Two_Wheeler();
		System.out.println("Value of two_Wheeler2 ="+two_Wheeler2.hashCode());
        
	}

}

// VehicleData:modelNumber, vehicleName,  vehicleColor
 // show()


