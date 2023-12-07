import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static int enemyDragon1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void addEnemyCars()
    {
        addObject(new EnemyCar1(8, score), getRandomNumber(80, 320), 0); // Pasa la referencia de score
        addObject(new EnemyCar1(6, score), getRandomNumber(80, 320), 0); // Pasa la referencia de score
        
        enemyCars += 2;
    }
}
