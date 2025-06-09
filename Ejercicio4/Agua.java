package Ejercicio4;

public class Agua extends Carta {

    public Agua(String nombre, String descripcion, boolean bloqueada, int danno, int ps, String[] nombresPoderes, int[] valoresPoderes) {
        super(nombre, descripcion, bloqueada, danno, ps, TipoCarta.Agua, nombresPoderes, valoresPoderes);
    }

    @Override
    public float calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca() {
        if (estaCao()) return 0; 
        return danno;    
        
    }

    @Override
    public String toString() {
        return "Agua{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", bloqueada=" + bloqueada +
                ", danno=" + danno +
                ", ps=" + ps +
                ", tipo=" + tipo +
                '}';
    }
}
