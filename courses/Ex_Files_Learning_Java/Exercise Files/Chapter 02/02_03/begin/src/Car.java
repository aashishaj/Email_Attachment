import java.awt.*;

public class Car {

    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2" or "Hello World"
    // Color -> from awt library
    // boolean -> true or false

    int averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    
    public Car(int inputaveragempg, String inoutlicensePlate,Color inoutcolor, Boolean inputtail )
    {
    	this.averageMilesPerGallon = inputaveragempg;
    	this.licensePlate= inoutlicensePlate;
    	this.areTailingWorking = inputtail;
    	this.paintColor = inoutcolor;
    }
}
