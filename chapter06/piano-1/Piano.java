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
    
    
    
    public Piano() 
    {
        super(800, 340, 1);
    }
    /**
     * The act method gets called repedeatly to create an animation
     */
    public void act(){
        //track frames
        frames += 1;
        //show the frames
        showText("" + frames, 100,100);
        
       
    }
}