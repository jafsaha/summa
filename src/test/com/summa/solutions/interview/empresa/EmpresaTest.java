package com.summa.solutions.interview.empresa;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.summa.solutions.interview.empleado.Disenador;
import com.summa.solutions.interview.empleado.Empleado;
import com.summa.solutions.interview.empleado.Programador;
import com.summa.solutions.interview.empresa.fixture.EmpleadoFixture;
import com.summa.solutions.interview.empresa.fixture.EmpresaFixture;

public class EmpresaTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void agregoUnEmpleadoAUnaEmpresaVacía(){
		Empresa emptyEmpresa = EmpresaFixture.createEmpresaVacia();
		assertTrue(emptyEmpresa.getEmpleados().isEmpty());
		
		Programador programadorPhp = EmpleadoFixture.createProgramadorPhp();
		emptyEmpresa.addEmpleado(programadorPhp);
	
		Disenador disenadorGrafico = EmpleadoFixture.createDisenadorGrafico();
		emptyEmpresa.addEmpleado(disenadorGrafico);
	
		assertEquals("La empresa debería tener 2 empleados", 2, emptyEmpresa.getEmpleados().size());
	}
	
	@Test
	public void buscoUnEmpleadoPorIdEnUnaEmpresaInteresante(){
		Empresa empresaInteresante = EmpresaFixture.createEmpresaInteresante();
		Empleado empleado = empresaInteresante.getEmpleadoBy(12345L);
		String nombre = "Juan Carlos Da Vinci"; 
		
		assertEquals("El Empleado debería ser "+nombre, nombre, empleado.getNombre() + " "+ empleado.getApellido());		
	}
	
	@Test
	public void printListadoEmpleados(){
		Empresa empresaMagento = EmpresaFixture.createEmpresaMagento();
		empresaMagento.listEmpleados(System.out);
		System.out.flush();
	}
	
	@Test
	public void calculoElPromedioDeEdades(){
		Empresa empresaInteresante = EmpresaFixture.createEmpresaInteresante();
		Double averageAge = empresaInteresante.getEmpleadoAverageAge();
		assertEquals("El promedio de edad deberia ser 27",new Double(27), averageAge);
	}


}
