package dad;


import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

import com.google.gson.GsonBuilder;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Persona p = new Persona();
        String nombre, apellidos;
        LocalDate fechaActual = LocalDate.now();
        int year,yearPerson,total;
        year = fechaActual.getYear();

        System.out.println("Introduce un nombre:");
        nombre = in.nextLine();
        p.setNombre(nombre);

        System.out.println("Introduce un apellido");
        apellidos = in.nextLine();
        p.setApellidos(apellidos);
        
        System.out.println("Introduce tu año de nacimiento");
        p.setFechaNac(Instant.now());

        InstantAdapter ia = new InstantAdapter();
		
		Gson gson = new GsonBuilder()
						.registerTypeAdapter(Instant.class, ia)
						.setPrettyPrinting()
						.create();
                        
		String json = gson.toJson(p);
		
		System.out.println(json);
	}

}
