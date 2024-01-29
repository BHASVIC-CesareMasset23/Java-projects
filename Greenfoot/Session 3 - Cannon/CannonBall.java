import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    protected int xSpeed = 0;
    protected int ySpeed = 0;
    
    public CannonBall (int angle, int power)
    {
        power = (power*10)/25;
        xSpeed = (int)(power*Math.cos(Math.toRadians(angle)));
        ySpeed = (int)(power*Math.sin(Math.toRadians(angle)));
    }
    
    public static final int GRAVITY = 2;
    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation (getX() + xSpeed, getY() - ySpeed);
        ySpeed -= GRAVITY;
        
        World cannonWorld = getWorld();
        if (getY() >= 399)
        {
            cannonWorld.removeObject(this);
        }
    }
}
