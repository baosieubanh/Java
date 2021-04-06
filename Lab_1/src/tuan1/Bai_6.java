/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
            int n = sc.nextInt();
        if (n >= 2) {
            System.out.println("So nguyen to: " + 2);
        }
        for(int i = 3; i < n; i+=2 ) {
            if(snt(i)) {
                System.out.println("So nguyen to: " + i);
            }
        }
    }
    
    public static boolean snt (int n) {
        for( int i = 2; i <= sqrt(n); i++ ){
            if( n % i == 0) {
                return false;
            }
        } 
        return true;
    }
}
