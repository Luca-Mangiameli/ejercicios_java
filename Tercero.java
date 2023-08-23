import java.util.Scanner;

public class tercero {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("ingrese un numero");
	            numero = scanner.nextInt();

	            if (numero > 100 && Primo(numero)) {
	                System.out.println(numero + " es mayor a 100 y primo");
	                break;
	            } 
	            else if (numero > 100) {
	                System.out.println(numero + " es mayor a 100, pero no es primo");
	            } else {
	                System.out.println("no es mayor a 100");
	            }
	        } while (true);

	        scanner.close();

	}
	
	  public static boolean Primo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
