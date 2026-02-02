/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoomanagementsystem;

/**
 *
 * @author ABHISHEK DESHMUKH
 */
public class Animal {

    private String AnimalID;
    public String name;
    public String species;
    public String gender;
    public String age;
    public String healthStatus;
    public String dietType;
    private String cageID;
    public String dateOfArrival;
    public String FeedingSchedule;
    
    public Animal(String name,String species,String gender,String age,
            String healthStatus,String dietType,
            String dateOfArrival,String FeedingSchedule){
     //  this.AnimalID=AnimalID;
        this.name=name;
        this.species=species;
        this.gender=gender;
        this.age=age;
        this.healthStatus=healthStatus;
        this.dietType=dietType;
       // this.cageID=cageID;
        this.dateOfArrival=dateOfArrival;
        this.FeedingSchedule=FeedingSchedule;
        
    }
    //GETTER SETTERS FOR AnaimalID AND CageID
    public String getAnimalID(){
        return AnimalID;
        
    }
    public void setAnimalID(String AnimalID){
        this.AnimalID =AnimalID;
    }
     public String getcageID(){
        return cageID;
        
    }
    public void setcageID(String cageID){
        this.cageID=cageID;
    }
    public void displayAnimalDtl() {
    System.out.println("Name: " + name + ", Species: " + species + ", Gender: " + gender +
    ", Age: " + age  + ", Diet Type: " + dietType +
    ", Date Of Arrival: " + dateOfArrival + ", Feeding Schedule: " + FeedingSchedule);

    }
    public void healthstatus(){
        System.out.println("Health status: "+healthStatus+" of "+name);
        
    }
    
        
}
    
    
    
    
    
    
    
    
    
    
     
    
    
