package roadmap;

public class Type_casting {
	 public static void main(String[] args) {
		
		// convertir entero a double 
		 System.out.println("Entero a double");
		    int num1 = 50;

		    System.out.println("Valor entero: " + num1);

		    double data1 = num1;

		    System.out.println("Valor double: " + data1);
		    
		 // convertir double a entero 
		    System.out.println("Double a entero");		   

		    double num2 = 50.55;

		    System.out.println("Valor double: " + num2);

		    int data2 = (int)num2;

		    System.out.println("Valor entero: " + data2);
		    
		 // convertir entero a String
		    System.out.println("entero a String");

		    int num3 = 50;

		    System.out.println("Valor entero: " + num3);

		    String data3 = String.valueOf(num3);

		    System.out.println("Valor String: " + data3);
		    
		 // convertir String a entero
		    
		    System.out.println("String a entero");    

		    String data4 = "50";

		    System.out.println("Valor String: " + data4);


		    int num4 = Integer.parseInt(data4);

		    System.out.println("Valor entero: " + num4);
		  }

}
