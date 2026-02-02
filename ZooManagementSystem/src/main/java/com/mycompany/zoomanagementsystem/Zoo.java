/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoomanagementsystem;

/**
 *
 * @author Abhishek;
 */
public class Zoo {
    public String ZooName;
    public String location;
    public String listofAnimals;
    public String listofcages;
    public String openingHours;
    
    
    public Zoo(String ZooName,String location, String listofAnimals,
            String listofcages,String openingHours){
        this.ZooName=ZooName;
        this.location=location;
        this.listofAnimals=listofAnimals;
        this.listofcages=listofcages;
        this.openingHours=openingHours;
    }
    void listopenhours(){
           System.out.println("Hours of opening: "+openingHours);
    }

    
}
