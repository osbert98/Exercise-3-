package Inherit;

public class mainProton {

	public static void main(String[] argrs) {
		
		proton p = new proton();
		
		ProtonX50 p1 = new ProtonX50();
		ProtonPesona p2 = new ProtonPesona();
		ProtonSaga p3 = new ProtonSaga();
		ProtonX70 p4 = new ProtonX70();
		
		
		System.out.println("\nProtonX50");
		
		p1.printProton();
		p1.setRadio("Alpine");
		System.out.println("Type of key: " + p1.getKey());
		System.out.println("Radio brand: " + p1.getRadio());
		p1.printX50();
		
		
		System.out.println("\nProtonPesona ");
		
		p2.printProton();
		p2.setRadio("Kenwood");
		System.out.println("Radio brand: " + p2.getRadio());
		System.out.println("Type of key: " + p2.getKey());
		p2.printPesona();
		p2.run();
		
		
		
		System.out.println("\nProton Saga");
		
		
		p3.printProton();
		p3.setRadio("Pioneer");
		System.out.println("Type of key: " + p3.getKey());
		System.out.println("Radio brand: " + p3.getRadio());
		p3.printSaga();
		
		
		System.out.println("\nProtonX70");
		
		
		p4.printProton();
		p4.setRadio("Edifier");
		System.out.println("Type of key: " + p4.getKey());
		System.out.println("Radio brand: " + p4.getRadio());
		p4.printX70();
		
		
	}
}
