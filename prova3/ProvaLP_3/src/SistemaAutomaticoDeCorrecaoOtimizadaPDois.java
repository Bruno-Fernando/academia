import java.util.ArrayList;
import java.util.List;

public class SistemaAutomaticoDeCorrecaoOtimizadaPDois implements SistemaAutomaticoDeCorrecaoOtimizadaPDoisIf {
	private List<Aluno> listaAlunos;
	private List<Atividade> listaAtividade;
	
	public SistemaAutomaticoDeCorrecaoOtimizadaPDois() {
		listaAlunos = new ArrayList<>();
		listaAtividade = new ArrayList<>();
	}
	
	@Override
	public void cadastraAluno(String nome, String matricula, boolean repetente) throws Exception {
		Aluno novoAluno = new Aluno(nome, matricula, repetente);
		if(getAluno(matricula)!= null){
			
			throw new Exception("Matricula ja cadastrada.");
		}
		listaAlunos.add(novoAluno);

	}

	@Override
	public String consultaAluno(String matricula) throws Exception {
		String consulta = "";
		for (Aluno aluno : listaAlunos) {
			if(aluno.getMatricula().equals(matricula)){
				consulta = aluno.toString();
			}
		}
		if(consulta.equals("")){
			throw new Exception("Aluno nao cadastrado.");
		}
		return consulta;
	}

	@Override
	public void cadastraAtividade(String tituloAtividade, String tipo) throws Exception {
		Atividade novaAtividade = new Atividade(tituloAtividade, tipo);

		listaAtividade.add(novaAtividade);
			
		
		
	}

	@Override
	public String consultaAtividade(String tituloAtividade) throws Exception {
		for (Atividade atividade : listaAtividade) {
			if(atividade.getNome().equalsIgnoreCase(tituloAtividade)){
				
				return atividade.getTipo();
				
			}
		}
		return null;
	}

	@Override
	public void adicionaAvaliacao(String matricula, String atividade, int nota, String[] comentarios) throws Exception {
		if(getAluno(matricula) == null){
			throw new Exception ("Aluno nao cadastrado.");
		}
		for (Atividade atividad : listaAtividade) {
			if(atividad.getNome().equals(atividade)){
				Aluno aluno = getAluno(matricula);
				aluno.adicionaAvaliacao(atividad, nota, comentarios);
				
			}
		}

	}
	public Aluno getAluno(String matricula){
		for (Aluno aluno : listaAlunos) {
			if(aluno.getMatricula().equals(matricula)){
				return aluno;
			}
		}
		return null;
	}

	@Override
	public String getComentarios(String matricula, String tituloAtividade) throws Exception {
		Aluno aluno = getAluno(matricula);
		if(aluno == null){
			throw new Exception ("Aluno nao cadastrado.");
		}

		return aluno.getComentarios(tituloAtividade);
	}

	@Override
	public void trocarTipoAtividade(String tituloAtividade, String tipo) throws Exception {
		for (Atividade atividade : listaAtividade) {
			if(atividade.getNome().equals(tituloAtividade)){
				atividade.setTipo(tipo);
			
			}
		}

	}

	@Override
	public int getNotaFinal(String matricula, String tituloAtividade) throws Exception {
		Aluno aluno = getAluno(matricula);
		return aluno.getNota(tituloAtividade);
	}

	@Override
	public int getNotaFinal(String matricula) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void importaAtividades(String filename) throws Exception {
		// TODO Auto-generated method stub

	}
}
