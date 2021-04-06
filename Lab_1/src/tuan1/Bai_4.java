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
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
            int x = sc.nextInt();
        System.out.print("Nhap y: ");
            int y = sc.nextInt();
        int tong = x + y;  
        int hieu = x - y;
        int tich = x * y;
        float thuong = x / y;
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
    }
}
