package lab_2;

import static java.lang.System.out;
import java.io.*;

public class CookstoveApp {

    public static void main(String[] args) throws  FileNotFoundException {

        cookstove object = new cookstove("Great", 10, true, "Bosch", 50, 70, true, true, 1);

        object.off_onCookstove();
        object.settings();
        object.True_falseOven();
        object.True_falseGasbag();

        object.changeBurner(3);
        object.FireStatusPlus(30);
        object.FireStatusMinus(5);
        object.Condition();
        object.Condition2();

        object.Extract();
        object.dispose();
    }



}
