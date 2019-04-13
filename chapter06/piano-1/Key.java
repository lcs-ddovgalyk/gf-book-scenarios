import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * instance variables 
     * These can be used anywhere in the class below.
     */
    //keep track whether a key was just pressed
    private boolean keyAlreadyDown;

    /**
     * Create a new key.
     */
    public Key()
    {
        //No key has been presssed
        keyAlreadyDown=false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //animate the piano key being pressed 
        //condition 1 is the G key being pressed 
        //condition 2 was the key already down
        
        if( Greenfoot.isKeyDown("g") && keyAlreadyDown == false ){
            //key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;

        }
        
        //stop showing the key being pressed
        //Condition 1 - the key was down the last time act() fired
        //Condition 2 - the "g" key has been released 'no loner being pressed'
        
        if ((keyAlreadyDown == true) && (Greenfoot.isKeyDown("g") == false)){
            //key is up
            setImage("white-key.png");
            keyAlreadyDown = false;

        }
    }
    /**
     * play the not of this key
     */
    public void play(){
        Greenfoot.playSound("3a.wav");

    }
}
