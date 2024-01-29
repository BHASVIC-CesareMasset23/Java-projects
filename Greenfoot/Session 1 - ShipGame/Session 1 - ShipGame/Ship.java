import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shipMovement();
        crateCollect();
        shipExplode();
    }
        
    public void crateCollect() 
    {
        Actor crate = getOneIntersectingObject(Crate.class);
        if (crate != null )
        {
            int xCoord = Greenfoot.getRandomNumber(590);
            int yCoord = Greenfoot.getRandomNumber(390);
            crate.setLocation(xCoord, yCoord);
        }
    }
    
    public void shipExplode() 
    {
        Actor sub = getOneIntersectingObject(Submarine.class);
        if (sub != null )
        {
            World shipWorld = getWorld();
            shipWorld.removeObject(this);
            Greenfoot.stop();
        }
    }
    
    public void shipMovement() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            setLocation(getX(), getY() + 5);
        }
    }
}
