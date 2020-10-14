 import java.lang.Class;
 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int score = 0;
    int First_Pipe = 285;
    Score scoreObject = null;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1, false); 
        setPaintOrder(Score.class, GameOver.class, FlappyBird.class, Ground.class, Pipe.class, Pipe2.class);
        FlappyBird flappy = new FlappyBird();
        Ground Border = new Ground();
        scoreObject = new Score();
        addObject(flappy, 100, getHeight() / 2);
        addObject(Border, getWidth() / 2, 475);
        addObject(scoreObject, 50, 25);
        scoreObject.setScore(0);
        prepare();
    }

    public void act() {
        pipeCounter++;

        if (pipeCounter % 100 == 0) {
            // creating a pipe
            Pipe pipe = new Pipe();
            Pipe2 pipe2 = new Pipe2();
            GreenfootImage image = pipe.getImage();
            addObject(pipe, getWidth(), Greenfoot.getRandomNumber(10));
            addObject(pipe2, getWidth(), getHeight() + 100);

        }
        if (pipeCounter >= First_Pipe) {
            if (flappyCounter % 100 == 0) {
                score++;
                scoreObject.setScore(score);
                Greenfoot.playSound("PointSound.wav");
            }
            flappyCounter++;
        }
     
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
