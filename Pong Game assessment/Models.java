import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.*;
public class Models extends Main{

    
  
    
 private static Color paint;
 private static String Space  = "";

 //Player Models

public static void Visual(GraphicsContext Graphics){
    Graphics.fillRoundRect(ModelValues.player1XPosition, ModelValues.player1YPosition , ModelValues.PaddleWidth, ModelValues.PaddleHeight,10 ,10);
    Graphics.setFill(Color.WHITE);
   
}
 
public static void Player2(GraphicsContext Graphics){
    Graphics.fillRoundRect(ModelValues.player2XPosition-10, ModelValues.player2YPosition, ModelValues.PaddleWidth, ModelValues.PaddleHeight,10 ,10);
    Graphics.setFill(Color.WHITE);
   
}

public static void Ball(GraphicsContext Graphics){
        Graphics.fillOval(ModelValues.ballXPos - 15, ModelValues.ballYPos - 15, ModelValues.BallSize, ModelValues.BallSize);
        Graphics.setFill(paint.WHITE);
}





//Pitch design
public static void PitchTop(GraphicsContext Graphics){
        Graphics.fillRect(ModelValues.PitchTopYPostion, ModelValues.PitchTopXPostion,ModelValues.PitchTopW, ModelValues.PitchTopH);
        Graphics.setFill(paint.WHITE);
        
}

public static void PitchBottom(GraphicsContext Graphics){
        Graphics.fillRect(ModelValues.PitchBottomYPostion, ModelValues.PitchBottomXPostion,ModelValues.PitchBottomW, ModelValues.PitchBottomH);
        Graphics.setFill(paint.WHITE);
        
}

public static void CenterLine(GraphicsContext Graphics){
    Graphics.fillRect(ModelValues.CenterLineYPostion-2 , ModelValues.CenterLineXPostion,ModelValues.CenterLineW , ModelValues.CenterLineH);
   Graphics.setFill(paint.WHITE);
   
}

public static void CenterCircle(GraphicsContext Graphics){
    Graphics.fillOval(ModelValues.CenterCircleYPostion , ModelValues.CenterCircleXPostion , ModelValues.CenterCircleW , ModelValues.CenterCircleH);
   Graphics.setFill(paint.BLACK);
   
}

public static void CenterInnerCircle(GraphicsContext Graphics){
   Graphics.fillOval(ModelValues.CenterInnerCircleYPostion , ModelValues.CenterInnerCircleXPostion , ModelValues.CenterInnerCircleW , ModelValues.CenterInnerCircleH);
   Graphics.setFill(paint.WHITE);
   
}





public static void Scoreboardp1(GraphicsContext Graphics){
    Graphics.fillText(DisplayValues.Player1Score + Space , DisplayValues.ScreenWidth / 2 -15 ,DisplayValues.ScreenHeight-555);
    Graphics.setFill(paint.WHITE);
}


public static void Scoreboardp2(GraphicsContext Graphics){
    Graphics.fillText(Space + DisplayValues.Player2Score, DisplayValues.ScreenWidth / 2 +15 ,DisplayValues.ScreenHeight-555);
    Graphics.setFill(paint.WHITE);
}




 
}