import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        planeMovement();
        dropCrate();
    }  
    
    public void planeMovement()
    {
        move(8);
        
        if (getX() <= 0 || getX() >= 599)
        {
            turn(180);
        }
    }
    
    public void dropCrate()
    {
        int rand = Greenfoot.getRandomNumber(100);
        
        if (rand == 1)
        {
            World airWorld = getWorld();
            airWorld.addObject(new Crate(), getX(), getY());
                
        }
    }
}
