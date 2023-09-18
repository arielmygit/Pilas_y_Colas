package Pila;

public class Pila {
    int size;
    NodoPila header;

    public Pila() {
        this.header = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(Object x) {

        if (header == null) {
            header = new NodoPila(x);
            size++;
        } else {

            if (size >= 1) {
                NodoPila nuevo = new NodoPila(x);
                nuevo.referencia = header;
                header = nuevo;
                size++;
            }
        }
    }

    public void pop() {

        if (header != null) {
            NodoPila tmp = header;
            header = tmp.referencia;
            size--;
        } else {
            System.out.println("Pila vacia");
        }
    }

    public void peek() {

        if (header != null) {
            for (NodoPila tmp = header; tmp != null; tmp = tmp.referencia) {
                System.out.println(tmp.getValor());
            }
        } else {
            System.out.println("Pila vacia");
        }
    }
}
