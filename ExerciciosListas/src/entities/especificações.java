package entities;

public class especificações implements Comparable<especificações>{

	private String produto;
	private int valor;
	private double quantidade;

	
	
	public String getNome() {
		return produto;
	}
	public void setNome(String nome) {
		this.produto = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public int compareTo(especificações o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
