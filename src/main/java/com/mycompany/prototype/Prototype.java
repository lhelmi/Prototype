/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

/**
 *
 * @author foxy
 */
public class Prototype {
    public static void main(String[] args){
        Siswa siswa1 = new Siswa("8");
        Siswa siswa2 = new Siswa("9.5");
        
        System.out.println("Nilai 1 dan Nilai 2 yang telah di isi");
        System.out.println("Nilai Siswa 1 : "+siswa1.getNilai());
        System.out.println("Nilai Siswa  2 : "+siswa2.getNilai());
        System.out.println();
        
        
        System.out.println("Nilai Siswa  3 di clone dengan Nilai Siswa  1");
        Siswa siswa3 = siswa1.clone();
        System.out.println("Nilai Siswa  3 : "+siswa3.getNilai());
        
        System.out.println("Nilai Siswa  4 di clone dengan Nilai Siswa  2");
        Siswa siswa4 = siswa2.clone();
        System.out.println("Nilai Siswa  4 : "+siswa4.getNilai());
        
    }
}
