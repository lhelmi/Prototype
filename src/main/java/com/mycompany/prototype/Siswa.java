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
public class Siswa implements Cloneable{
    private String nilai;
    
    public Siswa(String nilai){
        setNilai(nilai);
    }
    
    public Siswa clone(){
        Siswa b = null;
        try{
            b = (Siswa)super.clone();
        }catch(Exception e){
            
        }
        return b;
    }
    
    public String getNilai() {
        return nilai;
    }
    
    public void setNilai(String nilai){
        this.nilai = nilai;
    }
}
