/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoomanagementsystem;

/**
 *
 * @author LENOVO
 */
public class Mammal extends Animal {


    public Mammal(String name,String species,String gender,String age,String healthStatus,String dietType,String dateOfArrival,String FeedingSchedule)
    {
        super(name,species,gender,age,healthStatus,dietType,dateOfArrival,FeedingSchedule);
        
    }
      public void healthstatus(){
        System.out.println("Health status: "+healthStatus+" of "+name);
        
    }
    
}
