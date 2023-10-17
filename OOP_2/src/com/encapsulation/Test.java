package com.encapsulation;

class ATMCard{
	private final int secretPin = 3432;
	
//	public void setPin(int pin){
//		this.secretPin = pin;
//	}
	public int getPin(){
		return secretPin;
	}
}


public class Test {

	public static void main(String[] args) {
		ATMCard card = new ATMCard();
//		System.out.println(card.secretPin);
//		card.secretPin = 9879;
		System.out.println(card.getPin());
		
		//card.setPin(9870);
		System.out.println(card.getPin());

	}

}
