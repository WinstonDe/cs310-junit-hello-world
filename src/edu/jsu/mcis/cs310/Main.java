package edu.jsu.mcis.cs310;

/*
Deuntae Winston
*/

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String Greet) {
        StringBuilder s = new StringBuilder();
        s.append(Greet); 
        s.reverse();
        return s.toString();
    }
    
}