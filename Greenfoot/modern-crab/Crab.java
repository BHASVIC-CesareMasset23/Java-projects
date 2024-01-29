import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eatWorm();
    }
    
    public void moveAndTurn() 
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        
        
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
      
    }
    
    public void eatWorm()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (worm != null)
        {
            World world;
            world = getWorld();
            world.removeObject(worm);
        }
    }    
}
