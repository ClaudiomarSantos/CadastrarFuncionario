package entidades;

public final class Gerentes extends Funcionarios {

	private String usuario;
	private Integer senha;
	
	

	public Gerentes(String nome, Double salario, String usuario, Integer senha) {
		super(nome, salario);
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getSenha() {
		return senha;
	}

}
