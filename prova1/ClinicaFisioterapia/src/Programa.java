import java.util.ArrayList;


public class Programa {
	private ArrayList<Exercicio> programa;
	
	public Programa(){
		this.programa = new ArrayList<>();
	}
	
	public boolean adicionaExercicio(String nome, int bpm, int aguaPerdida){
		Exercicio novoExercicio = new Exercicio(nome, bpm, aguaPerdida);
		if(!programa.contains(novoExercicio)){
			return programa.add(novoExercicio);
		}
		return false;
	}
	
	public int aguaPerdida(int horas){
		int total = 0;
		for (int i = 0; i < programa.size(); i++) {
			total += programa.get(i).getAguaPerdida() / programa.size();
		}
		return total * horas;
	}

	@Override
	public String toString() {
		String string = new String();
		for (Exercicio exercicio : programa) {
			string += "==> ";
			string += exercicio.toString();
			string += "\n";
		}
		return string;
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
		Programa other = (Programa) obj;
		if(this.programa.size() != other.programa.size()){
			return false;
		}
		for (int i = 0; i < this.programa.size(); i++) {
			if(!this.programa.get(i).equals(other.programa.get(i))){
				return false;
			}
		}
		return true;
		
	}
	
	

}
