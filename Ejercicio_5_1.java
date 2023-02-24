package ejercicios;

import java.util.TreeSet;

//Queremos crear un grupo de Personas donde no se puedan repetir personas ni introducir personas nulas. Además, queremos
// que en el grupo, cada vez que se introduzca una nueva persona, se mantenga ordenado por nombre, sin tener en cuenta
// minúsculas ni mayúsculas, de la z a la a y en caso de existir dos personas con el mismo nombre que se tenga en
// cuenta la edad de manera ascendente.
//Imprime todas las personas del grupo para probar los resultados. Además, cuenta cuantas personas hay que tengan
// la misma edad

public class Ejercicio_5_1 {
    public static void main(String[] args) {
        CompararEdades comparador1 = new CompararEdades();
        TreeSet<Persona> comparadorPersona = new TreeSet<>(new CompararEdades());

        //Al introducir dos personas que se llamen igual, pero de edad distinta, ordena primero por nombre y luego
        //por edad, del más joven al más viejo.
        Persona juan = new Persona("Juan", 25);
        Persona juan1 = new Persona("Juan", 35);

        //Si introducimos dos personas iguales, solo acepta uno de los dos, por lo que no se pueden repetir personas.
        Persona maria = new Persona("Maria", 23);
        Persona maria1 = new Persona("Maria", 23);
        Persona andres = new Persona("Andres", 28);
        comparadorPersona.add(juan);
        comparadorPersona.add(juan1);
        comparadorPersona.add(maria);
        comparadorPersona.add(maria1);
        comparadorPersona.add(andres);

        //no permite introducir una persona nula
        //comparadorPersona.add(null);

        System.out.println(comparadorPersona);

    }
}