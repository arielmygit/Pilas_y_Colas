package Cola;

public class Cola {
    NodoCola header;
    int size;

    public Cola() {
        this.header = null;
        this.size = 0;
    }

    public void enqueue(Object valor) {

        if (header == null) {
            NodoCola nodoCola = new NodoCola(valor);
            header = nodoCola;
            size++;
        } else {
            if (size >= 1) {
                int control = 0;
                NodoCola tmp = header;
                NodoCola nodoCola = new NodoCola(valor);
                while (control < (size - 1)) {
                    tmp = tmp.referencia;
                    control++;
                }
                tmp.referencia = nodoCola;
                size++;
            }
        }
    }

    public void deque() {
        if (header != null) {
            NodoCola temporal = header;
            header = temporal.referencia;
            size--;
        } else {
            System.out.println("Cola vacia");
        }
    }

    public void peek() {
        if (header != null) {
            for (NodoCola temporal = header; temporal != null; temporal = temporal.referencia) {
                System.out.println(temporal.getDato());
            }
        } else {
            System.out.println("Cola vacia");
        }
    }
}
