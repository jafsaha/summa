package com.summa.solutions.interview.empleado;

import com.summa.solutions.interview.empleado.enums.DisenadorType;

public class Disenador extends Empleado {
	
	private DisenadorType type;

	public DisenadorType getType() {
		return type;
	}

	public void setType(DisenadorType type) {
		this.type = type;
	}
}
