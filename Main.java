package Main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hostFile = "C:\\Users\\ihsan\\OneDrive\\Masaüstü\\öğrenci bilgileri.txt";
        String targetFile = "C:\\Users\\ihsan\\OneDrive\\Masaüstü\\öğrenci harfnotları.txt";

        try (Scanner scn = new Scanner(new BufferedReader(new FileReader(hostFile))); BufferedWriter write = new BufferedWriter(new FileWriter(targetFile, true))) {

            while (scn.hasNextLine()) {

                String line = scn.nextLine();
                String[] list = line.split(",");
                int mid1 = Integer.valueOf(list[1]);
                int mid2 = Integer.valueOf(list[2]);
                int final1 = Integer.valueOf(list[3]);
                write.write(list[0] + " (" + lettergradeCalculater(mid1, mid2, final1) + ")");
                write.newLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String lettergradeCalculater(int a, int b, int c) {
        double average = ((a * 3 / 10) + (b * 3 / 10) + (c * 4 / 10));
        if (average >= 95) {
            return "AA";
        } else if (average >= 90) {
            return "BA";
        } else if (average >= 85) {
            return "BB";
        } else if (average >= 80) {
            return "CB";
        } else if (average >= 75) {
            return "CC";
        } else if (average >= 70) {
            return "DC";
        } else if (average >= 65) {
            return "DD";
        } else {
            return "FF";
        }
    }

}
