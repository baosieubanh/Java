/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
            int x = sc.nextInt();
        System.out.print("Nhap y: ");
            int y = sc.nextInt();
        System.out.println("Uoc chung lon nhat: " + UCLN(x,y));
        System.out.println("Boi chung nho nhat: " + BCNN(x,y));
    }
    
    static int UCLN( int x, int y) {
        if(y == 0) return x;
        return UCLN(y, x % y);
    }
    
    static int BCNN( int x, int y) {
        return (x * y) / UCLN( x, y);
    }
}
