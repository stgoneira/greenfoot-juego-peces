import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaballoMar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaballoMar extends Actor
{    
    private int velocidad = 1;    
    private boolean vivo  = true;
    
    CaballoMar() {
        super();
        getImage().mirrorHorizontally();
    }
    /**
     * Act - do whatever the CaballoMar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if( !vivo ) {
            GreenfootImage caballoMuerto = new GreenfootImage("seahorse-dead.png");
            setImage(caballoMuerto);
            setLocation(getX(), getY()+2);
            return;
        }
        
        if( isTouching(Pez.class) ) {
            vivo = false;
        }
        
        if( Greenfoot.isKeyDown("up") ) {
            setLocation(getX(), getY()-velocidad);
        }
        
        if( Greenfoot.isKeyDown("down") ) {
            setLocation(getX(), getY()+velocidad);
        }
    }
}
