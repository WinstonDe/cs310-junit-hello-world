package edu.jsu.mcis.cs310;
import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private String expectedGreeting, expectedReverseGreeting;
    private String expectedReverse1, expectedReverse2, expectedReverse3;
    
    @Before
    public void setUp() {
        main = new Main();
        expectedGreeting = "Hello, World!";
        expectedReverseGreeting = "!dlroW ,olleH";
        expectedReverse1 = "topaeT elttiL a m'I";
        expectedReverse2 = "elddiD elddiD yeH";
        expectedReverse3 = "kcoD yrokciD yrokciH";
    }
        
    @Test
    public void testGreeting() {
        String actual = main.getGreeting();
        assertEquals(expectedGreeting, actual);
    }
    
    @Test
    public void testReverseGreeting() {
        StringBuilder s = new StringBuilder();
        s.append(expectedReverseGreeting); 
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
       
    }
    
    @Test
    public void testReverseMessage1() {
        StringBuilder s = new StringBuilder();
        s.append(expectedReverse1); 
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
        
    }
    
    @Test
    public void testReverseMessage2() {
        StringBuilder s = new StringBuilder();
        s.append(expectedReverse2); 
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
      
    }
    
    @Test
    public void testReverseMessage3() {
        StringBuilder s = new StringBuilder();
        s.append(expectedReverse3); 
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
        ;
    }
    
    @Test
    public void testNewMessage() {
        StringBuilder s = new StringBuilder();
        s.append("All of the Lights");
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
      
    }
    
}