package lab_3;

import java.io.FileNotFoundException;

public class GasStove extends Cook implements Clean {
    public double capacity;
    public int pollution;

    public GasStove(String cookstovecondition, int fire, boolean status, String name, int lenght, int width, boolean gasbag, boolean oven, int burner, double capacity, int pollution) throws FileNotFoundException {
        super(cookstovecondition, fire, status, name, lenght, width, gasbag, oven, burner);
        this.capacity = capacity;
        this.pollution = pollution;
    }

    /**
     * Method simulates level of capacity in gas bag during some time
     */

    public void statusCookstove(int time){
        if (status){
            myWrite.println("The gas stove is on");
            System.out.println("The gas stove is on");
            capacity -= (double) time/60;
            myWrite.println("The gas capacity in the gas cylinder is reduced by " + (double) time/60 +" liters during " + time + " minutes");
            System.out.println("The gas capacity in the gas cylinder is reduced by " + (double) time/60 +" liters during " + time + " minutes");

        } else{
            myWrite.println("The gas stove is off");
        }
    }
    /**
     * Method simulates cleaning of gas stove
     */
    public void clean(){
        pollution=0;
        myWrite.println("Gas stove was cleaned");
        System.out.println("Gas stove was cleaned");
    }
}
