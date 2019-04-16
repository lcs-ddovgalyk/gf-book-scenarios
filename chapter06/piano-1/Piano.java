import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /** 
     * Instance veriables 
     * (we can use these variables in the class)
     */

    int frames;
    //create the array 
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Osman", "Eric", "Phillip",
            "Joven", "Joe", "Gordon", "Juem", "Selena", "Sam", "Jeff","Nick"};
    //create two arrays
    //first array trakcs the keyboard keys that we will use for white piano keys
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'","\\"};
    //Second arrat trakcs the sound file for each note 
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e",
                           "4f", "4g"};
    //Array traks the keyboard keys that we will use     
    
    String[] blackKeys = {"w", "e", "", "t", "y", "u", "", "o", "p", "", "]"};
    //Array traks the sound fole
    String[] blackNotes = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f"};
    public Piano() 
    {
        super(800, 340, 1);
        frames = 0;
    }

    /**
     * The act method gets called repedeatly to create an animation
     */
    public void act(){
        //Say 'Hello' to a different person every second
        //this code runs only when the first and the second 
        //conditions are true
        int position = frames / 60;
        
        
            //condition 1         //condition 2  
        if((frames % 60 == 0) && (position < whiteKeys.length) ) {
            //only show a mwssage when we are in the bounds of the array
            
            Key aKey = new Key(whiteKeys[position], whiteNotes[position]);
            addObject(aKey, 54 + position * 63,140);
            //Say Hello to say everyone in the class!
            //showText("Hello " +peopleInClass[frames/60], 400, 170);

        }
        //track frames
        frames += 1;
        //show the frames
        //showText("" + frames, 100,100);

    }
}