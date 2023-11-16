// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class D extends Actor
{

    /**
     * Act - do whatever the D wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(code__dummy__gf3gen__0 invalid#)
    {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(1);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(0);
            move(-1);
        }
        
        if (Greenfoot.isKeyDown("up")) {
            setRotation(-90);
            move(1);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(1);
        }
        
    }
}
