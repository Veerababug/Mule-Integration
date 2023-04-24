package forloop_java;

public class for__java {
	public static void main(String []args ) {
		
//		for(initialisation:    condition ;               iteration;) {
//			
//		}
		
		for(int i=0;i<=5;i++) {
			System.out.println("Print the two table      "+"5  X"+   i+" = "+(5*i));
			for(int j=1;j<=5;j++) {
				System.out.println("Internal loop is running   "+j);
			}
		}
		
		
	}

}
