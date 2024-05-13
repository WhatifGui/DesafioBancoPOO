import java.util.Locale;
import java.util.Scanner;

	public class Main{
		public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			Scanner sc =  new Scanner(System.in);
			
			
			double b, h, area, perimetro, diagonal;
			
			
			System.out.println("Digite o valor da base: ");
			b = sc.nextDouble();
			System.out.println("Digite o valor da altura: ");
			h = sc.nextDouble();
			sc.close();
			
			
			area = b * h;
			perimetro = (2 * b)+ (2 * h);
			diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
			
			
			System.out.println("AREA = "+ area);
			System.out.println("PERIMETRO = "+ String.format("%.2f", perimetro));
			System.out.println("DIAGONAL ="+ String.format("%.2f", diagonal));
			
			
			
		}
	}