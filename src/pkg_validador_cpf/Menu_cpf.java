package pkg_validador_cpf;

import java.util.Scanner;

public class Menu_cpf {
	private static int para;

	public static void menu_cpf() {
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Olá! Digite seu cpf para validação: ");
			Scanner cpf_input = new Scanner(System.in);
			String cpf_string = cpf_input.next();
			Valida_cpf cpf = new Valida_cpf(cpf_string);
			cpf.regex_cpf(cpf.getCpf());
			System.out.print("Deseja validar um novo cpf? 1-sim, 2-não: ");
			try {
				para = input.nextInt();

			} catch (Exception e) {
				System.out.println("valor inválido, tente novamente");
			}
		} while (para != 2);

	}
}