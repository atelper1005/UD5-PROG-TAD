package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        List<Alumno> listaIniciacion = new ArrayList<>();
        listaIniciacion.add(new Alumno("pibe1", 0f, 0));
        listaIniciacion.add(new Alumno("piba1", 0f, 0));

        String nuevaTarea = "Tarea 1";
        agregarTarea(tareas, nuevaTarea);
        System.out.println(tareas);

        String tareaBorrar = "Tarea 1";
        agregarTarea(tareas, nuevaTarea);
        System.out.println(tareas);
    }
}