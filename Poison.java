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
        mover();
    }
    int a = 2;
    int b = Greenfoot.getRandomNumber(270);
    public void mover()
    {
        move(a);
        if (atWorldEdge())
        {
            World world = getWorld();
            turn(b);
            a = a + 1;
            //Subworld spawnObject = new Subworld();
            //spawnObject.spawner();
            
            //world.addObject(this, Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
        }
        if (a > 10)
        {
            a = 10;
        }
    }
   }