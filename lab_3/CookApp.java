package lab_3;

import java.io.FileNotFoundException;

public class CookApp {


    public static void main(String[] args) throws FileNotFoundException {
        GasStove object = new GasStove("Great", 10, true, "Bosch", 50, 70, true, true, 1, 10, 0);
        object.off_onCookstove();
        object.settings();
        object.True_falseOven();
        object.True_falseGasbag();

        object.changeBurner(3);
        object.FireStatusPlus(30);
        object.FireStatusMinus(5);
        object.Condition();
        object.Condition2();
        object.statusCookstove(20);
        object.clean();

        object.Extract();
        object.dispose();
    }
}