/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[], n; 
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while( n < 0);
        a = new int[n];
        
        for( int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("So nguyen to: "); 
        lietkeSnt(a);
        
        System.out.print("\nSo lon nhat: ");
        timMax(a,n); 
        
        System.out.print("\nDem so chinh phuong: ");
        demChinhphuong(a, n);
        
        System.out.print("\nMang sau khi sap xep: ");
        sapxep(a, n);
    }
    
    public static boolean snt(int n) {
        if (n < 2) {
            return false;
        }
        for( int i = 2; i <= sqrt(n); i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean chinhphuong( double x) {
        if(x == 0) return false;
            double cp = sqrt(x);
            return ((cp - floor(cp)) == 0);
    }
    
    public static void demChinhphuong( int[] a, int n) {
        int count = 0;
        for( int i = 0; i < n; i++) {
            if(chinhphuong(a[i])) {
                count++;
            }
        }
        System.out.print( count + "\t");
    }
    
    static void lietkeSnt( int[] a) {
        for(int i = 0; i < a.length; i++) {
            if( snt(a[i])){
                System.out.print( a[i] + "-");
            }
        }
    }
    
    public static void timMax( int a[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        System.out.print(max);
    }
    
    public static void sapxep (int a[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "-");
        }
    }
}
