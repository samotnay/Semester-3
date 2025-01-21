/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Sam Otnay
 */
public class UTS2 {
    public static void main(String[] args) {
        int[] b= {1,2,3,4,5};
        int[] c={6,7,8,9,10};
        
        //menggabungkan panjang array gabungan
        int combinedArrayLength = b.length + c.length;
        
        //Membuat array baru untuk menyimpan array gabungan
        int[] combinedArray = new int[combinedArrayLength];
        
        //menyalin elemen dari Array pertama (b) ke combinedArray
        System.arraycopy(b,0,combinedArray, 0, b.length);
        
        //Menyalin elemen dari Array kedua ke combinedArrayl, dimulai dari akhir combinedArray
        int k =0;
                for (int i = b.length; i < combinedArrayLength; i++){
                    combinedArray[i] = c[k];
                    k++;
                }
                
                //Menampilkan array gabungan
                System.out.println("Array Gabungan: ");
                for (int element :combinedArray) {
                    System.out.println(element + " ");
                }
    }
}
