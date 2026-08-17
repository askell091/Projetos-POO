// 17.08.26

package br.edu.Principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome;
		double n1, n2, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome  : ");
		nome = sc.next();
		
		System.out.print("Insira sua nota 1: ");
		n1 = sc.nextDouble();

		System.out.print("Insira sua nota 2: ");
		n2 = sc.nextDouble();		

		media = (n1+n2)/2;
		
		System.out.println("Nome: " + nome);
		System.out.println("Nota: " + media);
	}

}