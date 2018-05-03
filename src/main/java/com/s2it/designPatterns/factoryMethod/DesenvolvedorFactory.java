package com.s2it.designPatterns.factoryMethod;

public class DesenvolvedorFactory extends EmpresaFactory {

	@Override
	public Colaborador contrata(String nome, Integer idade) {
		return new Desenvolvedor(nome, idade);
	}

}
