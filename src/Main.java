/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алекс1
 */
public class Main {

    
     
    
    public static void main(String[] args) {
    
    User user1 = new User();
    
    User user2 = new User();
    User user3 = new User();
    User user4 = new User(3,"q","q");
    User user6 = new User();
    
    User.printuser(user4);
    int w;
    
    User.printuser(user1);
    
    user1.setAge(20);
    user1.setName("Ivan");
    user1.setSurname("Ivanov");
    
    user2.setAge(25);
    user2.setName("Petr");
    user2.setSurname("Petrov");
    
    user3.setAge(30);
    user3.setName("Sidor");
    user3.setSurname("Sidorov");
    
    w=user1.getAge();
    System.out.println("w = "+w);
    
    System.out.println("age = " +user1.getAge()+"; name = " +user1.getName()+"; surname = "+user1.getSurname());
    
    
    User.printuser(user1);
    
    
    }
    
}
