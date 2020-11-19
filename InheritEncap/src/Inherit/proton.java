package Inherit;

class vehicle{
	int maxSpeed=220;
	int minSpeed=0;
	int averageSpeed=80;
	
	public void sound() {
		
		System.out.println("The sounds go vroooooooooooooooooooooooooooooooooooooooooooooooooooooom!");
	}
	
} 
class Variant{
	
	String matte1 = "Matte Red";
	String matte2 = "Matte Black";
	String matte3= "Matte Blue";
	String matte4= "Matte Green";
}

public class proton  {
	
	String tyre, windows, headlight;
	
	proton(){
		
		this.tyre= "Rubber";
	
		this.windows = "Durable Glass";
	}
	
	proton(String h){
		
		this.headlight=h;
	}
	
	public void printProton() {
		
		System.out.println("Tyre: "+this.tyre);
		System.out.println("Windows: "+this.windows);
		
		proton h1 = new proton("Bright Yellow");
		System.out.println("Headlight: "+h1.headlight);

	}
	void run() {
		
		System.out.println("Vehicle is running");
	}
	
	
}
	

