package empresa;

import java.util.Scanner;

public class Inicio {
	Moeda moeda = null;
	String opcao;
	String nome;
	Scanner teclado = new Scanner(System.in); // Scanner para ler Opção e Valor
	Cofrinho cofrinho = new Cofrinho(); // Cofrinho
	
	public void telaInicial() {
		System.out.println("Cofrinho: ");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular Valor Total Convertido Para Real");
		System.out.println("0 - Encerrar");
		
		
		opcao = teclado.next();
		
		switch(opcao) { // Switch Case para as opções.
		
		
		case "0": // case para encerrar.
			break; // Break para encerrar.
			
			
			
		case "1": // case para escolher moeda.
			System.out.println("Escolha uma moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			int opcaoAdd = teclado.nextInt();
			
			System.out.println("Digite o valor: ");
			
			double valorDaMoeda = teclado.nextDouble();
			
	
			if (opcaoAdd == 1) { // if e else if para verificar moeda.
				moeda = new MoedaReal(valorDaMoeda);
				nome = "Real";
			}
			else if(opcaoAdd == 2) {
				moeda = new MoedaDolar(valorDaMoeda);
				nome = "Dolar";
			}
			else if(opcaoAdd == 3) {
				moeda = new MoedaEuro(valorDaMoeda);
				nome = "Euro";
				
			}
			else {
				System.out.printf("Opcao %s inexistente\n",opcaoAdd); // mensagem para falar que a opção não existe.
				telaInicial();
			}
			cofrinho.add(moeda); // adicionar moedas
			System.out.printf("%.2f$ em %s adicionado ao cofrinho\n",valorDaMoeda,nome); // mensagem mostrando quanto foi adicionado e em que moeda
			telaInicial();
			break;
			
		case "2":
			System.out.println("Escolha uma moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			opcaoAdd = teclado.nextInt();
			
			System.out.println("Digite o valor: ");
			
			valorDaMoeda = teclado.nextDouble();
			
	
			if (opcaoAdd == 1) { // if e else if para verificar moeda.
				moeda = new MoedaReal(valorDaMoeda);
				nome = "Real";
			}
			else if(opcaoAdd == 2) {
				moeda = new MoedaDolar(valorDaMoeda);
				nome = "Dolar";
			}
			else if(opcaoAdd == 3) {
				moeda = new MoedaEuro(valorDaMoeda);
				nome = "Euro";
				
			}
			else {
				System.out.printf("Opcao %s inexistente\n",opcaoAdd); // mensagem para falar que a opção não existe.
				telaInicial();
			}
			cofrinho.remover(moeda); // adicionar moedas
			System.out.printf("%.2f$ em %s removido do cofrinho\n",valorDaMoeda,nome); // mensagem mostrando quanto foi adicionado e em que moeda
			telaInicial();
			break;
			
		case "3":
			cofrinho.listarMoedas();
			telaInicial();
			break;
			
		case "4":
			double total = cofrinho.totalConvertido();
			System.out.printf("Valor total convertido para real: %.2f\n",total);
			telaInicial();
			break;
			
			
		default: // Default para retornar mensagem se não existir opção e voltar para o começo.
			System.out.println("Opcao inexistente.");
			telaInicial();
			break;
	}

	}
}
