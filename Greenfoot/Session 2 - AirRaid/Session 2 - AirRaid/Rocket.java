import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int delay = 500; 
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void rocket()
    {
        setRotation(270);
    }
    
    public void act() 
    {
        rocket();
        rocketMovement();
        rocketRemove();
        crateRemove();
    }
    
    public void rocketMovement()
    {
        move(10);
    }
    
    public void rocketRemove()
    {
        if (getY() <= 0)
        {
            World airWorld = getWorld();
            airWorld.removeObject(this);
        }
    }
    
    public void crateRemove()
    {
        Actor actor = getOneIntersectingObject (Crate.class);
        if (actor != null)
        {
            AirRaidWorld airWorld = (AirRaidWorld)getWorld();
            airWorld.removeObject(actor);
            airWorld.removeObject(this);
            airWorld.increaseScore();
        }
        else
        {
            actor = getOneIntersectingObject (Plane.class);
            if (actor != null)
            {
                AirRaidWorld airWorld = (AirRaidWorld)getWorld();
                airWorld.removeObject(actor);
                airWorld.removeObject(this);
                airWorld.increaseScore();
                airWorld.increaseScore();
                airWorld.increaseScore();
                
                if (delay > 0)
                {
                    delay = delay - 1;
                }
                delay = 500;
                int rand = Greenfoot.getRandomNumber(500);
                airWorld.addObject(new Plane(), rand+50, 50);
                delay = 30;
            }
            else
            {
                if (getY() <= 10)
                {
                    World airWorld = getWorld();
                    airWorld.removeObject(this);
                }
            }
        }
    }   
}
