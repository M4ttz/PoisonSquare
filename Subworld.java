import greenfoot.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class Subworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subworld extends World
{
    /**
     * Constructor for objects of class Subworld.
     * 
     */
    public Subworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        Messenger messengerObject = new Messenger();
        messengerObject.act();
    }
}