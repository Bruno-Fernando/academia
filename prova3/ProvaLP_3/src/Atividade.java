
public class Atividade {
	private String nome;
	private String tipo;


	
	public Atividade(String nome, String tipo) throws Exception{
		if(nome.trim().equals("")){
			throw new Exception ("Nome da atividade invalido.");
		}
		if(tipo.trim().equals("")){
			throw new Exception ("Tipo de atividade invalido.");
		}
		
		this.nome = nome;
		this.tipo = tipo;
			
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
