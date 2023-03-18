public class Prueba_Pila_Cola {
    public static void main(String[] args) {
        // Prueba de la clase Cola
        Cola cola = new Cola(5);
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        System.out.println("Elementos de la cola:");
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }
        cola.desencolar(); // Debería mostrar un mensaje indicando que la cola está vacía

        // Prueba de la clase Pila
        Pila pila = new Pila(5);
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);
        System.out.println("Elementos de la pila:");
        while (!pila.estaVacia()) {
            System.out.println(pila.desapilar());
        }
        pila.desapilar(); // Debería mostrar un mensaje indicando que la pila está vacía
    }
}
