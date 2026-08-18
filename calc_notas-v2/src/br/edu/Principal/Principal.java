// 18.08.26

package br.edu.Principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome;
		double n1, n2, af, media, m_final;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome  : ");
		nome = sc.next();
		
		System.out.print("Insira sua nota 1: ");
		n1 = sc.nextDouble();

		System.out.print("Insira sua nota 2: ");
		n2 = sc.nextDouble();		

		media = (n1+n2)/2;
		
		System.out.println("Nome: " + nome);
		System.out.println("Media: " + media);
		
		if (media >= 6) {
			System.out.println("Situação: Aprovado");
		}
		
		else if (media >=3) {	
			System.out.print("Insira a nota da AF: ");
			af = sc.nextDouble();
			
			m_final = (af+media)/2;
			
			if (m_final >= 5) {
				System.out.println("Media Final: " + m_final);
				System.out.println("Situação: Aprovado na Recuperação");
			}
			
			else {
				System.out.println("Media Final: " + m_final);
				System.out.println("Situação: Reprovado na Recuperação");
			}
		}
		
		else {
			System.out.println("Situação: Reprovado");
		}
	}

}