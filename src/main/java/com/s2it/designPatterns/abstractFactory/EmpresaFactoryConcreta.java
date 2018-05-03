package com.s2it.designPatterns.abstractFactory;

public class EmpresaFactoryConcreta extends EmpresaFactory{

	@Override
	public Desenvolvedor contrataDesenvolvedor(String nome, Integer idade) {
		return new DesenvolvedorConcreto(nome, idade);
	}

	@Override
	public Estagiario contrataEstagiario(String nome, Integer idade) {
		return new EstagiarioConcreto(nome, idade);
	}


}
