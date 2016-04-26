package com.summa.solutions.interview.empresa;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.summa.solutions.interview.empleado.Empleado;

public class Empresa {
	private Long id;
	private String nombre;
	private Map<Long, Empleado> empleados;
	
	public Map<Long, Empleado> getEmpleados() {
		if(this.empleados == null){
			this.empleados = new HashMap<Long, Empleado>();
		}
		return this.empleados;
	}
	public void setEmpleados(Map<Long, Empleado> empleados) {
		this.empleados = empleados;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Empleado> listEmpleados(){
		return new ArrayList<Empleado>(this.getEmpleados().values());
	}
	
	public void addEmpleado(Empleado unEmpleado){
		this.getEmpleados().put(unEmpleado.getId(), unEmpleado);
	}
	
	public Empleado getEmpleadoBy(Long id){
		return this.getEmpleados().get(id);
	}
	
	public Double getEmpleadoAverageAge(){
		if( !this.getEmpleados().isEmpty() ){
			Integer accumAge = null;
			
			for (Empleado empleado : this.getEmpleados().values()) {
				accumAge =+ empleado.getEdad();
			}
			
			return  new Double(accumAge / this.getEmpleados().size());
		}
		
		return null;
	}
	public void listEmpleados(PrintStream out) {
		out.println("Empleados:");
		Collection<Empleado> values = this.getEmpleados().values();
		for (Empleado empleado : values) {
			out.println(" " +empleado.getId() + ": " + empleado.getNombre() + " "+empleado.getApellido() );	
		}
	}
}