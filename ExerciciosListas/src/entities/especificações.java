package entities;

public class especifica��es implements Comparable<especifica��es>{

	private String nome;
	private int valor;
	private double quantidade;

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public int compareTo(especifica��es o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
