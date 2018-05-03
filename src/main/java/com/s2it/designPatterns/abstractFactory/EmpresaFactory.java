package com.s2it.designPatterns.abstractFactory;

public abstract class EmpresaFactory {

	public abstract Desenvolvedor contrataDesenvolvedor(String nome, Integer idade);

	public abstract Estagiario contrataEstagiario(String nome, Integer idade);

}
