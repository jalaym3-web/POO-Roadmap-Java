package roadmap;

public class Enums {
	
	public static void main(String[] args) {


	    System.out.println("El tamallo de la pizza es: " + Size.SMALL.getSize());
	  }
	enum Size{
		  SMALL, MEDIUM, LARGE, EXTRALARGE;

		  public String getSize() {

		    // this will refer to the object SMALL
		    switch(this) {
		      case SMALL:
		        return "pequeña";

		      case MEDIUM:
		        return "mediana";

		      case LARGE:
		        return "grande";

		      case EXTRALARGE:
		        return "extra grande";

		      default:
		        return null;
		      }
		   }

		  
		}
}
