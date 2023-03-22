package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList <Moeda> moedaLista;
	
	public Cofrinho() {
		this.moedaLista = new ArrayList<>();
	}
	
	public double totalConvertido() {
		if(this.moedaLista.isEmpty()) {
			return 0;
		}
		double acumulacao = 0;
		for(Moeda moeda: this.moedaLista) { // loop para acumular e converter
			acumulacao = acumulacao + moeda.moedaConverter();
			}
		return acumulacao;
	}
	
	public void remover(Moeda moeda) { // remover moeda da lista.
		this.moedaLista.remove(moeda);
	}
	
	public void add(Moeda moeda) { // adicionar moeda a lista.
		this.moedaLista.add(moeda);
	}
	
	
	
	public void listarMoedas() { // listar todas as moedas do cofre
		
		if (this.moedaLista.isEmpty()) {
			System.out.println("Nenhuma moeda");
			return;
		
		}
		for(Moeda moeda: this.moedaLista) { // loop para mostrar cada moeda do cofrinho
			moeda.moedaInfo();
	}
	}
	
}
