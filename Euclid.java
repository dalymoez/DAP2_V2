package Kurzaufgabe;

public class Euclid {
public static void main (String[] args ) {
	if (!isInteger(args[0]) && !isInteger(args[1])) {
		System.out.println("Falscher Parameter - Nur Zahlen sind erlaubt!");
		
	}
	else {
		if(args.length!= 2 ) {
			System.out.println("Falsche Parameteranzahl! ");
			
		}
		else {
			if (Integer.parseInt(args[0])<0 || Integer.parseInt(args[1])<0) {
				System.out.println("Falscher Parameter - Nur Positive Zahlen sind erlaubt ");

			}
			else {
			System.out.println("Das ggT von "+ args[0] + " und "+ args[1]+" ist "+ Euclid(Integer.parseInt(args[0]),Integer.parseInt(args[1]))) ; 
		}
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
	public static int Euclid (int a, int b ) {
		if (b==0)	{
			return a ; 
		}
		else {
			return Euclid(b,a%b);
		}
	}
}
