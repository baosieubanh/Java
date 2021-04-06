/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[], mangN;
        do{
            System.out.print("Nhap chieu dai mang: ");
            mangN = sc.nextInt();
            
        } while( mangN < 0);
        a = new int[mangN];
        System.out.print("mang ngau nhien: ");
        for (int i = 0; i < mangN; i++){
            a[i] = (int)(Math.random() * 100);
            System.out.print(a[i] + "\t");
        }
        
        System.out.print("\nDay so nguyen to: ");
            lietkeSnt(a);
        
    }
    
    public static boolean snt(int mangN) {
        if (mangN < 2) {
            return false;
        }
        for( int i = 2; i <= sqrt(mangN); i++) {
            if( mangN % i == 0){
                return false;
            }
        }
        return true;
    }
    
    static void lietkeSnt( int[] a) {
        for(int i = 0; i < a.length; i++) {
            if( snt(a[i])){
                System.out.print( a[i] + "\t");
            }
        }
    }
    
}
