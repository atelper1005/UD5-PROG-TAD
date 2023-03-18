import java.util.LinkedList;

public class Pila {
    private LinkedList<Integer> lista;
    private int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        lista = new LinkedList<Integer>();
    }

    public boolean apilar(int elemento) {
        if (lista.size() < capacidad) {
            lista.addFirst(elemento);
            return true;
        } else {
            return false;
        }
    }

    public int desapilar() {
        if (!lista.isEmpty()) {
            return lista.removeFirst();
        } else {
            return -1; // Opcional: lanzar una excepción o mostrar un mensaje de error
        }
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public boolean estaLlena() {
        return lista.size() == capacidad;
    }
}
