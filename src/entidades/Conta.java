package entidades;



public class Conta implements Comparable <Conta> {
	
	private int numero;
	private String nome;
	private Double saldo;
	
	public Conta() {	
	}
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
 
	public String toString() {
		return " N° da Conta "
				+ numero
				+ ", Nome do Titular: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	@Override
	public int compareTo(Conta outra) {
		return saldo.compareTo(outra.getSaldo());
	}
	
	

}
