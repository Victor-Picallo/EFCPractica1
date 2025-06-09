package Ejercicio4;

public class Electrico extends Carta {
    int voltaje=5;
    
    public Electrico(String nombre, String descripcion, boolean bloqueada, int danno, int ps, String[] nombresPoderes, int[] valoresPoderes, int voltaje) {
        super(nombre, descripcion, bloqueada, danno, ps, TipoCarta.Electrico, nombresPoderes, valoresPoderes);
        this.voltaje = voltaje;
    }

    @Override
    public float calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca() {
        if (estaCao()) return 0; 
        if (voltaje <= 0) return 0;
        return danno * voltaje * 0.1f;
    }

    @Override
    public String toString() {
        return "Electrico{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", voltaje=" + voltaje +
                ", bloqueada=" + bloqueada +
                ", danno=" + danno +
                ", ps=" + ps +
                ", tipo=" + tipo +
                '}';
    }
}
