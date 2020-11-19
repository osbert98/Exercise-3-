package Inherit;

public class ProtonX50 extends proton{
	
	String park, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX50() {
		this.model = "Proton X50";
		this.park = "Self parking service";
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
	
	class x50speed extends vehicle{ //superkeyword & polymorphism
		int maxSpeed = 260;
		int lowSpeed = 0;
		int limitSpeed = 250;

		public void display() { //superkeyword
			System.out.println("Max speed : " + maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  //polymorphism
			System.out.println("Vrooooooooooom");
		}
	}
	
	class x50Variant extends Variant{ 

		public void display() {
			System.out.println("Colour choosen is : " +matte2);
		}
	}

	
	public void displayX50() {
		System.out.println("Model : " + model);
		System.out.println("Auto parking assist : " + park);
		x50speed s = new x50speed(); //superkeyword
		x50Variant v = new x50Variant(); 
		s.display();
		s.sing("sing");
		
		v.display();
	}
	
}
