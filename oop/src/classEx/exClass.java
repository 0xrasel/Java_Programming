package classEx;

class Pen{
    String color;
    String type; //ballpoint
    public void write(){
        System.out.println("Write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

public class exClass {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.type = "ballpoint";

        pen2.printColor();
        pen2.printType();
    }
}
