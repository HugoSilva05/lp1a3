package venda;

public class Cidade {
	private String nome;
	private Estado estado;
	
	public Cidade() {
		
	}
	
	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void setEstado(String nome, String sigla) {
		estado = new Estado(nome, sigla);
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado.toString() + "]";
	}
	
}
