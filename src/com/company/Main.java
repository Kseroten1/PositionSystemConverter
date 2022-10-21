package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number to change: ");
        float number = scanner.nextFloat();
        System.out.println("Provide new system 2-9: ");
        int system = scanner.nextInt();

        float number_fraction = number - (int)number;
        float number_int = number - number_fraction;
        List<Integer> symbols = new ArrayList<>();
        while (number_int != 0){
            int a = (int) (number_int/system);
            int b = (int) (number_int%system);
            symbols.add(b);
            number_int = a;
        }
        int[] fraction = new int[5];
        

        System.out.println("Number in chosen system: ");
        for(int i = 0; i<symbols.size() ; i++){
            System.out.print(symbols.get(symbols.size()-i-1));
        }
        System.out.print(",");
        for(int k = 0; k<5; k++){
            System.out.print(fraction[k]);
        }
    }
}
