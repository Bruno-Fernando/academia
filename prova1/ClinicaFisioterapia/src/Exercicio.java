
public class Exercicio {
	private String nome;
	private int bpm;
	private int aguaPerdida;
	
	public Exercicio(String nome, int bpm, int aguaPerdida){
		this.nome = nome;
		this.bpm = bpm;
		this.aguaPerdida = aguaPerdida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public int getAguaPerdida() {
		return aguaPerdida;
	}

	public void setAguaPerdida(int aguaPerdida) {
		this.aguaPerdida = aguaPerdida;
	}

	@Override
	public String toString() {
		return "(" + this.nome + ", " + this.bpm + " bpm, " + this.aguaPerdida + " 50 ml/h)";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicio other = (Exercicio) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	

}
