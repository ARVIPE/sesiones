package Datos;

import java.io.Serializable;

public class Persona implements Serializable {

	String nombre;
	String apellido;
	String edad;
	String carrera;
	String semestre;
	String email;
	String id;
	String password;

	public Persona(String id, String nombre, String apellido, String edad, String carrera, String semestre,
			String email, String password) {
		super();
                this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.semestre = semestre;
		this.email = email;
		this.edad = edad;
		this.password = password;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", carrera=" + carrera
				+ ", semestre=" + semestre + ", email=" + email + "]";
	}

}