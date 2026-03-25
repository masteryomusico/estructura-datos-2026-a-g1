class Nodo {

    String dato;
    Nodo siguiente;

    Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Main {

    public static void main(String[] args) {

        // Crear nodos (estudiantes)
        Nodo e1 = new Nodo("Laura");
        Nodo e2 = new Nodo("Andres");
        Nodo e3 = new Nodo("Camila");
        Nodo e4 = new Nodo("Mateo");

        // Enlazar nodos
        e1.siguiente = e2;
        e2.siguiente = e3;
        e3.siguiente = e4;

        // Cabeza de la lista
        Nodo cabeza = e1;

        System.out.println("Cabeza");
        System.out.println("  |");
        System.out.println("  v");

        System.out.println("+---------+---------+   +---------+---------+   +---------+---------+   +---------+---------+");
        System.out.println("| Laura   |   o     | ->| Andres  |   o     | ->| Camila  |   o     | ->| Mateo   |  null   |");
        System.out.println("+---------+---------+   +---------+---------+   +---------+---------+   +---------+---------+");

    }
}