package com.summa.solutions.interview.empresa.fixture;

import com.summa.solutions.interview.empresa.Empresa;

public class EmpresaFixture {

	public static Empresa createEmpresaVacia(){
		return new Empresa();
	}
	
	public static Empresa createEmpresaMagento(){
		Empresa empresa = new Empresa();
		empresa.addEmpleado(EmpleadoFixture.createDisenadorGrafico());
		empresa.addEmpleado(EmpleadoFixture.createProgramadorPhp());
		return empresa;
	}
	
	public static Empresa createEmpresaInteresante(){
		Empresa empresa = new Empresa();
		empresa.addEmpleado(EmpleadoFixture.createDisenadorGrafico());
		empresa.addEmpleado(EmpleadoFixture.createDisenadorWeb());
		empresa.addEmpleado(EmpleadoFixture.createProgramadorPython());
		return empresa;
	}
}
