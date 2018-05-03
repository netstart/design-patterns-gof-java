package com.s2it.designPatterns.builder;

public class Implementacao {

	public static void main(String[] args) {

		RH rh = new RH();

		ColaboradorBuilder estagiarioBuilder = new EstagiarioBuilder();
		ColaboradorBuilder desenvolvedorBuilder = new DesenvolvedorBuilder();

		rh.contrata(estagiarioBuilder);
		estagiarioBuilder.getColaborador();
		
		rh.contrata(desenvolvedorBuilder);
		desenvolvedorBuilder.getColaborador();
	}

}
