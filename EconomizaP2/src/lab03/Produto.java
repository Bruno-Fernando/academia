package lab03;

public class Produto {
	private String nome;
	private double preco;
	private String tipo;
	
	public Produto(String nome, double preco, String tipo){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public String getNome(){
		return this.nome;
	}
	public double getPreco(){
		return this.preco;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
}
