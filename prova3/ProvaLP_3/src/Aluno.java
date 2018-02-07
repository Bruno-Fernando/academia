import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String matricula;
	private boolean repetente;
	private List<Avaliacao> listaAvaliacoes;
	
	public Aluno(String nome, String matricula, boolean repetente){
		
		this.nome = nome;
		this.matricula = matricula;
		this.repetente = repetente;
		listaAvaliacoes = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isRepetente() {
		return repetente;
	}

	public void setRepetente(boolean repetente) {
		this.repetente = repetente;
	}
	
	public void adicionaAvaliacao(Atividade atividade, int nota, String[] comentario){
		Avaliacao novaAvaliacao = new Avaliacao(atividade, comentario, nota);
		listaAvaliacoes.add(novaAvaliacao);
	}
	
	public String getComentarios(String atividade){
		for (Avaliacao avaliacao : listaAvaliacoes) {
			if(avaliacao.getNomeAtividade().equals(atividade)){
				return avaliacao.getComentarios();
			}
		}
		return null;
	}
	
	public int getNota(String atividade){
		int nota = 0;
		for (Avaliacao avaliacao : listaAvaliacoes) {
			if(avaliacao.getNomeAtividade().equals(atividade)){
				
				nota =  avaliacao.getNota();
			}
		}
		return nota;
	}

	@Override
	public String toString() {
		if(this.repetente){
			return this.getNome() + " (R) - " + this.getMatricula();
		}
		return this.getNome() + " - " + this.getMatricula();
	}
	

}
