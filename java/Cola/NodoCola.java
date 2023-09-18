package Cola;

public class NodoCola {
    Object valor;
    NodoCola referencia;

    public NodoCola(Object dato) {
        this.valor = dato;
        this.referencia = null;
    }

    public Object getDato() {
        return this.valor;
    }

}

