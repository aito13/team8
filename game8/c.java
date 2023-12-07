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
    public c()
    {
    getImage().scale( 150, 150 );
    }
    public void act() 
    {
        
        if( Greenfoot.isKeyDown( "A" ) ){
            setRotation(180);
            move(50);
        }
        if( Greenfoot.isKeyDown( "D" ) ){
            setRotation(0);
            move(50);
        }

    } 
}
