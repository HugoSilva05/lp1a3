package venda;

import java.util.Date;

public class Gerente extends Funcionario{
	private float salario;
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, Date nascimento, String cpf, Endereco enderecos, float salario) {
		super(nome, nascimento, cpf, enderecos);
		// TODO Auto-generated constructor stub
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
