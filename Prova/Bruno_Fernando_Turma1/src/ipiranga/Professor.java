package ipiranga;

public class Professor extends Contribuinte{
	private double despesas;
	private double salario;
	public final int limiar = 300000;
	
	public Professor(String nome, String cpf, double despesas, double salario) throws Exception{
		super(nome, cpf);
		this.despesas = despesas;
		this.salario = salario;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean getLimiar(){
		if(this.getbens() > limiar){
			return true;
		}
		return false;
	}
	
	public double getImposto(){
		double imposto = 0;
		if(salario <= 880){
			imposto = salario * 0.05;
		}
		else if(salario <= 4400){
			imposto = salario * 0.1; 
		}
		else{
			imposto = salario * 0.2;
		}
		double desconto = this.despesas * 0.5;
		return imposto - desconto;
	}
	
	@Override
	public String toString() {
		return "[PROFESSOR] " + this.getNome() + ", " + this.getCpf() + ".";
	}
	
}
