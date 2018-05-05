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
    
    

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UserInfo.userId = userId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UserInfo.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        UserInfo.gender = gender;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        UserInfo.age = age;
    }
    private static String userId;
    private static String name;
    private static String gender;
    private static int age;
    
}
