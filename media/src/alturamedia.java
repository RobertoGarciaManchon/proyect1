import java.util.Scanner;
public class alturamedia {

	public static void main(String[] args) {
	double[] altura=new double[10];
	double suma=0, media=0,mayorAltura=0,menorAltura=3;
	Scanner S=new Scanner(System.in);
	
	for (int i=0; i<10; i++) {
		System.out.println("Introduzca una altura");
		altura[i]=S.nextDouble();
		suma=suma+altura[i];
	}
	media=suma/10;
	
	for(int i=0;i<10;i++) {
		if(altura[i]>mayorAltura) {
			mayorAltura=altura[i];
		}
		if(altura[i]<menorAltura){
			menorAltura=altura[i];
			
		}
		
	}
	System.out.println(media);
	System.out.println(mayorAltura);
	System.out.println(menorAltura);
	
	}

}
