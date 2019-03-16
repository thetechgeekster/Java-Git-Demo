/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author pasiphae
 */
public class PHDStudent extends Student {
    String thesis;
    public PHDStudent(String name, String am, String thesis){
        super(name,am);
        this.thesis = thesis;
    }
    
    public void displayInfo(){
        super.dispayInfo();
        System.out.println(this.thesis);
    }
}
