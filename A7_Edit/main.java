package A7_Edit;

import Assignment7.Door;

public class main {
    public static void main ( String [] args){
        Door7 myDoor = new Door7(24.85,25.5,false);
        myDoor.openDoor();
        myDoor.closeDoor();
        myDoor.printDoor();
        System.out.println("Surface of the door : " +
                myDoor.calculateSurface());
    }

}
