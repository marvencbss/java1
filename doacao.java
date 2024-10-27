import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int Idade = teclado.nextInt();
		double Peso = teclado.nextDouble();
		String Jejum = teclado.next();
		String Documento = teclado.next();
		String Hepatite = teclado.next();
		String Malaria = teclado.next();
		
			if (Idade >= 16
					&& Idade <= 69 
					&& Peso > 50 
					&& Jejum.equalsIgnoreCase("YES") 
					&& Documento.equalsIgnoreCase("YES") 
					&& Hepatite.equalsIgnoreCase("NO") 
					&& Malaria.equalsIgnoreCase("NO")) {
				System.out.println("YES.");
			} else {
				System.out.println("NO.");
			}
		teclado.close();
	}
} 
