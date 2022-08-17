

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DisplayValuesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DisplayValuesTest
{
    /**
     * Default constructor for test class DisplayValuesTest
     */
    public DisplayValuesTest()
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
    public void Displayintialvalues()
    {assertEquals(1000,DisplayValues.ScreenWidth);
     assertEquals(600,DisplayValues.ScreenHeight);
    }

    @Test
    public void Scoreboardintialvalues()
    {assertEquals(0,DisplayValues.Player1Score);
     assertEquals(0,DisplayValues.Player2Score);
    }
}


