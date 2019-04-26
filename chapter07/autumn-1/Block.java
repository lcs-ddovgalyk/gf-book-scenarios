import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkForLeafCollision();
    }
    
    /**
     * Remove a Leaf object if we are interesecting 
     */
    private void checkForLeafCollision(){
        //Get an object reference toa sible Leaf from any Lead object we are currently intersecting
        //NOTE: By placing a type in brackets before the call to getOneIntersectingObject
        //   we ***cast*** (force) the type to change from Actor to Leaf
        //NOTE 2: We can do this because the leaf is a sunclass of Actor.
        Leaf someLeaf = (Leaf) getOneIntersectingObject(Leaf.class);
        
        //check that the someLeaf object actually has a reference to an object
        //If it is a null, that means there was no leaf inresecting the Block this time around
        if (someLeaf != null){
            // someLeaf is NOT null... so now we can remove it
            World myWorld = getWorld();
            myWorld.removeObject(someLeaf);
            
            
        }
    }
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
        
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            
            //add new Leaf object to the world
            //1.add a reference to the world
            World myWorld = getWorld();
            //2. Use the object refference to call, or use, a method on the Wrold Object
            myWorld.addObject(new Leaf(), getX()+100, getY()+100);
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            // do this when the mouse is clicked. currently: nothing.
        }
    }
    
}
