/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alejandro.constructores;

public class NewMain_Pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pelicula p=new Pelicula("dracula malo",120);
       
       System.out.println(p.getTitulo());
    }
    
}
