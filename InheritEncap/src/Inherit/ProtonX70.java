package Inherit;



public class ProtonX70 extends proton{
	
	String drive, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX70() {
		this.model = "Proton 70";
		this.drive = "Auto driving service";
	}
	
	public void setRadio(String myradio) {
		this.radio = myradio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String myKey) {
		this.key = myKey;
	}
	
	public String getKey() { 
		return key;
	}
	
	class x70speed extends vehicle{ //superkeyword & polymorphism
		int maxSpeed = 320;
		int lowSpeed = 0;
		int limitSpeed = 300;

		public void display() { //superkeyword
			System.out.println("Max speed : " + maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  //polymorphism
			System.out.println("Broom Brooom");
		}
	}
	
	class x70Variant extends Variant{ 

		public void display() {
			System.out.println("Colour choosen is : " +matte1);
		}
	}

	
	public void printX70() {
		System.out.println("Model : " + model);
		System.out.println("Automatic service : " +drive);
		x70speed s = new x70speed(); //superkeyword
		x70Variant v = new x70Variant(); 
		s.display();
		s.sound();
		v.display();
	}
	
}
