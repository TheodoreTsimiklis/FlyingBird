import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe2 extends Actor
{
     int Pipe_Move = -4;
    /**
     * Act - do whatever the Pipe2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() + Pipe_Move, getY());
    }    
}
