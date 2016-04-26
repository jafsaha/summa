package com.summa.solutions.interview.empresa.fixture;

import java.util.HashSet;
import java.util.Set;

import com.summa.solutions.interview.empleado.Disenador;
import com.summa.solutions.interview.empleado.Empleado;
import com.summa.solutions.interview.empleado.Programador;
import com.summa.solutions.interview.empleado.enums.DisenadorType;
import com.summa.solutions.interview.empleado.enums.Languages;

public class EmpleadoFixture {
	public static Programador createProgramadorPhp(){
		Programador programador = new Programador();
		
		programador.setNombre("Juan Carlos");
		programador.setApellido("Pehachepe");
		programador.setId(1234L);
		Set<Languages> languages = new HashSet<Languages>();
		languages.add(Languages.PHP);
		programador.setLanguages(languages);
		programador.setEdad(82);
		
		return programador;
	}

	public static Disenador createDisenadorGrafico() {
		Disenador disenador = new Disenador();
		
		disenador.setNombre("Juan Carlos");
		disenador.setApellido("Da Vinci");
		disenador.setId(12345L);
		disenador.setType(DisenadorType.GRAFICO);
		disenador.setEdad(12);
		
		return disenador;
	}

	public static Empleado createDisenadorWeb() {
		Disenador disenador = new Disenador();
		
		disenador.setNombre("Juan Carlos");
		disenador.setApellido("Javascript");
		disenador.setId(12346L);
		disenador.setType(DisenadorType.WEB);
		disenador.setEdad(24);
		
		return disenador;
	}

	public static Empleado createProgramadorPython() {
		Programador programador = new Programador();
		
		programador.setNombre("Juan Carlos");
		programador.setApellido("Scripttheworld");
		programador.setId(123456L);
		Set<Languages> languages = new HashSet<Languages>();
		languages.add(Languages.PYTHON);
		programador.setLanguages(languages);
		programador.setEdad(82);
		
		return programador;
	}
}
