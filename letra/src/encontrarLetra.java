import java.util.Scanner;
public class encontrarLetra {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int contador=0,n=0,longitud;
		char letra;
		String palabra;
		System.out.println("Introduzca una palabra");
		palabra=S.nextLine();
		System.out.println("Introduzca una letra");
		letra=S.next().charAt(0);
		longitud=palabra.length();
		if(longitud>0) {
			do {
				if(palabra.charAt(n)==letra) {
					contador=contador+1;
				}
				n=n+1;
				longitud=longitud-1;
				
			}while(longitud>0);
		}
		System.out.println("El número de veces que aparece la letra en la palabra es"+contador);
	}

}
