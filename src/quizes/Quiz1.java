/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creating city and robot
        City kw = new City();
        Robot bob = new Robot(kw,4,0,Direction.EAST);
        
        //building the walls
        new Wall(kw,4,2,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,3,3,Direction.WEST);
        new Wall(kw,3,3,Direction.NORTH);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,5,Direction.NORTH);
        new Wall(kw,2,5,Direction.EAST);
        new Wall(kw,2,5,Direction.NORTH);
        new Wall(kw,3,6,Direction.EAST);
        new Wall(kw,3,6,Direction.NORTH);
        new Wall(kw,4,7,Direction.EAST);
        new Wall(kw,4,7,Direction.NORTH);
        
        
        //building the things
        new Thing(kw,4,1);
        new Thing(kw,3,2);
        new Thing(kw,2,3);
        new Thing(kw,1,4);
        
        
        //moving bob up the picking up the lights
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.pickThing();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        //placing and going down the other side
        bob.move();
        bob.putThing();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
