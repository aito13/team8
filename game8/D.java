import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D extends Actor
{
    /**
     * 
     */
    public D()
    {
        getImage().scale(50, 70);
    }
    /**
     * Act - do whatever the D wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(0);
            move(-4);
        }
        /*if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-90);
            move(1);
        }
            if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(1);
        }*/
        
        Actor a = getOneIntersectingObject( A.class );
        Actor b = getOneIntersectingObject( B.class );
        Actor C = getOneIntersectingObject( c.class );
        if( a != null || b != null || C != null){
            getWorld().showText( "GAME OVER", 300, 200 );
            Greenfoot.stop();
        }
    }
}
