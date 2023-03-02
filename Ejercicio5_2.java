package ejercicios;

import java.util.List;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        System.out.println("           Lista de Tareas   ");
        TaskList tareas = new TaskList("ArrayList");
        System.out.println("Opciones disponibles");
        System.out.println("__________________________________");
        System.out.println("1. Agrega una nueva tarea a la lista");
        System.out.println();
        TaskList.addTask(listaTareas"Tomar apuntes");
        TaskList.addTask(lista, "Apuntar posibles dudas");
        TaskList.addTask(lista, "Realizar los ejercicios correspondientes");
        TaskList.addTask(lista, "Preguntar las dudas al profesor");
        TaskList.addTask(lista, "Estudiar para el examen");
        System.out.println("2. Eliminar una tarea de la lista");
        System.out.println();
        TaskList.removeTask(lista, "Preguntar las dudas al profesor");
        TaskList.removeTask(lista, "Apuntar posibles dudas");
        System.out.println();
        System.out.println("3. Completar alguna de las tareas");
        System.out.println();
        TaskList.completeTask(lista, "Tomar apuntes");
        System.out.println();
        System.out.println("4. Imprimir todas las tareas");
        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
    }
}