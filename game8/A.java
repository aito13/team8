import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public A()
    {
    getImage().scale( 100, 100 );
    }
    public void act() 
    {
        
        if( Greenfoot.isKeyDown( "1" ) ){
            setRotation(180);
            move(15);
        }
        if( Greenfoot.isKeyDown( "2" ) ){
            setRotation(0);
            move(15);
        }

    }    
}
