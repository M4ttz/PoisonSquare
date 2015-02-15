import greenfoot.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class Messenger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Messenger extends Actor
{
    /**
     * Act - do whatever the Messenger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        JOptionPane.showMessageDialog(null, "Try to avoid the red squares for as long as possible!", "Good luck!", JOptionPane.WARNING_MESSAGE);
    }    
    
    //public void endGame()
    //{
        //JOptionPane.showMessageDialog(null, "You lost! Click the restart button to play again.", "You lose!", JOptionPane.WARNING_MESSAGE);
        //getWorld().removeObject(this);
    //}
}
