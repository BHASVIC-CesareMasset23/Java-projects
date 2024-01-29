import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StatusBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatusBoard extends Actor
{
    protected GreenfootImage background = null;
    
    public StatusBoard()
    {
        background = new GreenfootImage(100, 180);
        background.setColor(Color.WHITE);
        background.fillRect(0, 0, 150, 60);
        setImage(background);
    }
    
    public void setValues(int angle, int power)
    {
        GreenfootImage img = new GreenfootImage(background);
        img.setColor(Color.BLACK);
        img.drawString("Angle: " + angle, 10, 21);
        img.drawString("Power: " + power, 10, 44);
        setImage(img);
    }
    
    /**
     * Act - do whatever the StatusBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
