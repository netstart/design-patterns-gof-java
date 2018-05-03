package com.s2it.designPatterns.abstractFactory;

public class EstagiarioConcreto extends Estagiario {

	public EstagiarioConcreto(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("O nome do Estagiário é " + this.getNome() + " e ele tem " + this.getIdade() + " anos.");
	}

}
