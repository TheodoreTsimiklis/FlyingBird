import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        /**
        * Write a description of class FlappyBird here.
        * 
        * @author (your name) 
        * @version (a version number or a date)
        */
       public class FlappyBird extends Actor
        {
        double grav = 0;
        double realGrav = 1.2;
        double Jump_Speed = -9.5;
        private GreenfootImage image1 = null;
        private GreenfootImage image2 = null;
        private GreenfootImage image3 = null;
        private boolean spaceDown;
        
        public FlappyBird()
        {
        image1 = new GreenfootImage("flappy1.png");
        image2 = new GreenfootImage("flappy2.png");
        image3 = new GreenfootImage("flappy3.png");
        }
        /**
        * Act - do whatever the FlappyBird wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() 
        {
        Animation();
        
        // game over when touching pipe
        if (getOneIntersectingObject(Pipe.class) != null) {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth() / 2, getWorld().getHeight() / 2); 
            Greenfoot.playSound("DieSound.wav");
            Greenfoot.stop();
        }
    
        if (getOneIntersectingObject(Pipe2.class) != null) {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth() / 2, getWorld().getHeight() / 2); 
            Greenfoot.playSound("DieSound.wav");
            Greenfoot.stop();
        }
       
       
        setLocation( getX(), (int) (getY() + grav) );
    
        if (Greenfoot.isKeyDown("space") == true) {
        grav = Jump_Speed;
        //Greenfoot.playSound("WingSound.wav");
            Animation();
        }
        
        if (grav <= 10) {
            setRotation(-20);
        }
        else if (grav >= -10) {
                setRotation(20);
        }
        
        
        // Game over when flappy bird touches ground
        if (getY() > 445) {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth() / 2, getWorld().getHeight() / 2); 
            Greenfoot.playSound("DieSound.wav");
            Greenfoot.stop();
        }
        grav = grav + realGrav;
        
    }    
    public void Animation() {
        if(getImage() == image1) {
            setImage(image2);
        }   
        else{
          setImage(image3);
        }
      
    }
}
