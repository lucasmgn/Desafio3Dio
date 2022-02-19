import java.util.Locale;
import java.util.Scanner; 

public class Desafio3Dio{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Qual o raio: ");
		
		double area;
		double raio = scan.nextFloat();

		area = 3.14159 * (Math.pow(raio,2));

		System.out.printf("A=%.4f\n", area);
	}

}
