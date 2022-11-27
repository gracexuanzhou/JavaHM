package Assignment7;

public class main {
    public static void main (String args[]){
        Door myDoor = new Door();
        myDoor.openDoor();
        myDoor.closeDoor();
        myDoor.printDoor();
        System.out.println("Surface of the door : " +
                myDoor.calculateSurface(24.25,28.5));
    }
}
