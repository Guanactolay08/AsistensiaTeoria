package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroDeNota;

public class Main {

	public static void main(String[] args) {
		//GENERAR UN ALUMNO
		Alumno alumno = generarAlumno();
		//CARGAR SUS NOTAS
		RegistrarNotas(alumno);
		
		
	}
		
		public static Alumno generarAlumno() {
			
			Alumno alumno = new Alumno();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese el legajo: ");
			Integer legajo = scanner.nextInt();
			System.out.println("Ingrese el apellido: ");
			String apellido = scanner.next();
			System.out.println("Ingrese el nombre: ");
			String nombre = scanner.next();
			
			alumno.setLegajo(legajo);
			alumno.setApellido(apellido);
			alumno.setNombre(nombre);
			
			return alumno;
			
	}
		public static void RegistrarNotas (Alumno alumno) {
			int numMateria =1;
			Scanner scanner = new Scanner(System.in);
			while (numMateria <= 4) {
				
				System.out.println("Ingrese el codigo de la materia: ");
				String codigoMateria = scanner.next();
				System.out.println("Ingrese el nombre de la materia: ");
				String nombreMateria = scanner.next();
				
				Materia materia = new Materia(codigoMateria, nombreMateria);
				
				System.out.println("Ingrese el codigo del registro de nota: ");
				String codigoNota = scanner.next();
				System.out.println("Ingrese la nota final: ");
				Float nota = scanner.nextFloat();
				
				RegistroDeNota registroNota = new RegistroDeNota(codigoNota, alumno, materia, nota);
				
				System.out.println(registroNota.toString());
				
				numMateria++;
			}
			scanner.close();
		}
		

}
