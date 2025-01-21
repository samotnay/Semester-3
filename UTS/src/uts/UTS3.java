/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Sam Otnay
 */
public class UTS3 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,1};
        
        //hashmap untuk menyimpan hitungan kemunculan elemen
        java.util.HashMap<Integer, Integer> kemunculan = new java.util.HashMap<>();
        
        //hitung kemunculan setiap elemen
        for (int num:arr) {
            if (kemunculan.containsKey(num)) {
                kemunculan.put(num, kemunculan.get(num) + 1);
            } else {
                kemunculan.put(num, 1);
            }
        }
        
        //Tampilan hasil hitungan
        System.out.println("Hasil Hitung Kemunculan: ");
        for (java.util.Map.Entry<Integer, Integer> entry : kemunculan.entrySet()) {
            System.out.println("Elemen: " +entry.getKey()+ ", Kemunculan: "+ entry.getValue());
        }
    }
}
