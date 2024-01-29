import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirRaidWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirRaidWorld extends World
{
    private StatusBoard scoreBoard;
    
    private int score = 0;
    public void increaseScore() 
    {
        score++;
        scoreBoard.updateStatus(score, lives);
    }
    public int getScore()
    {
        return score;
    }
    
    private int lives = 5;
    public void loseLife()
    {
        lives--;
        if (lives == 0)
        {
            Greenfoot.stop();
        }
        scoreBoard.updateStatus(score, lives);
    }
    public int getLives()
    {
        return lives;
    }
    /**
     * Constructor for objects of class AirRaidWorld.
     * 
     */
    public AirRaidWorld()
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
        scoreBoard = new StatusBoard();
        addObject(scoreBoard, 35, 380);
        scoreBoard.updateStatus(score, lives);
        Launcher launcher = new Launcher();
        addObject(launcher,290,376);
        Plane plane = new Plane();
        addObject(plane,72,50);
    }
}
