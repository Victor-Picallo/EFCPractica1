package Ejercicio4;

public abstract class Carta {
    protected String nombre = "default";
    protected String descripcion;
    protected boolean bloqueada = false;
    protected int danno = 100;
    protected int ps = 10;
    protected TipoCarta tipo;
    protected String nombresPoderes[];
    protected int valoresPoderes[];

    enum TipoCarta {
        Planta, Fuego, Agua, Electrico
    };

    public Carta(String nombre, String descripcion, boolean bloqueada, int danno, int ps, TipoCarta tipo,
            String[] nombresPoderes, int[] valoresPoderes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bloqueada = bloqueada;
        this.danno = danno;
        this.ps = ps;
        this.tipo = tipo;
        this.nombresPoderes = nombresPoderes;
        this.valoresPoderes = valoresPoderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    public String[] getNombresPoderes() {
        return nombresPoderes;
    }

    public void setNombresPoderes(String[] nombresPoderes) {
        this.nombresPoderes = nombresPoderes;
    }

    public int[] getValoresPoderes() {
        return valoresPoderes;
    }

    public void setValoresPoderes(int[] valoresPoderes) {
        this.valoresPoderes = valoresPoderes;
    }

    // Calcula si la carta se puede usar
    public boolean estaCao() {
        return ps <= 0 || isBloqueada();
    }

    // Calcula el daño de una carta
    public abstract float calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca();
}
