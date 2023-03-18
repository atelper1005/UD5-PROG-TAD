import java.util.LinkedList;

public class Cola {
    private LinkedList<Integer> lista;
    private int capacidad;

    public Cola(int capacidad) {
        this.capacidad = capacidad;
        lista = new LinkedList<Integer>();
    }

    public boolean encolar(int elemento) {
        if (lista.size() < capacidad) {
            lista.addLast(elemento);
            return true;
        } else {
            return false;
        }
    }

    public int desencolar() {
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