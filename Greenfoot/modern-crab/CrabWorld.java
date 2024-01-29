import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,282,230);
        Worm worm = new Worm();
        addObject(worm,93,480);
        Worm worm2 = new Worm();
        addObject(worm2,263,424);
        Worm worm3 = new Worm();
        addObject(worm3,146,353);
        Worm worm4 = new Worm();
        addObject(worm4,427,380);
        Worm worm5 = new Worm();
        addObject(worm5,285,315);
        Worm worm6 = new Worm();
        addObject(worm6,94,230);
        Worm worm7 = new Worm();
        addObject(worm7,115,119);
        Worm worm8 = new Worm();
        addObject(worm8,220,79);
        Worm worm9 = new Worm();
        addObject(worm9,269,144);
        Worm worm10 = new Worm();
        addObject(worm10,349,71);
        Worm worm11 = new Worm();
        addObject(worm11,444,93);
        Worm worm12 = new Worm();
        addObject(worm12,544,188);
        Worm worm13 = new Worm();
        addObject(worm13,511,255);
        Worm worm14 = new Worm();
        addObject(worm14,401,267);
        Worm worm15 = new Worm();
        addObject(worm15,399,187);
        Lobster lobster = new Lobster();
        addObject(lobster,337,464);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,48,23);
    }
}
