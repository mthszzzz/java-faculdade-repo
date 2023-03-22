package empresa;

public class MoedaReal extends Moeda {  // Classe filha de moeda.
	
	
	
	@Override
	public void moedaInfo() {
		System.out.println("Real: "+valorMoeda);
	}

	@Override
	public double moedaConverter() {
		return this.valorMoeda; // retorna o valor de real.
		
	}

	
	public MoedaReal(double valorMoeda) {
		this.valorMoeda = valorMoeda;
	}
	
	@Override
	public boolean equals(Object obj) { // implementação do método equals, da classe object
		if (this.getClass() != obj.getClass()) {
		return false; // retorna falso se a classe for diferente.
	}
		MoedaReal objReal = (MoedaReal) obj;
		
		if (this.valorMoeda != objReal.valorMoeda) {
			return false;
		}
		
		return true;
		}
	
}
