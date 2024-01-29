import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends Actor
{
    /**
     * Act - do whatever the Crate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void crate()
    {
        setRotation(90);
    }
    
    public void act() 
    {
        crate();
        crateMovement();
        crateRemove();
    }
    
    public void crateMovement()
    {
        move(2);
    }
    
    public void crateRemove()
    {
        if (getY() >= 399)
        {
            AirRaidWorld airWorld = (AirRaidWorld)getWorld();
            airWorld.removeObject(this);
            airWorld.loseLife();
        }
    }
}
