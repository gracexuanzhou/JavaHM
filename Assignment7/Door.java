package Assignment7;

public class Door {
    double width,height;
    boolean open;

    public void openDoor(){
        System.out.println("Openning door");
        this.open = true;
    }
    public void closeDoor(){
        System.out.println("Closing door");
        this.open = false;
    }
    public void printDoor(){
        System.out.println("The door is open :" + open);
    }

    public static double calculateSurface(double width,double height){
        return width*height;
    }
}
