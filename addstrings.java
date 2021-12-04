//J.T. McQuigg
package com.company;
import java.io.*;
import java.util.*;

public class addstrings {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to add into the larger string");
        String addition = scan.nextLine();
        System.out.println("Enter frequency in characters you need");
        int freq = scan.nextInt();
        System.out.println("Now enter the larger string");
        System.out.println("Press ctrl+D when done entering");
        System.out.println();
        String s = scan.nextLine();
        while (scan.hasNextLine()){
            s = s + scan.nextLine();
        }
        System.out.println();
        System.out.println("Starting insert now");
        System.out.println();
        for (int i = 0; i < s.length(); i++){
            if ((i % freq) == 0 && (i != 0)){
                System.out.print(s.substring(0,i) + addition);
                s = s.substring(i);
                i = 0;
            }
        }
        System.out.println(s);
        System.out.println("done!");
        scan.close();
    }
}
