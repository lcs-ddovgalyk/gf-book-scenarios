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
        //creates 18 leafs
        createLeaf();
        
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }
    private void createLeaf(){
        //creates 18 leafes at 18 different random locations
        for(int i=0; i<19; i+=1){
            // gets a random number for the x location
            x = Greenfoot.getRandomNumber(600);
            // get a random number for the y location
            y = Greenfoot.getRandomNumber(400);
            // creates a leaf at a random location
            addObject(new Leaf(), x, y);
            
        }
    }
}
