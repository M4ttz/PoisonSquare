import greenfoot.*;
import java.lang.Class;

/**
 * Write a description of class Poison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poison extends Animal
{
    /**
     * Act - do whatever the Poison wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (canSee(User.class));
        {
            eat(User.class);
        }
        move();
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
            //Subworld spawnObject = new Subworld();
            //spawnObject.spawner();
            getWorld().addObject(this, Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
   }