

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MovementValuesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MovementValuesTest
{
    /**
     * Default constructor for test class MovementValuesTest
     */
    public MovementValuesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void speedintialvalues()
    {assertEquals(1.0,MovementValues.BallSpeedX,1.0);
     assertEquals(1.0,MovementValues.BallSpeedY,1.0);
    }
}

