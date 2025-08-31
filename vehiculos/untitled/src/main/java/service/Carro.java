package service;

import java.util.Arrays;

public class Carro {
    private Llanta[] llantas;

    public Carro() {
        llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(15);
        }
    }

    public void cambiarLlanta(int posicion, Llanta nueva) {
        if (posicion >= 0 && posicion < llantas.length) {
            llantas[posicion] = nueva;
        }
    }

    public Llanta getLlanta(int posicion) {
        if (posicion >= 0 && posicion < llantas.length) {
            return llantas[posicion];
        }
        return null;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "llantas=" + Arrays.toString(llantas) +
                '}';
    }
}
