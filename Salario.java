package projetos_LPA.aula4;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		// Variaveis
		Double horadetrab,valorphora,salbruto,salliquido,inss; 
		// Instaciar classe scanner
		
		Scanner ler = new Scanner(System.in);
		// Entrada de dados
		System.out.print("informe as horas de trabalho:");
		horadetrab = ler.nextDouble();
		
		System.out.print("informe o valor por hora:");
		valorphora= ler.nextDouble();
		
		salbruto = horadetrab*valorphora ;
		inss = salbruto*0.12 ;
		salliquido = salbruto - inss ;
		
		//saída
		
		System.out.println("O salario bruto e" + salbruto);
		System.out.println("O salario liquido e" + salliquido);
				
		
		
		
		
	}

}
