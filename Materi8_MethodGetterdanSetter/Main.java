/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materi8_MethodGetterdanSetter;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("Rika");
        user.SetPassword("54321");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Psswordnya = " + user.GetPassword());
    }
    
}

