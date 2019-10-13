package org.eclipse.krazo;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * @author Gregor Tudan
 */
public class FailingUnitTest {
    @Test
    public void testFail() {
        fail("Do we run this?");
    }
}
