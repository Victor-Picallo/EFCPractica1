package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        
        
        String[] nombresPoderes = {"Electrico", "Fuego", "Agua", "Planta"};
        int[] valoresPoderes = {25, 20, 15, 10};

        Carta Charizard = new Fuego("Charizard", "Pokemon volador tipo fuego", false, 120, 90, nombresPoderes, valoresPoderes);
        Carta Venusaur = new Planta("Venusaur", "Pokemon tipo planta", false, 100, 80, nombresPoderes, valoresPoderes);
        Carta Blastoise = new Agua("Blastoise", "Pokemon tipo agua", false, 110, 85, nombresPoderes, valoresPoderes);
        Carta Pikachu = new Electrico("Pikachu", "Pokemon tipo electrico", false, 95, 70, nombresPoderes, valoresPoderes, 5);

        System.out.println(Charizard);
        System.out.println(Venusaur);
        System.out.println(Blastoise);
        System.out.println(Pikachu);

        System.out.println("Danno de Charizard al atacar: " + Charizard.calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca());
        System.out.println("Danno de Venusaur al atacar: " + Venusaur.calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca());
        System.out.println("Danno de Blastoise al atacar: " + Blastoise.calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca());
        System.out.println("Danno de Pikachu al atacar: " + Pikachu.calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca());

    }
}
