package venda;

import java.util.Date;

public class Vendedor extends Funcionario{
	private EquipeVenda equipe;
	private float salario;

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nome, Date nascimento, String cpf, Endereco enderecos, EquipeVenda equipe, float salario) {
		super(nome, nascimento, cpf, enderecos);
		// TODO Auto-generated constructor stub
		this.equipe = equipe;
		this.salario = salario;
	}

	public EquipeVenda getEquipe() {
		return equipe;
	}

	public void setEquipe(EquipeVenda equipe) {
		this.equipe = equipe;
	}
	
	public void setEquipe(String nome) {
		this.equipe = new EquipeVenda(nome);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
