/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical1;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtRobot;
public class MoveWithGear {
    MoveWithGear()
    {
        NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);	

    gear.forward(1000);
    gear.setSpeed(5);
    
    gear.left(5000);
    gear.forward(1000);
    gear.right(4080);
    robot.exit(); 
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MoveWithGear  m=new MoveWithGear();
        // TODO code application logic here
    }
    
}
