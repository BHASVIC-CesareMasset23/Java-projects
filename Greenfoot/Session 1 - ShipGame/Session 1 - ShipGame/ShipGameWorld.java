import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipGameWorld extends World
{

    /**
     * Constructor for objects of class ShipGameWorld.
     * 
     */
    public ShipGameWorld()
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
        Ship ship = new Ship();
        addObject(ship,155,283);
        Submarine submarine = new Submarine();
        addObject(submarine,284,207);
        Crate crate = new Crate();
        addObject(crate,210,104);
        Crate crate2 = new Crate();
        addObject(crate2,414,295);
    }
}
