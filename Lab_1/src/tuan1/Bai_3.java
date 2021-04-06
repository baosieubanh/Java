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
public class Bai_3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
            int masv = sc.nextInt();
        System.out.print("Nhap tuoi: ");
            byte tuoi = sc.nextByte();
        System.out.print("Nhap nam sinh: ");
            int namsinh = sc.nextInt();
        System.out.print("Nhap diem trung binh: ");
            float dtb = sc.nextFloat();
        System.out.println("Ma sinh vien: " + masv);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Diem trung binh: " + dtb);
     }
}
