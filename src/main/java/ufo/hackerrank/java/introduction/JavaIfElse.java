package ufo.hackerrank.java.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaIfElse {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String ans = "";
            if (n % 2 == 1) {
                ans = "Weird";
            } else {
                if ((n>=2 && n<5) || n>20) {
                    ans = "Not Weird";
                } else {
                    ans = "Weird";
                }
            }
            System.out.println(ans);
        }
    }

}