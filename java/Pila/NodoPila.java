package Pila;

import Cola.NodoCola;

public class NodoPila {
    Object valor;
    NodoPila referencia;

    public NodoPila(Object dato) {
        this.valor = dato;
        this.referencia = null;
    }

    public Object getValor() {
        return this.valor;
    }
}
