package entidades;

public class Funcionarios {
	private String nome;
	private Double salario;

	public Funcionarios() {

	}

	public Funcionarios(String nome, Double salario) {

		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

}
