package ipiranga;

public abstract class Contribuinte {
	private String nome;
	private String cpf;
	private double bens;
	
	public Contribuinte(String nome, String cpf) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception("Nome inválido.");
		}
		if(cpf == null || cpf.equals("")){
			throw new Exception("CPF inválido.");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.bens = 0;
	}
	
	abstract double getImposto();
	abstract boolean getLimiar();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getbens() {
		return bens;
	}

	public void setBens(double bens) {
		this.bens += bens;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contribuinte other = (Contribuinte) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.nome + ", " + this.cpf + ".";
	}
	
	

}
