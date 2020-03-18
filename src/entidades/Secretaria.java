package entidades;

public final class Secretaria extends Funcionarios {
	private Integer numRamal;

	public Secretaria(String nome, Double salario, Integer numRamal) {
		super(nome, salario);
		this.numRamal = numRamal;
	}

	public Integer getNumRamal() {
		return numRamal;
	}

	public void setNumRamal(Integer numRamal) {
		this.numRamal = numRamal;
	}

}
