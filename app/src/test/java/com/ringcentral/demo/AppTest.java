/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ringcentral.demo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ringcentral.RestException;
import java.io.IOException;

public class AppTest {
    @Test public void testAppHasAGreeting() throws IOException, RestException {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getExtensionNumber());
    }
}
