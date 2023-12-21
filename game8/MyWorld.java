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
    private int time;
    
    GreenfootSound bgm = null;
    
    
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
        
        addObject( new D(), 300, 300 );
        
        time = 3000;
        
        //bgm = new GreenfootSound( "received_813746806262011_1.mp3" );
        bgm = new GreenfootSound( "黒猫のタンゴ.mp3" );
    }
    public void act(){
        time--;
        showTime();
        if(time < 100){
            showText( "GAME Clear", 300, 200 );
            Greenfoot.stop();
        }
    }
    private void showTime()
    {
        showText("Time: " + time/100, 550, 50);
    }
    public void started()
    {
        bgm.playLoop();
    }
    public void stopped()
    {
        bgm.stop();
    }
}
