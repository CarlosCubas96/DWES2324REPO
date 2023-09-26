package com.model;

public class Alumno {

	private Integer ID;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String DNI;
	private String curso;

	public Alumno() {
		setID(ID);
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		setDNI(DNI);
		setCurso(curso);
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [getID()=" + getID() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getDNI()=" + getDNI() + ", getCurso()=" + getCurso() + "]";
	}

}
