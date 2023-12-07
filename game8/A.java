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
    
    private int speed;
    public A(int newSpeed)
    {
        getImage().scale( 100, 100 );
        speed = newSpeed;
    }
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/11;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewHeight, myNewWidth);
    }
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 )
        {
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            MyWorld.enemyDragon1 -= 1;
        }
    } 
}
