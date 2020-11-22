package Inherit;


public class ProtonSaga extends proton{
	
	
	private String radio;
	private String key="Standard Key";
	
	
	
	
	public void setRadio(String newRadio) {
		radio = newRadio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String newKey) {
		key = newKey;
	}
	
	public String getKey() {
		return key;
	}
	
	class sagaSpeed extends vehicle{ //superkeyword & polymorphism
		int maxSpeed = 180;
		int lowSpeed = 0;
		int limitSpeed = 120;

		public void display() { //superkeyword
			System.out.println("Max speed : " + super.maxSpeed + "km/h");
		}
		
		public void  sound() {  //polymorphism
			System.out.println("Sound fast vrooooooooooooooooooooooooooooooooooooooom shiuuuuu!");
		}
	}
	
	class sagaVariant extends Variant{ 

		public void display() {
			System.out.println("Colour choosen is : " +matte3);
		}
	}
	
	
	
	public void printSaga() {
		
		System.out.println("Fuel Save");
		sagaSpeed S = new sagaSpeed(); //superkeyword
		sagaVariant V = new sagaVariant(); 
		S.display();
		S.sound();
		V.display();
		
	}
	

	//method overloading
	void sum(int base, long standard)
	{
		System.out.println(base);
	}
}
