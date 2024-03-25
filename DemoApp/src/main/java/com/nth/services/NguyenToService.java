/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nth.services;

/**
 *
 * @author admin
 */
public class NguyenToService {
    public static boolean isNguyenTo(int n){
        if(n<2)
            throw new ArithmeticException();
        else
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
        return true;
    }
}
