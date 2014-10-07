/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alejandro;
/*Encapsular la clase */
public class Usuario {
    //regla no.1 atributos con modificador private
    
    private int id;
    private String nombre;
    private String email;
    //regla no.2 agregar los metodos accesorios (getter´s)
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
    //regla no.3 crear por cada atributo su metodo mutador setter´s
    public void setId(int id){
        this.id=id;               
    }
    public void setNombre(String nombre){
        this.nombre=nombre; 
    }               
    public void setEmail (String email){
        this.email=email;
    }
    
}
