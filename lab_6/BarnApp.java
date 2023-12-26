package lab_6;

public class BarnApp {
    /**
     * @param args param
     */
    public static void main(String[] args) {
        Barn<? super Data> Barn = new Barn<Data>();
        Barn.AddData(new Animal("Pig", 1, 150));
        Barn.AddData(new Grain("Wheat", 198));
        Barn.AddData(new Grain("Oat", 68));
        Barn.AddData(new Animal("Chicken", 1, 5));
        Data res = Barn.findMax();
        System.out.print("The biggest data in barn is: \n");
        res.print();
    }
}