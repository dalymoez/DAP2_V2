package Kurzaufgabe ;

public class Eratosthenes {

	public static void main(String[] args) {
			
		
		if(!isInteger(args[0]) || Integer.parseInt(args[0])<0) {
			System.out.println("Falscher Parameter! Nur Integer groesser 0 sind erlaubt."); 
		}else {
			boolean[] isPrime = new boolean[Integer.parseInt(args[0])];// das Fels isPrime ist Automatisch mit falsh aufgefüllt
			if (args.length==1) {
				Prime(isPrime);
			}
			else if (args.length == 2) {
			
				Prime(isPrime);
				for (int i = 0; i < isPrime.length; i++) {// man geht durch das Feld und prüft ,ob man sich in einen Primzahl
					if (args[1].equals("-o")) {				// befindet
						if (isPrime[i]) {
							System.out.print(i + " "); // Der Index jeder Primzahl wird angezeigt
						}
					}
				}
			
			}
			else {
				System.out.println("Falsche Parameteranzahl");
			}
	}
	}
	
	
	public static boolean isInteger (String tab) {           
		try 
		{ 
			Integer.parseInt(tab); 
			
		}  
		catch (NumberFormatException ex)  
		{ 
			return false ;
		} 
		return true ;
	}
	
	public static void Prime(boolean[] arr) {
		int count = 0;
		for (int i = 2; i < arr.length; i++) {// setzt alle inhalte auf true
			arr[i] = true;
		}

		for (int i = 2; i < arr.length; i++) {// Durchlauf des Felds erstmal um die value zu ueberprüfen
			for (int j = i + 1; j < arr.length; j++) {
				if (j % i == 0) {// Der Inhalt des Felds auf der Index j wird auf false gesetz

					arr[j] = false;

				}
			}
			if (arr[i]) // hier handelt es sich um einen Primzahl
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
