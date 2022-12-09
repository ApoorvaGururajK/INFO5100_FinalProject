/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class UserAuth {
    private String UserID;
    private String Username;
     private String Password;
//      private String Type;
      
      public UserAuth(String UserID,  String Username, String Password){
          this.UserID=UserID;
          this.Username=Username;
          this.Password=Password;
//          this.Type=Type;
          
      }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
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

//    public String getType() {
//        return Type;
//    }
//
//    public void setType(String Type) {
//        this.Type = Type;
//    }
    
}
