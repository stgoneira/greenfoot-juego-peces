import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MundoAcuatico extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MundoAcuatico()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CaballoMar caballoMar = new CaballoMar();
        addObject(caballoMar, 550, 100);
        Pez pez = new Pez();
        addObject(pez,103,119);
        Pez pez2 = new Pez();
        addObject(pez2,263,67);        
        Pez pez3 = new Pez();
        addObject(pez3,174,246);
        Pez pez4 = new Pez();
        addObject(pez4,334,308);
        Pez pez5 = new Pez();
        addObject(pez5,302,176);
        Pez pez6 = new Pez();
        addObject(pez6,439,94);
        Pez pez7 = new Pez();
        addObject(pez7,468,249);
    }
}
