/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.mycompany.zoomanagementsystem;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
/*public class Cage {
    private String CageID;
    public String size;
    public String type ;
    public String capacity ;
    public String currentOccupancy;
    public String locationDescription;
    
    private List<String> animalID;
    
    public Cage(String CageID,String size,String type,String capacity,String currentOccupancy, String locationDescription){
    this.CageID=CageID;
    this.capacity=capacity;
    this.currentOccupancy=currentOccupancy;
    this.locationDescription=locationDescription;
    this.size=size;
    this.type=type;
    
    }
    
    public Cage(String CageID){
        this.CageID=CageID;
        this.animalID=new ArrayList<>();
    }

    public void addAnimals(String animalID){
        if(!animalID.contains(animalID)){
        animalID.add(animalID);

            }
        }
    
    public void removeAnimals(String animalID){
    animalID.remove(animalID);        
    }
}*/
package com.mycompany.zoomanagementsystem;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class Cage {
    private String CageID;
    public String size;
    public String type ;
    public String capacity ;
    public String currentOccupancy;
    public String locationDescription;
    private List<String> animalID;

    public Cage(String CageID,String size,String type,String capacity,String currentOccupancy, String locationDescription){
        this.CageID = CageID;
        this.capacity = capacity;
        this.currentOccupancy = currentOccupancy;
        this.locationDescription = locationDescription;
        this.size = size;
        this.type = type;
        this.animalID = new ArrayList<>();
    }

    public Cage(String CageID){
        this.CageID = CageID;
        this.animalID = new ArrayList<>();
    }

    public void addAnimals(String animalID){
        if(!this.animalID.contains(animalID)){
            this.animalID.add(animalID);
        }
    }
    public void removeAnimals(String animalID){
        this.animalID.remove(animalID);
    }

    public String getCageID() {
        return CageID;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getCurrentOccupancy() {
        return currentOccupancy;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public List<String> getAnimalID() {
        return animalID;
    }

    // Convert Cage object to BSON Document for MongoDB
    public Document toDocument() {
        Document doc = new Document("CageID", CageID)
                .append("size", size)
                .append("type", type)
                .append("capacity", capacity)
                .append("currentOccupancy", currentOccupancy)
                .append("locationDescription", locationDescription)
                .append("animalID", animalID);
        return doc;
    }
}
