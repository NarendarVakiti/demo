package com.example.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
    
    @Test
    public void sum_with3numbers() {
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[] {
            1,
            2,
            3
        }));
    }
    @Test
    public void sum_with1number() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[] {
            3
        }));
    }
    
    @Test
    public void myTest() {
    	System.out.println("My Test");
    	assertEquals(10, myMath.sum(new int[] {
    		5,5
    	}));
    }
    
    @BeforeAll
    public static void beforeAllTest() {
    	System.out.println("Before All Testcases");
    }
    
    @BeforeEach
    public void beforeEachTest() {
    	System.out.println("Before Each Testcase");
    }
    
    @AfterAll
    public static void afterAllTest() {
    	System.out.println("After All Testcases");
    }
    
    @AfterEach
    public void afterEachTest() {
    	System.out.println("After Each Testcase");
    }

}
