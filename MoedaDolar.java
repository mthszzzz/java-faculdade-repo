package empresa;

public class MoedaDolar extends Moeda {

	@Override
	public void moedaInfo() {
		System.out.println("Dolar: "+valorMoeda);
		
	}

	@Override
	public double moedaConverter() {
		// TODO Auto-generated method stub
		return this.valorMoeda*5.33; // retorna o valor real convertido para o valor de dolar atualmente.
	}
	public MoedaDolar(double valorMoeda) {
		this.valorMoeda = valorMoeda;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
		return false;
	}
		MoedaDolar objDolar = (MoedaDolar) obj;
		
		if (this.valorMoeda != objDolar.valorMoeda) {
			return false;
		}
		
		return true;
		}
}
