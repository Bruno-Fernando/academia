package ipiranga;

public class Caminhoneiro extends Contribuinte{
	private int quilometros;
	private int carga;
	public final int limiar = 100000;
	
	public Caminhoneiro(String nome, String cpf, int quilometros, int carga) throws Exception{
		super(nome, cpf);
		this.quilometros = quilometros;
		this.carga = carga;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		this.quilometros = quilometros;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public double getImposto(){
		if(carga <= 10){
			return 500;
		}
		double imposto = 500 + (this.carga - 10) * 100; 
		double desconto = this.quilometros * 0.01;
		
		return imposto - desconto;
	}
	
	public boolean getLimiar(){
		if(this.getbens() > limiar){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "[CAMINHONEIRO] " + this.getNome() + ", " + this.getCpf() + ".";
	}
	
}
