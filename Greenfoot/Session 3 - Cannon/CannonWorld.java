import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonWorld extends World
{

    
    public CannonWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    } 
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StatusBoard status = new StatusBoard();
        status.setValues(0, 100);
        addObject(status, 50, 90);
        
        Turret turret = new Turret(status);
        addObject(turret, 20+Greenfoot.getRandomNumber(150), 380);
        
        addObject(new Target(), 350+Greenfoot.getRandomNumber(20), 375);
        
        for (int i=0; i < Greenfoot.getRandomNumber(5)+1; i++)
        {
            addObject(new Wall(), 285, 380-(50*i));
        }
    }
}

