package Ejercicio4;

public class Fuego extends Carta {

    public Fuego(String nombre, String descripcion, boolean bloqueada, int danno, int ps, String[] nombresPoderes, int[] valoresPoderes) {
        super(nombre, descripcion, bloqueada, danno, ps, TipoCarta.Fuego, nombresPoderes, valoresPoderes);
    }

    @Override
    public float calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca() {
        if (estaCao()) return 0; 
        return danno * 2;
    }

    @Override
    public String toString() {
        return "Fuego{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", bloqueada=" + bloqueada +
                ", danno=" + danno +
                ", ps=" + ps +
                ", tipo=" + tipo +
                '}';
    }
}
