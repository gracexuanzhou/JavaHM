package A7_Edit;

import Assignment7.Door;

public class Door7 {
    double width,height;
    boolean open;
    Door7(double width,double height,boolean open){
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor(){
        System.out.println("Openning door");
        this.open = true;
    }
    public void closeDoor(){
        System.out.println("Closing door");
        this.open = false;
    }
    public void printDoor(){
        System.out.println("The door is open :" + this.open);
    }

    public double calculateSurface(){
        return this.width*this.height;
    }
}
