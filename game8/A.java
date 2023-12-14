

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
    
    int X_min = 0;
    int X_max = 600;
    int X;
    
    public A()
    {
        getImage().scale( 100, 100 );
    }
    public void act()
    {
        /*if( Greenfoot.isKeyDown( "1" ) ){
            setRotation(180);
            move(20);
        }
        if( Greenfoot.isKeyDown( "2" ) ){
            setRotation(0);
            move(20);
        }*/
        
        //setRotation(-90);
        //move(-1);
        setLocation( getX(),getY()+3 );
        
        if( isAtEdge() ){
            X = X_min + (int)(Math.random()*((X_max-X_min)+1));
            setLocation( X,0 );
        }
        
    } 
}
