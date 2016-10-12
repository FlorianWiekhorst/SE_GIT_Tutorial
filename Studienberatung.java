import java.util.*;

public class Studienberatung{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.next();
		if (antwort.equalsIgnoreCase("n"){
			
			System.out.println("Hast du Fachabitur?");
			String antwort = scanner.next();
		}
		else{
			System.out.println("Bist du wissbegierig?");
			String antwort = scanner.next();

		}
	}
}