package aula2;

public class TesteDentista {

	public static void main(String[] args) {
		
		 	Dentista dentista1 = new Dentista("Kabbie", 18);
		 	Dentista dentista2 = new Dentista("Kabbie", 18);
		    Dentista dentista3 = new Dentista("Bernardo", 51);
		    
		    System.out.println("\n hashcode1 = " + dentista1.hashCode());
		    System.out.println("\n hashcode2 = " + dentista2.hashCode());
		    System.out.println("\n hashcode3 = " + dentista3.hashCode());

		    System.out.println("\n Dentista 1 e 2 são iguais?(True) : " + dentista1.equals(dentista2));
		    System.out.println("\n Dentista 2 e 3 são iguais?(False) : " + dentista2.equals(dentista3));

		    System.out.println("\n Dentista 1 String: " + dentista1.toString());
		    System.out.println("\n Dentista 2 String: " + dentista2.toString());
		    System.out.println("\n Dentista 3 String: " + dentista3.toString());


	}

}
