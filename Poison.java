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
            World world = getWorld();
            world.removeObject(this);
            //Subworld spawnObject = new Subworld();
            //spawnObject.spawner();
            world.addObject(this, Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
        }
    }
   }