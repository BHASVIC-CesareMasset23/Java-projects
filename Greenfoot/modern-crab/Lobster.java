import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveLobster();
        eatCrab();
    }
    
    public void moveLobster()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 9)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        
        if (getX() <= 8 || getX() >= getWorld().getWidth() - 8)
        {
            turn(180);
        }
        if (getY() <= 8 || getY() >= getWorld().getHeight() - 8)
        {
            turn(180);
        }
    }
    
    public void eatCrab()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (crab != null)
        {
            World world;
            world = getWorld();
            crab.setLocation(250, 250);
            crab.setRotation(90);
        }
    }
}
