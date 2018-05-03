package com.s2it.designPatterns.builder;

public class RH {

	public void contrata(ColaboradorBuilder builder) {
		builder.realizaIntegracao();
		builder.conheceAEquipe();
		builder.participaDeTreinamento();
		builder.fazUpdateSemWhereEmProducao();
	}

}
