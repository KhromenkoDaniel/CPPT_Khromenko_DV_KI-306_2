package lab_1;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        int arrsize;
        char[][] arr;
        String filler;
        int k = 0;

        File myFile = new File("./lab_1/Lab1.txt");

        Scanner myScanSys = new Scanner(System.in);
        FileWriter myWriter = new FileWriter(myFile);

        System.out.print("Input size of array: ");
        arrsize = myScanSys.nextInt();
        myScanSys.nextLine();

        System.out.print("Input f of array:");
        filler = myScanSys.nextLine();
        if (filler.isEmpty()) {
            System.out.print("\nNo placeholder character entered");
            System.exit(0);
        }
        if (filler.length() > 1) {
            System.out.print("\nToo many placeholder characters");
            System.exit(0);
        }

        arr = new char[(int) arrsize / 2 + 1][];
        int tabs = 0;
        for (int i = 0; i < (int) arrsize / 2 + 1; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
                myWriter.write("\t");
            }
            arr[i] = new char[(int) arrsize - k];
            for (int n = 0; n < arrsize - k; n++) {
                arr[i][n] = (char) filler.codePointAt(0);
                ;

                System.out.print(arr[i][n] + "\t");
                myWriter.write(arr[i][n] + "\t");
            }
            tabs++;
            System.out.println();
            myWriter.write("\n");
            k += 2;
        }


        myWriter.flush();
        myWriter.close();


    }
}
