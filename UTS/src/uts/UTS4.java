/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Sam Otnay
 */
public class UTS4 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        
        //Panjang Array
        int o = arr.length;
        
        //inisialisasi dua pointer
        int p=0, j=1;
        
        //iterasi melalui Array
        while (j<o) {
            if (arr[p] == arr[j]) {
                //Melewati elemen duplikat
                j++;
            } else {
                //Ganti elemen unik pada posisi berikutnya
                arr [p + 1] = arr[j];
                p++;
                j++;
            }
        }
        //Kurangi ukuran array untuk menghapus elemen duplikat
        int[] newArr= new int[p + 1];
        for (int k = 0; k<=p; k++) {
            newArr[k] = arr[k];
        }
        //Print array baru tanpa ada elemen yang duplikat
        System.out.println("Array tanpa duplikat: ");
        for (int num : newArr) {
            System.out.println(num + " ");
        }
    }
}
