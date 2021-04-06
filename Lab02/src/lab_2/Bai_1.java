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
public class Bai_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
            float hesoA = sc.nextFloat();
        System.out.print("Nhap he so b: ");
            float hesoB = sc.nextFloat();
        System.out.print("Nhap he so c: ");
            float hesoC = sc.nextFloat();
        GiaiPtBac2(hesoA, hesoB, hesoC);
    }
     
    public static void GiaiPtBac2( float hesoA, float hesoB, float hesoC) {
        if (hesoA == 0){
            if (hesoB == 0){
                System.out.println("Pt vo nghiem");
            } else {
                System.out.println("Pt co 1 nghiem: " + "x = " + (-hesoB / hesoC));
            }
            return;
        }
        
        float delta = hesoB * hesoB - 4 * hesoA * hesoC;
        float nghiemX1;
        float nghiemX2;
        // tính nghiệm
        if (delta > 0) {
            nghiemX1 = (float) ((-hesoB + Math.sqrt(delta)) / (2 * hesoA));
            nghiemX2 = (float) ((-hesoB - Math.sqrt(delta)) / (2 * hesoA));
            System.out.println("Pt co nghiem la: " + "x1 = " + nghiemX1 + " và x2 = " + nghiemX2);
        } else if (delta == 0) {
            nghiemX1 = (-hesoB / (2 * hesoA));
            System.out.println("Pt co nghiem kep la: " + "x1 = x2 = " + nghiemX1);
        } else {
            System.out.println("Pt vo nghiem!");
        }
    }
}
