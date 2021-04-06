/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Bai_6 {
    public static void main(String [] args) {
        int n;
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so nguyen to: ", ""));     
        } catch (java.lang.NumberFormatException ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("Have good fun");    
        }
    }
}
