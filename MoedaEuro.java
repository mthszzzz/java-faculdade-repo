package empresa;

public class MoedaEuro extends Moeda {

	@Override
	public void moedaInfo() {
		System.out.println("Euro: "+valorMoeda);
		
	}

	@Override
	public double moedaConverter() {
		return valorMoeda*5.57;
	}
	
	public MoedaEuro(double valorMoeda) {
		this.valorMoeda = valorMoeda;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
		return false;
	}
		MoedaEuro objEuro = (MoedaEuro) obj;
		
		if (this.valorMoeda != objEuro.valorMoeda) {
			return false;
		}
		
		return true;
		}
}
