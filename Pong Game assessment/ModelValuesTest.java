

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ModelValuesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ModelValuesTest
{
    /**
     * Default constructor for test class ModelValuesTest
     */
    public ModelValuesTest()
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
    public void Playermodelinitialvalues()
    {assertEquals(120,ModelValues.PaddleHeight);
     assertEquals(20,ModelValues.PaddleWidth);
     assertEquals(30,ModelValues.BallSize);
    }

    @Test
    public void ModelPostionValues()
    {assertEquals(10,ModelValues.player1XPosition,10);
     assertEquals(980,ModelValues.player2XPosition,980);
     assertEquals(240,ModelValues.player1YPosition,240);
     assertEquals(600,ModelValues.player2YPosition,600);
     assertEquals(485,ModelValues.ballXPos);
     assertEquals(285,ModelValues.ballYPos);
    }
    
    @Test
    public void PitchValues()
    {assertEquals(4,ModelValues.CenterLineW);
     assertEquals(600,ModelValues.CenterLineH);
     assertEquals(500,ModelValues.CenterLineYPostion);
     assertEquals(0,ModelValues.CenterLineXPostion);
     assertEquals(150,ModelValues.CenterCircleW);
     assertEquals(150,ModelValues.CenterCircleH);
     assertEquals(425,ModelValues.CenterCircleYPostion);
     assertEquals(225,ModelValues.CenterCircleXPostion);
     assertEquals(142,ModelValues.CenterInnerCircleW);
     assertEquals(142,ModelValues.CenterInnerCircleH);
     assertEquals(429,ModelValues.CenterInnerCircleYPostion);
     assertEquals(229,ModelValues.CenterInnerCircleXPostion);
     assertEquals(1000,ModelValues.PitchTopW);
     assertEquals(4,ModelValues.PitchTopH);
     assertEquals(0,ModelValues.PitchTopYPostion);
     assertEquals(4,ModelValues.PitchTopXPostion);
     assertEquals(1000,ModelValues.PitchBottomW);
     assertEquals(4,ModelValues.PitchBottomH);
     assertEquals(0,ModelValues.PitchBottomYPostion);
     assertEquals(593,ModelValues.PitchBottomXPostion);
    }
    
    
}


