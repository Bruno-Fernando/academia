package ipiranga;

public class Taxista extends Contribuinte{
	private int quilometros;
	private int passageiros;
	public final int limiar = 150000;
	
	public Taxista(String nome, String cpf, int quilometros, int passageiros) throws Exception{
		super(nome,cpf);
		this.quilometros = quilometros;
		this.passageiros = passageiros;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		this.quilometros = quilometros;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public double getImposto(){
		double imposto = this.passageiros * 0.5;
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
		return "[TAXISTA] " + this.getNome() + ", " + this.getCpf() + ".";
	}
	
	

}
