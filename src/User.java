/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алекс1
 */
public class User {
    private int age;
    private String name;
    private String surname;
    
    public User(int age, String name, String surname){
        this.age=age;
        this.name=name;
        this.surname=surname;
    }
    public User(){}
        
    
    public int getAge(){
    return age;
    }
    public String getName (){
    return name;
    } 
    public String getSurname (){
    System.out.println("***");
        return surname;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
        
    
    }
    public static void printuser(User user){
    System.out.println("age = " +user.getAge()+"; name = " +user.getName()+"; surname = "+user.getSurname());}  
    
    
}
