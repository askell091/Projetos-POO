// 17.08.26

package br.edu.Principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, rua, bairro, cpf, cep, complemento, 
		cidade, uf, dataNascimento, numero, idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Insira o nome da rua: ");
		rua = sc.nextLine();

		System.out.print("Insira o número da casa: ");
		numero = sc.nextLine();

		System.out.print("Insira o nome do bairro: ");
		bairro = sc.nextLine();
		
		System.out.print("Insira o complemento: ");
		complemento = sc.nextLine();
		
		System.out.print("Insira o CEP da rua: ");
		cep = sc.nextLine();
		
		System.out.print("Insira o nome da cidade: ");
		cidade = sc.nextLine();
		
		System.out.print("Insira o nome do Estado: ");
		uf = sc.nextLine();
		
		System.out.print("Insira o CPF: ");
		cpf = sc.nextLine();
		
		System.out.print("Insira sua data de nascimento: ");
		dataNascimento = sc.nextLine();
		
		System.out.print("Insira sua idade: ");
		idade = sc.nextLine();
		
		System.out.println("\nNome: " + nome);
		System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + complemento + ", " + cep  + ", " + cidade + "-" + uf);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Idade: " + idade);
	}

}