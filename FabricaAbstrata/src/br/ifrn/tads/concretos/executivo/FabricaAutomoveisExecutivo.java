package br.ifrn.tads.concretos.executivo;

import br.ifrn.tads.abstratos.Chassi;
import br.ifrn.tads.abstratos.FabricaAutomoveis;
import br.ifrn.tads.abstratos.Motor;
import br.ifrn.tads.abstratos.Roda;

public class FabricaAutomoveisExecutivo extends FabricaAutomoveis {

	@Override
	public Motor criaMotor() {
		return new MotorExecutivo();
	}

	@Override
	public Roda criaRodas() {
		return new RodaExecutivo();
	}

	@Override
	public Chassi criaChassi() {
		return new ChassiExecutivo();
	}

}
