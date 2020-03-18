package entidades;

public final class Telefonista extends Funcionarios {
	private Integer cod_estacao;

	public Telefonista(String nome, Double salario, Integer cod_estacao) {
		super(nome, salario);
		this.cod_estacao = cod_estacao;
	}

	public Integer getCod_estacao() {
		return cod_estacao;
	}

	public void setCod_estacao(Integer cod_estacao) {
		this.cod_estacao = cod_estacao;
	}

}
