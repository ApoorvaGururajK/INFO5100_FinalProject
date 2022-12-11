/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class UserSystemData {

    private String Name;
    private String Email;
    private String DOB;     
    private double AccNo;
    private String StockBroker;
    private String MFBroker;
    
     public UserSystemData(String Name, String Email, String DOB, double AccNo, String StockBroker, String MFBroker) {
        this.Name = Name;
        this.Email = Email;
        this.DOB = DOB;
        this.AccNo = AccNo;
        this.StockBroker = StockBroker;
        this.MFBroker = MFBroker;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public double getAccNo() {
        return AccNo;
    }

    public void setAccNo(double AccNo) {
        this.AccNo = AccNo;
    }

    public String getStockBroker() {
        return StockBroker;
    }

    public void setStockBroker(String StockBroker) {
        this.StockBroker = StockBroker;
    }

    public String getMFBroker() {
        return MFBroker;
    }

    public void setMFBroker(String MFBroker) {
        this.MFBroker = MFBroker;
    }
     
}
