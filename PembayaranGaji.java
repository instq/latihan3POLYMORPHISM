/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inas
 */
public class PembayaranGaji {
    public int hitungGaji(pegawai peg){
         int uang = peg.gaji(); 
         if (peg instanceof direktur)
             uang+=((direktur)peg).tunjangan(); 
         
         if (peg instanceof staff) 
             uang+=((staff)peg).Bonus();
         
         return uang; 
     }
     public static void main(String[] args){ 
         PembayaranGaji pg = new PembayaranGaji(); 
         staff ali= new staff(); 
         direktur Tony = new direktur(); 
         System.out.println("gaji staf = "+pg.hitungGaji(ali));
         System.out.println("gaji direktur ="+pg.hitungGaji(Tony));
     }
}
