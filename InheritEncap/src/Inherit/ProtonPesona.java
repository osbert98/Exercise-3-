package Inherit;


public class ProtonPesona extends proton{
	
	
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
	
	class pesonaSpeed extends vehicle{ //superkeyword & polymorphism
		int maxSpeed = 180;
		int lowSpeed = 0;
		int limitSpeed = 120;

		public void display() { //superkeyword
			System.out.println("Max speed : " + super.maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  //polymorphism
			System.out.println("vrooooooom");
		}
	}
	
	class pesonaVariant extends Variant{ 

		public void display() {
			System.out.println("Colour choosen is : " +matte4);
		}
	}
	
	
	
	public void printPesona() {
		
		System.out.println("Big Space");
		pesonaSpeed S = new pesonaSpeed(); //superkeyword
		pesonaVariant V = new pesonaVariant(); 
		S.display();
		V.display();
		
	}
	}