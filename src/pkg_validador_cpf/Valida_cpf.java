package pkg_validador_cpf;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valida_cpf {
	private String cpf; 
	
	//construtor
	public Valida_cpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	//função que usa uma expressão regular para validar o cpf
	public void regex_cpf(String cpf) {
		//guarda o padrão do regex e verifica se o cpf está nos conformes
		Pattern padrao_cpf_inteiro = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
		Pattern padrao_cpf = Pattern.compile("[0-9]{3}[0-9]{3}[0-9]{3}[0-9]{2}"); //padrão sem caracteres especiais
		Matcher verifica_cpf_inteiro = padrao_cpf_inteiro.matcher(cpf);
		Matcher verifica_cpf = padrao_cpf.matcher(cpf);
		
		//verifica se está nos conformes, se estiver faz a logica de verificação
		boolean cpf_valido = verifica_cpf_inteiro.find();
		if (cpf_valido == false) {
			//se não estiver no formato inteiro testa o formato sem caracteres especiais
			cpf_valido = verifica_cpf.find();
			if (cpf_valido == false) {
				System.out.println("Formato inválido de cpf.");
			} else{
				validador_de_cpf_n10(cpf);
			}
		}else{
			validador_de_cpf_n10(cpf);
		}
	}
	
	// Segundo metodo aplicado. Esse metodo verifica a validade do 11º digito do cpf. Retorna um booleano
	public boolean validador_de_cpf_n11(String cpf) {
		//Variáveis auxiliares
		int somador = 0;
		int multiplicador = 11;
		
		//laço de repetição para multiplicar os digitos pelos seus respectivos pesos
		for(int i=0; i<cpf.length()-1;i++) {
			somador += (cpf.charAt(i)-'0') * multiplicador;
			multiplicador--;
		}
		
		//logica de validação do 11º numero
		int digito_11 = somador % 11;
		if (digito_11 > 1) {
			digito_11 = 11 - digito_11;
		}
		else {
			digito_11 = 0;
		}
		//Se após a logica o resultado for igual o 11º o cpf é valido e encerra o programa 
		if(digito_11 == cpf.charAt(10)-'0') {
			System.out.println("Cpf válido");
			return true;
		}
		System.out.println("Cpf inválido");
		return false;
	}
	
	//Primeiro metodo aplicado. Esse metodo verifica a validade do 10º digito do cpf. Retorna um booleano
	public boolean validador_de_cpf_n10(String cpf) {
		//Variáveis auxiliares
		int somador = 0;
		int multiplicador = 10;
		
		//Caso o cpf venha com caracteres eles seráo retirados
		String cpf_novo = cpf.replaceAll("\\.|\\-","");
		
		//laço de repetição para multiplicar os digitos pelos seus respectivos pesos
		for(int i=0; i<(cpf_novo.length()-2);i++) {
			somador += (cpf_novo.charAt(i)-'0') * multiplicador;
			multiplicador-=1;
		}
		
		//logica de validação do 10º numero
		int digito_10 = somador % 11;
		if (digito_10 > 1) {
			digito_10 = 11 - digito_10;
		} 
		else {
			digito_10 = 0;
		}
		
		//Se após a logica o resultado for igual o 10º numero do cpf, faz a validação do 11º numero
		if((cpf_novo.charAt(9) - '0' == digito_10)) {
			boolean digito11 = validador_de_cpf_n11(cpf_novo);
			return digito11;
		}
		//caso contrario encerra o programa
		System.out.println("Cpf inválido");
		return false;
	}
}

