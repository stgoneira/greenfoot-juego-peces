import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    private String direccion        = "DERECHA";
    private int distanciaMovimiento = 1;    
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {            
        nadar();        
    }
    
    private void nadar() {        
        if( isAtEdge() ) {
            getImage().mirrorHorizontally();            
            distanciaMovimiento = 50;
            cambiarDireccion();
        } else {
            distanciaMovimiento = 1;
        }
        
        if( direccion == "DERECHA" ) {
            move( distanciaMovimiento );    
        } else {
            move( distanciaMovimiento * -1 );
        }   
    }
    
    private void cambiarDireccion() {
        if( direccion == "IZQUIERDA" ) {
            direccion = "DERECHA";
        } else {
            direccion = "IZQUIERDA";
        }
    }
}
