import java.util.HashSet;

public class Luta extends Jogo{
	
	public Luta(String nome, double preco, HashSet<Jogabilidade> jogabilidade){
		super(nome, preco, jogabilidade);
	}

	public int registraJogada(int score, boolean zerou){
		int maxscore = getMaxScore();
		int pontos = maxscore/1000;
		setJogadas();
		
		if(score > maxscore){
			pontos += score/1000;
			setMaxScore(score);
		}
		if(zerou){
			setZeradas();
		}
		
		return pontos;
	}
	
	@Override
	public String toString() {
		return "+ " + getNome() + " - " + "Luta:\n" + 
				"==> Jogou " + getJogadas() + " vez(es)\n" + 
				"==> Zerou " + getZeradas() + " vez(es)\n" + 
				"==> Maior score: " + getMaxScore();
	}
}
