import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int X_min = 0;
    int X_max = 600;
    int X;
    
    public B()
    {
        getImage().scale( 100, 100 );
    }
    public void act() 
    {
        
        setLocation( getX(),getY()+2 );
        
        if( isAtEdge() ){
            X = X_min + (int)(Math.random()*((X_max-X_min)+1));
            setLocation( X,0 );
        }

    }    
}
