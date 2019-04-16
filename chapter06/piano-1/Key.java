import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * instance variables 
     * These can be used anywhere in the class below.
     */
    //keep track whether a key was just pressed
    private boolean keyAlreadyDown;
    //will contain the key and sound file that this instance of the class will play
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        //No key has been presssed
        keyAlreadyDown=false;
        //Set the instance vaiables using the perameters
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //animate the piano key being pressed 
        //condition 1 is the G key being pressed 
        //condition 2 was the key NOT already down
        
        if( Greenfoot.isKeyDown(key) && !keyAlreadyDown){
            //key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;

        }
        
        //stop showing the key being pressed
        //Condition 1 - the key was down the last time act() fired
        //Condition 2 - the "g" key has been released 'no loner being pressed'
        
        if (keyAlreadyDown == true && !Greenfoot.isKeyDown(key)){
            //key is up
            setImage("white-key.png");
            keyAlreadyDown = false;

        }
    }
    /**
     * play the not of this key
     */
    public void play(){
        Greenfoot.playSound(sound + ".wav");

    }
}
