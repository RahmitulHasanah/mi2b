/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author RIMTECH COMPUTER
 */
public class KelasInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama :");
        Person p = new Person();
        p.setName (sc.nextLine() );
        System.out.println("Nama kamu adalah "+ p.getName());
    }
}
