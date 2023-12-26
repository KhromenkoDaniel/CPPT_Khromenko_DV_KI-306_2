package lab_2;

import java.io.*;

public class cookstove {
    private String cookstovecondition;
    private int fire;
    private boolean status;
    private String name;
    private int lenght;
    private int width;
    private boolean gasbag;
    private boolean oven;
    private int burner;
    private PrintWriter myWrite;


    public cookstove() throws FileNotFoundException {
        cookstovecondition = "None";
        fire = 0;
        status = false;
        name = "None";
        lenght = 0;
        width = 0;
        gasbag = false;
        oven = false;
        burner = 0;
        myWrite = new PrintWriter(new File("./lab_2/Log.txt"));
    }


    public cookstove( String cookstovecondition,int fire,boolean status,String name, int lenght, int width, boolean gasbag, boolean oven, int burner) throws FileNotFoundException {
        this.cookstovecondition=cookstovecondition;
        this.fire = fire;
        this.status = status;
        this.name = name;
        this.lenght = lenght;
        this.width = width;
        this.gasbag = gasbag;
        this.oven = oven;
        this.burner = burner;
        myWrite = new PrintWriter(new File("./lab_2/Log.txt"));

    }

    public String getCookstovecondition() {
        return cookstovecondition;
    }

    public void setCookstovecondition(String Cookstovecondition) {
        this.cookstovecondition = cookstovecondition;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean getGasbag() {
        return gasbag;
    }

    public void setGasbag(boolean gasbag) {
        this.gasbag = gasbag;
    }

    public boolean getOven() {
        return oven;
    }

    public void setOven(boolean oven) {
        this.oven = oven;
    }

    public int getBurner() {
        return burner;
    }

    public void setBurner(int burner) {
        this.burner = burner;
    }




    public void off_onCookstove(){
        if (status){
            myWrite.println("The gas stove is on");
        } else{
            myWrite.println("The gas stove is off");
        }
    }


    public void settings(){
        System.out.println("Name - " + name);
        System.out.println("The lenght - " + lenght + " cm");
        System.out.println("The width - " + width + " cm");
        myWrite.println("The stove setting is displayed");
    }


    public void True_falseOven(){
        if (oven){
            myWrite.println("The oven is included in the complete set with a stove");
        }else{
            myWrite.println("The stove is not included in the complete set with a stove");
        }
    }


    public void True_falseGasbag(){
        if (gasbag){
            myWrite.println("The gas bag is included in the complete set with a stove");
        }else{
            myWrite.println("The stove is not included in the complete set with a stove\n");
        }
    }


    public void changeBurner(int bur){
        System.out.println("Selected burner - " + burner);
        myWrite.println("The burner changed from " + burner + " to " + bur);
        System.out.println("The burner changed to " + bur);
    }


    public void FireStatusPlus(int change){
        fire = fire + change;
        myWrite.println("The fire is increased on " + change + "% ");
    }

    public void FireStatusMinus(int change){
        fire = fire - change;
        myWrite.println("The fire is reduced on " + change + "% ");
    }

    public void Condition(){
        if(cookstovecondition == "Great"){
            myWrite.println("The stove is in good condition");
        }
    }


    public void Condition2(){
        if(cookstovecondition == "Bad"){
            myWrite.println("The stove is in bad condition, it needs to be repaired");
        }
    }

    public void Extract()  {
        if(status){
            myWrite.println("Turn on the hood while cooking");
        }
    }


    public void dispose()
    {
        myWrite.flush();
        myWrite.close();
    }
}
