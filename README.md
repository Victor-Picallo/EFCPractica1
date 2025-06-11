EJERCICIO 1.-

Dadas las clase BolaHelado y Helado haz documentación y complejidad algorítmica de la clase Helado únicamente, además indica que el método obtenerBolasFormatoTexto está deprecado.
```
import java.util.ArrayList;

class BolaHelado {
   private String nombre;
   private float precio;

   public BolaHelado(String nombre, float precio) {
       super();
       this.nombre = nombre;
       this.precio = precio;
   }

   public String get ombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public float getPrecio() {
       return precio;
   }

   public void setPrecio(float precio) {
       this.precio = precio;
   }
}




public class Helado {
   final static float PRECIO_BASE = 5;
  
   private ArrayList<BolaHelado> listaBolas = new ArrayList<BolaHelado>();

   public int getCantidadBolas() {
       return listaBolas.size();
   }

   public float getCosteHelado() {
       float coste = PRECIO_BASE;
       for (BolaHelado i : listaBolas) {
           coste += i.getPrecio();
       }
       return coste;
   }

   public void addBola(BolaHelado bola) {
       listaBolas.add(bola);
   }

   public void quitarBola(BolaHelado bola) {
       listaBolas.remove(bola);
   }

   public void quitarTodasLasBolas() {
       listaBolas.clear();
   }

   public String obtenerBolasFormatoTexto() {
       String resultado = "";
       for (BolaHelado i : listaBolas) {
           resultado += i.getNombre();
           resultado += "\n";
       }
       return resultado;
   }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       for (BolaHelado i : listaBolas) {
           sb.append(i.getNombre());
           sb.append("\n");
       }
       return sb.toString();
   }

}
```

EJERCICIO 2.-
Dada la clase Optimiza optimiza sus métodos e indica qué cambios has realizado.
```
import java.util.Arrays;

public class Optimiza {
   String frases[] = { "Hola", "Angel", "que tal estas", "Angel", "Pepe", "que tal estoy"};

   /* Este método busca si una frase está en la lista de frases */
   boolean busca(String fraseBuscar) {
       boolean siEsta = false;
       boolean noEsta = true;
       for (String frase : frases) {
           if (frase.equals(fraseBuscar)) {
               siEsta = true;
               noEsta = false;
           }
       }
       noEsta = !siEsta;
       return siEsta;
   }

   /* Devuelve la frase mas larga (si hay varias de igual tamaño devuelve la primera que se encuentra) */
   String masLarga() {
       String masLarga = frases[0];
       for(int i=0;i<frases.length;i++){
           if (frases[i].length() > masLarga.length()) {
               masLarga = frases[i];
           }
       }
       return masLarga;
   }
   /* Este cuenta cuantos frases de como minimo X letras */
   int cuentaFrasesMinimoLetras(int minimoLetras) {

   
    int contador = 0;
       int num = contador;
       for (String frase : frases) {
           if (frase.length() >= minimoLetras) {
               num = contador;
               contador++;
           }
       }
       num = num / frases.length;
       return contador;
   }


    /* Calcula la media de caracteres de todas las frases*/
   // En el ejemplo la media de todos los caracteres es 4+5+13+5+4+13  /  6  = 7.33
    float mediaCaracteres(){
       float suma = 0;
       for(String frase: frases){
           suma+=frase.length();
       }
       return suma / frases.length;
   }
  
   /* Por cada frase, devuelve el numero de caracteres de cada frase dividido por la media de caracteres totales  */
   // Contamos numero de caracteres de cada frase = [4, 5, 13, 5, 4, 13]
   // Numero total de frases = 6
   // Media total de caracteres  = 4+5+13+5+4+13  /  6  = 7.33
   // Dividimos el numero de caracteres de cada frase por la media total de caracteres
   // [0.5714286, 0.71428573, 1.8571428, 0.71428573, 0.5714286, 1.8571428]
   float[] numerosCaracteresEntreMediaTotal(){
       float[] resultado = new float[frases.length];
       for(int i=0;i<frases.length;i++){
           resultado[i] = frases[i].length() / mediaCaracteres();
       }
       return resultado;
   }

   /* Devuelve la frase que mas se repite (moda) */
   String moda() {
       int maximaVecesQueSeRepite = 0;
       String moda = "";
       for (int i = 0; i < frases.length; i++) {
           int vecesQueSeRepite = 0;
           for (int j = 0; j < frases.length; j++) {
               if (frases[i] == frases[j])
                   vecesQueSeRepite++;
           }
           if (vecesQueSeRepite > maximaVecesQueSeRepite) {
               moda = frases[i];
               maximaVecesQueSeRepite = vecesQueSeRepite;
           }
       }
       return moda;
   }





   int calcula(){
       int moda1 = moda().length();
       int moda2 = moda().length();
       int l = 0;
       for(int i=0;i<frases.length;i++){
           int mediaEntera = (int)mediaCaracteres();
           l += frases[i].length() + Math.abs(moda1) + Math.abs(moda2) + mediaEntera;
       }
       return l/8;
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
```

EJERCICIO 3.-
Crea los test necesarios para los métodos Busca, cuentaFrasesMinimoLetras, mediaCaracteres. 


EJERCICIO 4.-
Refactoriza la siguiente clase.
```
public class Carta {
   String nombre="default"; // nombre de la carta
   String descripcion; // Breve descripción de la carta
   boolean bloquedada=false; // Determina si la carta está bloqueada
   int danno=100; // Daño que produce la carta al atacar
   int ps=10; // Puntos de vida
   TipoCarta tipo = TipoCarta.Planta; // Tipo de carta (planta, fuego, agua, electrico)
  
   // Datos de los poderes (pueden ser varios) que contiene esta carta. Su nombre y su valor
   String nombresPoderes[];
   int valoresPoderes[];

   int voltaje=5; // Cantidad de voltaje, usado para las cartas de tipo Electrico

   enum TipoCarta {
       Planta, Fuego, Agua, Electrico
   };

   // Calcula si la carta se puede usar
   boolean estaCao(){
       if(ps < 0 || ps == 0){
           if(bloquedada){
               return true;
           }else{
               return true;
           }
       }else{
           if(bloquedada){
               return true;
           }else{
               return false;
           }
       }
   }

   // Calcula el daño de una carta
   float calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca() {
       switch (tipo) {
           case Planta:
               if(estaCao()) return 0;
               return danno/2;
           case Fuego:
               if(estaCao()) return 0;
               return danno*2 ;
           case Agua:
               if(estaCao()) return 0;
               return danno;
           case Electrico:
               if(estaCao()) return 0;
               if(voltaje<=0) return 0;
               return danno*voltaje*0.1f;
           default:
               return 0;
       }

   }

   public static void main(String[] args) {

       Carta c=new Carta();
       c.tipo=TipoCarta.Electrico;
       System.out.println(c.calcularDannoDeLaCartaQueSeVaAAplicarCuandoAtaca());
      
   }
}
```
