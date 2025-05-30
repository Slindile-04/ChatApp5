/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package chatapp5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ChatApp5Test {
    
    public ChatApp5Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of loadUsers method, of class ChatApp5.
     */
    @Test
    public void testLoadUsers() {
        System.out.println("loadUsers");
        ChatApp5.loadUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUsers method, of class ChatApp5.
     */
    @Test
    public void testSaveUsers() {
        System.out.println("saveUsers");
        ChatApp5.saveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadMessages method, of class ChatApp5.
     */
    @Test
    public void testLoadMessages() {
        System.out.println("loadMessages");
        ChatApp5.loadMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMessages method, of class ChatApp5.
     */
    @Test
    public void testSaveMessages() {
        System.out.println("saveMessages");
        ChatApp5.saveMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerNewUser method, of class ChatApp5.
     */
    @Test
    public void testRegisterNewUser() {
        System.out.println("registerNewUser");
        User expResult = null;
        User result = ChatApp5.registerNewUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class ChatApp5.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        User expResult = null;
        User result = ChatApp5.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class ChatApp5.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        User sender = null;
        ChatApp5.sendMessage(sender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMessages method, of class ChatApp5.
     */
    @Test
    public void testReadMessages() {
        System.out.println("readMessages");
        User receiver = null;
        ChatApp5.readMessages(receiver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSentMessages method, of class ChatApp5.
     */
    @Test
    public void testCheckSentMessages() {
        System.out.println("checkSentMessages");
        User sender = null;
        ChatApp5.checkSentMessages(sender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ChatApp5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ChatApp5.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
