package com.summa.solutions.interview.empleado;

import java.util.Set;

import com.summa.solutions.interview.empleado.enums.Languages;

public class Programador extends Empleado{
	private Set<Languages> languages;

	public Set<Languages> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Languages> languages) {
		this.languages = languages;
	}
}
