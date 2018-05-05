/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.pojo;

/**
 *
 * @author Maraxys
 */
public class UserInfo {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public UserInfo(){
        
    }
    //public UserInfo(){
        
    //}

    public UserInfo(String userId, String name, String gender, int age) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("from const: "+this.userId+this.name+this.gender);
    }
    
    private static String name;
    private static String gender;
    private static int age;
    
}
