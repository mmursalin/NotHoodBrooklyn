package array;

import java.util.Random;
import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int [] array = new int[4000];
        System.out.println("plz enter numbers: ");
        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for(int j=0; j<array.length; j++) {
            System.out.println("Array index value : " + array[j]);
        }
    }
}