import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    int x;
    int y;
    
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
        for(int index=0; index<19; index+=1){
            x = Greenfoot.getRandomNumber(600);
            y = Greenfoot.getRandomNumber(400);
            addObject(new Leaf(), x, y);
            
        }
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }
}
