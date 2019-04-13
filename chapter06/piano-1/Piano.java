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
        
        
            //condition 1         //condition 2  
        if((frames % 60 == 0) && (frames/60 < 14) ) {
            //only show a mwssage when we are in the bounds of the array
            //showText("Array index is: " + frames/60, 400, 250);

            //Say Hello to say everyone in the class!
            //showText("Hello " +peopleInClass[frames/60], 400, 170);

        }
        //track frames
        frames += 1;
        //show the frames
        //showText("" + frames, 100,100);

    }
}