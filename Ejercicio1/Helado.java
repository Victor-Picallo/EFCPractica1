import java.util.ArrayList;

/**
 * Copyright (c) 2025, Victor todos los derechos reservados.
 */

 /**
  * Clase que representa a un helado
  * @author Victor
  * @version 1.0
  */
public class Helado {
 
/**
 * Precio base del helado
 */
 final static float PRECIO_BASE = 5;
    
   /**
    * Lista de bolas
    * O(n)
    */
   private ArrayList<BolaHelado> listaBolas = new ArrayList<BolaHelado>();

   /**
    * Metodo para obtener la cantidad de bolas que tiene el helado
    * @return Cantidad de bolas del helado
    * O(1)
    */
   public int getCantidadBolas() {
       return listaBolas.size();
   }

   /**
    * Metodo para obtener el coste del helado
    * @return Coste del helado
    * O(n)
    */
   public float getCosteHelado() {
       float coste = PRECIO_BASE;
       for (BolaHelado i : listaBolas) {
           coste += i.getPrecio();
       }
       return coste;
   }

   /**
    * Metodo para anadir una bola al helado
    * @param bola Bola que anades al helado
    * O(1)
    */
   public void addBola(BolaHelado bola) {
       listaBolas.add(bola);
   }

   /**
    * Metodo para quitar una bola del helado
    * @param bola Bola que quitas del helado
    * O(n)
    */
   public void quitarBola(BolaHelado bola) {
       listaBolas.remove(bola);
   }

   /**
    * Metodo para quitar todas las bolas de la lista de bolas
    * O(n)
    */
   public void quitarTodasLasBolas() {
       listaBolas.clear();
   }

   /**
    * Metodo para obtener las bolas del helado en formato texto
    * @return Bolas del helado en formato texto
    * O(n)
    * @deprecated Este metodo esta obsoleto, se usa el toString() en su lugar
    */
   public String obtenerBolasFormatoTexto() {
       String resultado = "";
       for (BolaHelado i : listaBolas) {
           resultado += i.getNombre();
           resultado += "\n";
       }
       return resultado;
   }

   /**
    * Metodo para obtener las bolas del helado en formato texto
    * @return Bolas del helado en formato texto
    * O(n)
    */
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

