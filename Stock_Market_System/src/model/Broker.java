package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rishi
 */
public class Broker {
    private String BrokerID;
    private String Fee;
    private String BRate;
    private String Organization;
     private String Type;
    private String Username;
     private String Password;

    public Broker(String BrokerID, String Username,  String Organization, String Type,  String Fee, String BRate, String Password) {
        this.BrokerID = BrokerID;
         this.Username = Username;
        this.Organization = Organization;
        this.Type = Type;
        this.BRate = BRate;
         this.Fee = Fee;
        this.Password = Password;
    }

    public String getFee() {
        return Fee;
    }

    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    public String getBRate() {
        return BRate;
    }

    public void setBRate(String BRate) {
        this.BRate = BRate;
    }

    public String getBrokerID() {
        return BrokerID;
    }

    public void setBrokerID(String BrokerID) {
        this.BrokerID = BrokerID;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
     
     
}
