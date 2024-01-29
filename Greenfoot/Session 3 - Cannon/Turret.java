import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Actor
{
    protected int angle = 0;
    protected int power = 100;
    
    protected StatusBoard statusBoard;
    public Turret (StatusBoard board)
    {
        statusBoard = board;
    }
    
    public Boolean noCannonBalls()
    {
        World cannonWorld = getWorld();
        java.util.List balls = cannonWorld.getObjects (CannonBall.class);
        return balls.isEmpty();
    }
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space") && noCannonBalls())
        {
            World cannonWorld = getWorld();
            CannonBall ball = new CannonBall (angle, power);
            cannonWorld.addObject(ball, getX(), getY());  
        }
        
        setRotation(-angle);
        if (Greenfoot.isKeyDown("left") && (angle < 90))
        {
            angle++;
        }
        if (Greenfoot.isKeyDown("right") && (angle > 0))
        {
            angle--;
        }
        if (Greenfoot.isKeyDown("up") && (power < 100))
        {
            power++;
        }
        if (Greenfoot.isKeyDown("down") && (power > 0))
        {
            power--;
        }
        
        statusBoard.setValues (angle, power);
    }
}
