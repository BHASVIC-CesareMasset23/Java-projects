import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    private int delay = 0; 
    
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(getRotation() + 3);
        
        if (delay > 0)
        {
            delay = delay - 1;
        }
        else
        {
           if (Greenfoot.isKeyDown("space"))
            {
                World airWorld = getWorld();
                //airWorld.addObject(new Rocket(), getX(), getY());
                setRotation(getRotation() - 3);
                delay = 25;
            }
        }
    }
}
