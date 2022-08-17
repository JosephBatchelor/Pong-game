public class ModelValues {
    //Player model
    public static int PaddleHeight = 120;
    public static int PaddleWidth = 20;
    public static double  player1YPosition = (DisplayValues.ScreenHeight / 2) - 60;
    public static double  player2YPosition = DisplayValues.ScreenHeight / 2;
    public static int  BallSize = 30;
    public static double player1XPosition = 10;
    public static double  player2XPosition = DisplayValues.ScreenWidth - 20;  
    //ball model
    public static long  ballYPos = (DisplayValues.ScreenHeight / 2) - (BallSize /2);
    public static long  ballXPos = (DisplayValues.ScreenWidth / 2) -  (BallSize /2);
    //Center Line
    public static byte CenterLineW =4;
    public static long CenterLineH =600;
    public static int  CenterLineYPostion = DisplayValues.ScreenWidth / 2;
    public static byte  CenterLineXPostion = 0;
    //Center Circle
    public static int CenterCircleW =150;
    public static int CenterCircleH =150;
    public static long  CenterCircleYPostion = DisplayValues.ScreenWidth / 2 - 75;
    public static long  CenterCircleXPostion = DisplayValues.ScreenHeight /2- 75;
    //Center Circle
    public static int CenterInnerCircleW =142;
    public static int CenterInnerCircleH =142;
    public static long  CenterInnerCircleYPostion = DisplayValues.ScreenWidth / 2 - 71;
    public static long  CenterInnerCircleXPostion = DisplayValues.ScreenHeight / 2 - 71;
    //PitchTop
    public static long PitchTopW =1000;
    public static byte PitchTopH =4;
    public static byte  PitchTopYPostion = 0;
    public static byte  PitchTopXPostion = 4;
    //PitchBottom
    public static long PitchBottomW =1000;
    public static byte PitchBottomH =4;
    public static byte  PitchBottomYPostion = 0;
    public static short  PitchBottomXPostion = 600 - 7;
}
