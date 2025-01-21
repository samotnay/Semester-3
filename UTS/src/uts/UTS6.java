/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Sam Otnay
 */
public class UTS6 {
    public static void main(String[] args) {
        int[][] matriks = {
            {12,14,16},
            {5,7,10},
            {3,2,6}
        };
        
        //Matriks untuk hasil tranposisi
        int[][] matriksTranspos = new int [3][3];
        
        //Melakukan Transposisi
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j < matriks[0].length; j++){
                matriksTranspos[j][i] = matriks[i][j];
            }
        }
        //hasil percetakannya
        System.out.println("matrik Asli: ");
        for (int[] baris : matriks){
            for (int elemen : baris){
                System.out.println(elemen + " ");
            }
            System.out.println();
        }
        
        //Mencetak matriks tranposisi
        System.out.println("\nMatriks Tranposisi: ");
        for (int[] baris : matriksTranspos){
            for (int elemen : baris){
                System.out.println(elemen + " ");
            }
            System.out.println();
        }
    }
}
