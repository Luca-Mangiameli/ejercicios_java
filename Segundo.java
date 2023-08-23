public class Segundo {

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
            
			if (Primo(i)) {
            System.out.println(i + " primo");
        } 	
			else {
            System.out.print(i + " no es primo. Sus divisores son");
            Divisores(i);
            System.out.println();
        }
    }
}


public static boolean Primo(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

public static void Divisores(int num) {
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            System.out.print(i + " ");
        }
    }
}


	}
