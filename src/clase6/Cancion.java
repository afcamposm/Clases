/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String titulo;
    
    public Cancion(){
        this.titulo = "Close to me";;
    }
    public Cancion(String titulo){
        this.titulo = titulo;
                
    }
    public void sonar(){
        System.out.println("Sonando cancion: " + this.titulo);
    }
    
}
    
