
public class Idoso {
	private String nome;
	private double altura;
	private int peso;
	private int idade;
	private Programa programa;
	private PressaoArterial pressao;
	
	public Idoso(String nome, double altura, int peso, int idade){
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.programa = new Programa();
		this.pressao = null;
	}
	
	public boolean adicionaExercicio(String nome, int bpm, int aguaPerdida){
		return programa.adicionaExercicio(nome, bpm, aguaPerdida);
		
	}
	
	public int aguaPerdida(int horas){
		return programa.aguaPerdida(horas);
	}
	
	public void setPA(int PAD, int PAS){
		pressao = new PressaoArterial(PAD, PAS);
	}
	
	public void setPA(PressaoArterial pressao){
		this.pressao = pressao;
	}
	
	public String classificaPA(){
		if(programa != null){
			if(pressao.getPAD() < 80 && pressao.getPAS() < 120){
				return "Normal";
			}
			else if((pressao.getPAD() >= 80 && pressao.getPAD() <= 89)
					|| (pressao.getPAS() >= 120 && pressao.getPAS() <= 139)){
				return "Pre-Hipertensao";
				
			}
			else if((pressao.getPAD() >= 90 && pressao.getPAD() <= 99) 
					|| (pressao.getPAS() >= 140 && pressao.getPAS() <= 159)){
				return "Hipertensao1";
			}else{
				return "Hipertensao2";
			}
		}
		return "Pressao ainda nao foi setada.";
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Idoso: " + this.nome + " ; Peso: " + this.peso + " kg; Altura: " + this.altura + " m\n"
				+ "Programa de exercicios:\n" 
				+ programa.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((programa == null) ? 0 : programa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Idoso other = (Idoso) obj;
		if(this.programa.equals(other.programa)){
			return true;
		}
		return false;
	}
	
	
}
