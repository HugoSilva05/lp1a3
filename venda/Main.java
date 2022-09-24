package venda;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estado saoPaulo = new Estado("São Paulo", "SP");
		Cidade ubatuba = new Cidade("Ubatuba", saoPaulo);
		Endereco ruaX = new Endereco("Rua X", 13, "Jardim Palestra", "07412-001", ubatuba);
		
		Gerente gerente1 = new Gerente("Hugo", new Date(), "123.456.789-00", ruaX, 15000f);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getNascimento());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getEnderecos());
		System.out.println(gerente1.getSalario());
	}
}
