package dad;


import java.time.LocalDate;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre, apellidos,fechaNacimiento;
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Introduce un nombre:");
        nombre = in.nextLine();

        System.out.println("Introduce un apellido");
        apellidos = in.nextLine();
        
        System.out.println("Introduce tu año de nacimiento");
        fechaNacimiento = in.nextLine();

        in.close();

        Persona p = new Persona(nombre, apellidos,restaFechas(fechaNacimiento,fechaActual));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(p);
		
		System.out.println(json);
	}

    public static int restaFechas(String fechaNacimiento, LocalDate fechaLocal){

        int resultado = fechaLocal.getYear() - Integer.parseInt(fechaNacimiento);
        return resultado;
    }

}
