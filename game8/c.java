import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class c extends Actor
{
    /**
     * Act - do whatever the C wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int X_min = 0;
    int X_max = 600;
    int X;
    
    public c()
    {
    getImage().scale( 150, 150 );
    }
    public void act() 
    {
        
        setLocation( getX(),getY()+1 );
        
        if( isAtEdge() ){
            X = X_min + (int)(Math.random()*((X_max-X_min)+1));
            setLocation( X,0 );
        }

    } 
}
