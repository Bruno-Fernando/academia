package miniteste;

import java.awt.List;

public abstract class Usuario {

	private List<Jogo> jogosComprados;
	private String nome, login;
	private double saldo;
	private int x2p;
	private int scoreMaximo;

	public Usuario(String nome, String login) throws Exception {

		verificaNome(nome);
		verificaLogin(nome, login);

		this.nome = nome;
		this.login = login;
		this.saldo = 0.0;
		this.x2p = 0;
		this.scoreMaximo = 0;
		this.jogosComprados = new ArrayList<Jogo>();
	}

	public double getSaldo() {
		return saldo;
	}

	protected boolean adicionaJogo(Jogo jogoASerAdicionado) {
		if (jogosComprados.contains(jogoASerAdicionado)) {
			return false;
		} else {
			jogosComprados.add(jogoASerAdicionado);
			return true;
		}

	}

	private void diminuiSaldo(double valorAPagar)
			throws Exception {
		if (valorAPagar < 0) {
			throw new Exception(
					"Valor a pagar nao pode ser negativo");
		}
		saldo = saldo - valorAPagar;

	}

	public abstract double calculaDesconto(Jogo compra);
	
	public abstract int calculaX2PCompra(Jogo compra);
	
	public boolean compraJogo(Usuario user, Jogo compra)throws Exception {

		double precoJogo = compra.getPreco();
		double valorAPagar;
		double xp2ganho;
		if(statususuario instanceof Noob){
			valorAPagar = 0.9 * precoJogo;
			xp2ganho = 10 * precoJogo;

		}else{
			valorAPagar = 0.8 * precoJogo;
			xp2ganho = 15 * precoJogo;
		}
		if (getSaldo() <= valorAPagar) {
			throw new Exception("Nao ha saldo suficiente");
		} else {
			x2p += xp2ganho;
			diminuiSaldo(valorAPagar);
			adicionaJogo(compra);
			return true;
		}
	}
	private void verificaLogin(String nome, String login) 
			throws Exception {
		
		if (login == null || login.equals("")) {
			throw new Exception("O campo login nao pode ser nulo ou vazio.");
		}
	}

	private void verificaNome(String nome) 
			throws Exception {
		
		if (nome == null || nome.equals("")) {
			throw new Exception("O campo nome nao pode ser nulo ou vazio.");
		}
	}

//outros métodos viriam aqui!
}
