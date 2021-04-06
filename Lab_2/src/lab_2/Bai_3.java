/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dong: ");
            int dongM = sc.nextInt();
        System.out.print("Nhap cot: ");
            int cotN = sc.nextInt();
        int [][] a = new int[dongM][cotN];
        
        for (int i = 0; i < dongM; i++)
        {
            for (int j = 0; j < cotN; j++)
            {
                a[i][j] = (int)(Math.random()*100); 
            }
        }
        
        System.out.println("Ma tran: ");
        for (int i = 0; i < dongM; i++)
        {
            for (int j = 0; j < cotN; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        System.out.print("Nhap dong can tinh: ");
            int dongK = sc.nextInt();
            
        double tong  = 0;
        for (int j = 0; j < cotN; j++) {
            tong = tong + a[dongK][j]; 
        }
        System.out.print("Tong dong " + dongK + ": " +tong);
    }
}
