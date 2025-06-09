package Ejercicio2y3;

import java.util.Arrays;

public class Optimiza {
    String frases[] = { "Hola", "Angel", "que tal estas", "Angel", "Pepe", "que tal estoy" };

    /**
     * Este método busca si una frase está en la lista de frases
     * He quitado siEsta y noEsta porque no son necesarios
     */
    boolean busca(String fraseBuscar) {
        for (String frase : frases) {
            if (frase.equals(fraseBuscar)) {
                return true;
            }
        }
        return false;
    }

   

    /*
     * Devuelve la frase mas larga (si hay varias de igual tamaño devuelve la primera que se encuentra)
     * He anadido una comprobacion para evitar la lista vacia, ademas de empezar directamente en 1 el bucle
     */
    String masLarga() {
        if(frases.length == 0) {
            throw new IllegalArgumentException("La lista de frases esta vacia");
        }

        String masLarga = frases[0];
        for (int i = 1; i < frases.length; i++) {
            if (frases[i].length() > masLarga.length()) {
                masLarga = frases[i];
            }
        }
        return masLarga;
    }

    /**
     * Este cuenta cuantos frases de como minimo X letras
     * He eliminado la variable num por que no era necesaria
     */
    int cuentaFrasesMinimoLetras(int minimoLetras) {
        int contador = 0;
        for (String frase : frases) {
            if (frase.length() >= minimoLetras) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Calcula la media de caracteres de todas las frases
     * Lo unico que he hecho es anadir una comprobacion para evitar una lista vacia
     * En el ejemplo la media de todos los caracteres es 4+5+13+5+4+13 / 6 = 7.33
     */

    float mediaCaracteres() {
        if(frases.length == 0) {
            throw new IllegalArgumentException("La lista esta vacia");
        }

        float suma = 0;
        for (String frase : frases) {
            suma += frase.length();
        }
        return suma / frases.length;
    }

    /*
     * Por cada frase, devuelve el numero de caracteres de cada frase dividido por la media de caracteres totales
     * He anadido una comprobacion para evitar una lista vacia, ademas he creado una variable media para evitar
     * calcular la media varias veces
     * Contamos numero de caracteres de cada frase = [4, 5, 13, 5, 4, 13]
     * Numero total de frases = 6
     * Media total de caracteres = 4+5+13+5+4+13 / 6 = 7.33
     * Dividimos el numero de caracteres de cada frase por la media total de caracteres
     * [0.5714286, 0.71428573, 1.8571428, 0.71428573, 0.5714286, 1.8571428]
     */
    float[] numerosCaracteresEntreMediaTotal() {
        if(frases.length == 0) {
            throw new IllegalArgumentException("La lista esta vacia");
        }

        float media = mediaCaracteres();
        float[] resultado = new float[frases.length];
        for (int i = 0; i < frases.length; i++) {
            resultado[i] = frases[i].length() / media;
        }
        return resultado;
    }

    /**
     * Devuelve la frase que mas se repite (moda)
     * Simplemente he cambiado el == por un .equals para comparar las cadenas
     */
String moda() {
    int maximaVecesQueSeRepite = 0;
    String moda = "";
    for (int i = 0; i < frases.length; i++) {
        int vecesQueSeRepite = 0;
        for (int j = 0; j < frases.length; j++) {
            if (frases[i].equals(frases[j]))
                vecesQueSeRepite++;
        }
        if (vecesQueSeRepite > maximaVecesQueSeRepite) {
            moda = frases[i];
            maximaVecesQueSeRepite = vecesQueSeRepite;
        }
    }
    return moda;
}


    /**
     * He eliminado la variable moda2 y he refactorizado la moda1 para que sea moda simplemente
     * He sacado el calculo de mediaEntera fuera del bucle para evitar calcularla varias veces
     */
    int calcula() {
        int moda = moda().length();
        int mediaEntera = (int) mediaCaracteres();
        int l = 0;
        for (int i = 0; i < frases.length; i++) {
            l += frases[i].length() + Math.abs(moda) + Math.abs(moda) + mediaEntera;
        }
        return l / 8;
    }

    public static void main(String[] args) {
        new Optimiza();
    }

    public Optimiza() {
        System.out.println("Frases: " + Arrays.toString(frases));
        System.out.println("Contiene la frase Angel:" + busca("Angel"));
        System.out.println("Contiene la frase Bea:" + busca("Bea"));
        System.out.println("Hay " + cuentaFrasesMinimoLetras(5) + " frases de mínimo 5 letras");
        System.out.println("La frase mas larga es: " + masLarga());
        System.out.println("La moda vale:" + moda());
    }
}
