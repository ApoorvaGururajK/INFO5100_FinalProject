/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class EquityHolder {
    private String Name;
    private String Company;
    private String Perks;
    private String Username;
    private String Password;

    public EquityHolder(String Name, String Company, String Perks, String Username, String Password) {
        this.Name = Name;
        this.Company = Company;
        this.Perks = Perks;
        this.Username = Username;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getPerks() {
        return Perks;
    }

    public void setPerks(String Perks) {
        this.Perks = Perks;
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
