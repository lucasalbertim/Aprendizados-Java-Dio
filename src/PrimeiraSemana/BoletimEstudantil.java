package PrimeiraSemana;
import java.util.Scanner;


public class BoletimEstudantil {
	public static void main(String[] args) {
		try (Scanner nota = new Scanner(System.in)) {
			int mediaFinal;
			System.out.println("DIGITE A MEDIA ");
			mediaFinal = nota.nextInt();		
			if (mediaFinal < 6)
				System.out.println("REPROVADO");
			else if (mediaFinal == 6)
				System.out.println("PROVA FINAL");
			else
				System.out.println("APROVADO");
		}
	}
}
