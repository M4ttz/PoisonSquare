import greenfoot.*;
import javax.swing.JOptionPane;
import java.lang.Class.*;

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Animal
{
    /**
     * Act - do whatever the MouseImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
            if(Greenfoot.mouseMoved(null))
            {
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    setLocation(mouse.getX(),mouse.getY());
            }
    }  
}
}

