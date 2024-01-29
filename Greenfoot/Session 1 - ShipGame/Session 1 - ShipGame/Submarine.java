import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Submarine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submarine extends Actor
{
    /**
     * Act - do whatever the Submarine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bombDrop();
        subMovement();
    }
    
    public void bombDrop()
    {
        int random = random = Greenfoot.getRandomNumber(1000);
        if (random < 10)
        {
            World w = getWorld();
            Actor bomb = new Bomb();
            w.addObject(bomb, getX(), getY());
            bomb.setLocation(getX(), getY() + 5);
        }
    }
    
    public void subMovement()
    {
        move(5);
        int random = Greenfoot.getRandomNumber(100);
        if (random  < 10)
        {
            random = Greenfoot.getRandomNumber(20);
            turn(random - 10);
        }
        int xCoord = getX();
        int yCoord = getY();
        if (xCoord <= 0 || xCoord >= 599)
        {
            xCoord -= 599;
            if (xCoord < 0) {
                xCoord *= -1;
            }
            setLocation(xCoord, yCoord);
        }      
        if (yCoord <= 0 || yCoord >= 399)
        {
            yCoord -= 399;
            if (yCoord < 0) {
                yCoord *= -1;
            }
            setLocation(xCoord, yCoord);
        }
    }
}
