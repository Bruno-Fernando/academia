import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
	private Atividade atividade;
	private String[] comentarios;
	private int nota;
	
	public Avaliacao(Atividade atividade, String[] comentarios, int nota){
		this.atividade = atividade;
		this.comentarios = comentarios;
		this.nota = nota;
	}
	
	public String getNomeAtividade(){
		return atividade.getNome();
	}
	
	public String getComentarios(){
		String comentario = "";
		if(atividade.getTipo().equals("Laboratorio")){
			
			for (int i = 0; i < comentarios.length; i++) {
				String string = comentarios[i];
				if((i + 1) == comentarios.length){
					comentario += string;
					return comentario;
				}
				comentario += string;
				comentario += ", ";
			}
		}else if(atividade.getTipo().equals("Minilaboratorio")){
			comentario += comentarios[0];
			comentario += ", ";
			comentario += comentarios[1];
		}
		
		return comentario;
	}
	public int getNota(){
		return nota;
	}
}
