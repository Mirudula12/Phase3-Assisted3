package com.example;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.DynamicTest.*;
import org.junit.jupiter.api.TestFactory;
 
@DisplayName("JUnit 5 Dynamic Tests Example")
@RunWith(SpringRunner.class)
public class DynamicTests {

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
	    return Arrays.asList(
	    		DynamicTest.dynamicTest("simple dynamic test", () -> assertTrue(true)),
	    		DynamicTest.dynamicTest("My Executable Class", new MyExecutable()),
	    		DynamicTest.dynamicTest("simple dynamic test-2", () -> assertTrue(true))
	    );
	}
}

class MyExecutable implements Executable {

        @Override
        public void execute() throws Throwable {
                System.out.println("Hello World!");
        }

}
