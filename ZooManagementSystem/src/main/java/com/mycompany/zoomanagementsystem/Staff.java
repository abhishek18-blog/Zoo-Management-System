/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoomanagementsystem;

/**
 *
 * @author LENOVO
 */
public class Staff {

    public String name;
    public String role;
    public String ContactInfo;
    public String assignedanimals;
    private String staffID;
    public String WorkShifts;
    
    
    public Staff( String name,String role,String ContactInfo,String assignedanimals, String WorkShifts){
      this.name=name;
      this.role=role;
      this.ContactInfo=ContactInfo;
      this.assignedanimals=assignedanimals;
      this.WorkShifts=WorkShifts;
    }
    
    public void setStaffid(String staffID){
        this.staffID=staffID;
    }
    public String getStaffID(){
        return staffID;
    }
    
    
    
}
