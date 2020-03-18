package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.Gerentes;
import entidades.Secretaria;
import entidades.Telefonista;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();

		System.out.println("Cadastrar Quantos Funcionários? ");
		int quantFunc = sc.nextInt();
		System.out.println("Tipo de funcionário: (1 - Gerente; 2 - Telefonista; 3-Secretaria.)");

		int tipo = sc.nextInt();

		for (int i = 0; i < quantFunc; i++) {
			switch (tipo) {
			case 1:
				System.out.println("Gerente: ");
				sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Salário: ");
				double salario = sc.nextDouble();
				System.out.println("Usuario: ");
				sc.nextLine();
				String usuario = sc.nextLine();
				System.out.println("Senha: ");
				int senha = sc.nextInt();
				list.add(new Gerentes(nome, salario, usuario, senha));
				break;
			case 2:
				System.out.println("Telefonista: ");
				sc.nextLine();
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Salário: ");
				salario = sc.nextDouble();
				System.out.println("Codigo da Estação: ");
				int cod_estacao = sc.nextInt();
				list.add(new Telefonista(nome, salario, cod_estacao));
				break;
			case 3:
				System.out.println("Secretaria: ");
				sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.println("Salário: ");
				salario = sc.nextDouble();
				System.out.println("Ramal: ");
				int numRamal = sc.nextInt();
				list.add(new Secretaria(nome, salario, numRamal));
				break;
			}

		}

		sc.close();
	}

}
