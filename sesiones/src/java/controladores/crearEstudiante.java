package controladores;

import java.util.ArrayList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Datos.Persona;
import Datos.Administrador;

public class crearEstudiante {
	public static void guardarArrayList(ArrayList<Persona> estudiantes, String fichero) {
		try {
			ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(fichero));
			ficheroSalida.writeObject(estudiantes);
		
			ficheroSalida.close();
			System.out.println("Personas guardadas correctamente...");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: El fichero no existe. ");
		} catch (IOException ioe) {
			System.out.println("Error: Fallo en la escritura en el fichero. ");
		}
	}
	
	public static void guardarArrayListAdmin(ArrayList<Administrador> administradores, String fichero) {
		try {
			ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(fichero));
			ficheroSalida.writeObject(administradores);
		
			ficheroSalida.close();
			System.out.println("Administradores guardadas correctamente...");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: El fichero no existe. ");
		} catch (IOException ioe) {
			System.out.println("Error: Fallo en la escritura en el fichero. ");
		}
	}

	public static ArrayList<Persona> leerFichero(String fichero) {
		ArrayList<Persona> lista = null;
		try {
			ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
			lista = (ArrayList<Persona>) ficheroEntrada.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public static ArrayList<Administrador> leerFicheroAdmin(String fichero) {
		ArrayList<Administrador> lista = null;
		try {
			ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
			lista = (ArrayList<Administrador>) ficheroEntrada.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public static void main(String args[]) {
		String fichero = "C:\\Users\\arvip\\Desktop\\estudiantes.dat";
		String ficheroAdmin = "C:\\Users\\arvip\\Desktop\\admin.dat";
		Persona estudiante1 = new Persona("1","Arturo", "Vicente", "10/06/2001", "informatica", "primero", "arturo@arturo.com", "1234");
		Persona estudiante2 = new Persona("2","Manuel", "Eslava", "18/18/1998", "fisico", "segundo", "manu@manu.com", "1234");
		Persona estudiante3 = new Persona("3","Jose", "Carmona", "18/18/1999", "estudiante","tercero" ,"jose@jose.com", "1234");
		Administrador admi1 = new Administrador("admin","admin");
		ArrayList<Persona> estudiantes = new ArrayList<Persona>();
		ArrayList<Administrador> administradores = new ArrayList<Administrador>();
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		administradores.add(admi1);
		guardarArrayList(estudiantes, fichero);
		guardarArrayListAdmin(administradores, ficheroAdmin);
	}

}