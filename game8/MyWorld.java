import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    int X_min = 0;
    int X_max = 600;
    int X_a;
    int X_b;
    int X_c;
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        X_a = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new A(), X_a, 0 );
        X_b = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new B(), X_b, 0 );
        X_c = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new c(), X_c, 0 );
    }
    public void start(){
        
    }
}
