    import java.util.Random;
    import javafx.scene.canvas.Canvas;
    import javafx.scene.canvas.GraphicsContext;
    import javafx.scene.paint.Color;
    import javafx.scene.text.*;
    import java.util.ArrayList;
    import java.util.*; 
    public class Function extends Main{
        
        private static int BallresetX = (int)((Math.random() * (2)));
        private static int BallresetY = (int)(Math.random() * (2));
        private static int player2pad = (int)(Math.random() * (5) );
        private static int player1pad = (int)(Math.random() * (5));
        
        public static void Function(GraphicsContext Graphics)
        {
            
            if(Start) {
                //set ball movement , once the values for speed X and Y this will increase the values to simulate movement 

                ModelValues.ballXPos+= MovementValues.BallSpeedX;
    
                ModelValues.ballYPos+= MovementValues.BallSpeedY;
                
                EndGame(Graphics);
            } else {
                StartScreen(Graphics);
               
                //reset the ball start position which is the center of the stage
    
               ModelValues.ballYPos = DisplayValues.ScreenHeight / 2 ;
               
               ModelValues.ballXPos = DisplayValues.ScreenWidth / 2 ;
               
                //http://alvinalexander.com/java/edu/pj/pj010018/ tenary is like if else it says that if ballresetX is equal to 0 then use the value -1 else use another values in this case 10. 
    
                MovementValues.BallSpeedX = BallresetX == 0 ? 1: -1;
    
                MovementValues.BallSpeedY = BallresetY == 0 ? 1: -1;
            }
        }

        public static void ScoreBoard(GraphicsContext Graphics){
           Graphics.fillRoundRect(3, 18 , 174, 229,10 ,10);
           Graphics.setFill(Color.BLACK);
           Graphics.fillRoundRect(5, 20 , 170, 225,10 ,10);
           Graphics.setFill(Color.WHITE);
           
           ArrayList<String> ScoreBoard = new ArrayList<String>();
           ScoreBoard.add("Joe:");
           ScoreBoard.add("Bob:");
           ScoreBoard.add("Larry:");
           ScoreBoard.add("Jake:");
           ScoreBoard.add("Dave:");
    
           Graphics.setFill( Color.WHITE );
           Graphics.setStroke( Color.RED );
           Graphics.setLineWidth(2);
           Graphics.setTextAlign(TextAlignment.CENTER);
           Graphics.setFont(Font.font("Agency FB",30));
           Graphics.strokeText("ScoreBoard Wins", 90, DisplayValues.ScreenHeight - 550);
           Graphics.fillText("ScoreBoard Wins", 90, DisplayValues.ScreenHeight - 550);
                
           Graphics.strokeText(ScoreBoard.get(0), 80, DisplayValues.ScreenHeight - 515);
           Graphics.fillText(ScoreBoard.get(0),  80, DisplayValues.ScreenHeight - 515);  
           Graphics.strokeText(ScoreBoard.get(1), 80, DisplayValues.ScreenHeight - 480);
           Graphics.fillText(ScoreBoard.get(1),  80, DisplayValues.ScreenHeight - 480);
           Graphics.strokeText(ScoreBoard.get(2), 80, DisplayValues.ScreenHeight - 445);
           Graphics.fillText(ScoreBoard.get(2),  80, DisplayValues.ScreenHeight - 445);
           Graphics.strokeText(ScoreBoard.get(3), 80, DisplayValues.ScreenHeight - 410);
           Graphics.fillText(ScoreBoard.get(3),  80, DisplayValues.ScreenHeight - 410);
           Graphics.strokeText(ScoreBoard.get(4), 80, DisplayValues.ScreenHeight - 375);
           Graphics.fillText(ScoreBoard.get(4),  80, DisplayValues.ScreenHeight - 375);
            
           ArrayList<String> Wins = new ArrayList<String>();
           Wins.add("7");
           Wins.add("5");
           Wins.add("3");
           Wins.add("2");
           Wins.add("0");
                 
           Graphics.setFill( Color.WHITE );
           Graphics.setStroke( Color.RED );
           Graphics.setLineWidth(2);
           Graphics.setTextAlign(TextAlignment.CENTER);
           Graphics.setFont(Font.font("Agency FB",30));
                
           Graphics.strokeText(Wins.get(0), 120, DisplayValues.ScreenHeight - 510);
           Graphics.fillText(Wins.get(0),  120, DisplayValues.ScreenHeight - 510);
           Graphics.strokeText(Wins.get(1), 120, DisplayValues.ScreenHeight - 475);
           Graphics.fillText(Wins.get(1),  120, DisplayValues.ScreenHeight - 475);
           Graphics.strokeText(Wins.get(2), 120, DisplayValues.ScreenHeight - 440);
           Graphics.fillText(Wins.get(2),  120, DisplayValues.ScreenHeight - 440);
           Graphics.strokeText(Wins.get(3), 120, DisplayValues.ScreenHeight - 405);
           Graphics.fillText(Wins.get(3),  120, DisplayValues.ScreenHeight - 405);
           Graphics.strokeText(Wins.get(4), 120, DisplayValues.ScreenHeight - 370);
           Graphics.fillText(Wins.get(4),  120, DisplayValues.ScreenHeight - 370);
        }
        
        public static void ScoreDisplay(GraphicsContext Graphics){
           //explain 
           Vector Numbers = new Vector();
           Numbers.add("0");
           Numbers.add("1");
           Numbers.add("2");
           Numbers.add("3");
           Numbers.add("");
           Numbers.add("5");
           //explain 
           int i = 0;
           for(i = 0; i<Numbers.size(); i++){
             if(DisplayValues.Player1Score==i){
               Graphics.setFill( Color.WHITE );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setTextAlign(TextAlignment.CENTER);
               Graphics.setFont(Font.font("Agency FB",70));
               Graphics.strokeText(""+Numbers.get(i), DisplayValues.ScreenWidth/4, DisplayValues.ScreenHeight /2);
               Graphics.fillText(""+Numbers.get(i), DisplayValues.ScreenWidth/4 , DisplayValues.ScreenHeight / 2);
             }
            }
            //explain 
           int j = 0;
           for(j = 0; j<Numbers.size(); j++){
               
             if(DisplayValues.Player2Score==j){
               Graphics.setFill( Color.WHITE  );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setTextAlign(TextAlignment.CENTER);
               Graphics.setFont(Font.font("Agency FB",70));
               Graphics.strokeText(""+Numbers.get(j), DisplayValues.ScreenWidth/4*3, DisplayValues.ScreenHeight /2);
               Graphics.fillText(""+Numbers.get(j), DisplayValues.ScreenWidth/4*3 , DisplayValues.ScreenHeight / 2);
             }
            }
            
            
           
            
        }
        
        public static void MatchPoint(GraphicsContext Graphics){
            //explain 
            
            //explain 
            int One = DisplayValues.Player1Score;
            int Two = DisplayValues.Player2Score;
            do{
             if(One<4||One==5){
                continue;}   
             Graphics.setFill( Color.WHITE );
             Graphics.setStroke( Color.WHITE );
             Graphics.setLineWidth(2);
             Graphics.setFont(Font.font("Agency FB",60));
             Graphics.strokeText("Match Point", DisplayValues.ScreenWidth/4 , DisplayValues.ScreenHeight / 2);
             Graphics.fillText("Match Point", DisplayValues.ScreenWidth/4 , DisplayValues.ScreenHeight / 2);
             
            }while(One==6); 
            //explain 
            do{
             if(Two<4||Two==5){
                continue;}   
             Graphics.setFill( Color.WHITE );
             Graphics.setStroke( Color.WHITE );
             Graphics.setLineWidth(2);
             Graphics.setFont(Font.font("Agency FB",60));
             Graphics.strokeText("Match Point", DisplayValues.ScreenWidth/4*3, DisplayValues.ScreenHeight /2);
             Graphics.fillText("Match Point", DisplayValues.ScreenWidth/4*3 , DisplayValues.ScreenHeight / 2);
             
            }while(Two==6);
        }
        
        public static void p1Win(GraphicsContext Graphics){
            //explain 
            //explain 
            int i = DisplayValues.Player1Score;
            while(i==5){
            Graphics.setFill( Color.WHITE );
            Graphics.setStroke( Color.WHITE );
            Graphics.setLineWidth(2);
            Graphics.setFont(Font.font("Agency FB",60));
            Graphics.strokeText("Player1 Wins", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 2);
            Graphics.fillText("Player1 Wins", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 2);
            i++;
            }
        }
        
        public static void p2Win(GraphicsContext Graphics){
            //explain 
            //explain 
            int i = DisplayValues.Player2Score;
            while(i==5){
               Graphics.setFill( Color.WHITE );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setFont(Font.font("Agency FB",60));
               Graphics.strokeText("Player2 Wins", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 2);
               Graphics.fillText("Player2 Wins", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 2);
               i++;
            }
        }
    
        public static void WinnerDisplay(GraphicsContext Graphics){
          //explain   
          //explain   
          int A = DisplayValues.Player1Score;
          int B = DisplayValues.Player2Score;
          do{
               Graphics.setFill( Color.YELLOW );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setFont(Font.font("Agency FB",80));
               Graphics.strokeText("Congratulations", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 4);
               Graphics.fillText("Congratulations", DisplayValues.ScreenWidth - 480, DisplayValues.ScreenHeight / 4);    
               A++; 
               B++;
          }while(A==5 || B==5);
        }
        
         
        
        public static void Visual(GraphicsContext Graphics){
          //explain   
          //explain   
          for(int i = DisplayValues.Player1Score; i==6; i++){
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -800, DisplayValues.ScreenHeight - 210 , 605, 70,10 ,10);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -796, DisplayValues.ScreenHeight - 206 , 597, 62,10 ,10);
               Graphics.setFill(Color.WHITE);
              
               Graphics.setFill( Color.WHITE );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setTextAlign(TextAlignment.CENTER);
               Graphics.setFont(Font.font("Agency FB",60));
               Graphics.strokeText("To Restart Game Press Space", DisplayValues.ScreenWidth -500, DisplayValues.ScreenHeight / 4*3);
               Graphics.fillText("To Restart Game Press Space",DisplayValues.ScreenWidth -500 , DisplayValues.ScreenHeight / 4*3);
          }
          //explain 
          for(int i = DisplayValues.Player2Score; i==6; i++){
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -800, DisplayValues.ScreenHeight - 210 , 605, 70,10 ,10);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -796, DisplayValues.ScreenHeight - 206 , 597, 62,10 ,10);
               Graphics.setFill(Color.WHITE);
               
               Graphics.setFill( Color.WHITE );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setTextAlign(TextAlignment.CENTER);
               Graphics.setFont(Font.font("Agency FB",60));
               Graphics.strokeText("To Restart Game Press Space", DisplayValues.ScreenWidth -500, DisplayValues.ScreenHeight / 4*3);
               Graphics.fillText("To Restart Game Press Space", DisplayValues.ScreenWidth -500, DisplayValues.ScreenHeight / 4*3);
          }
        }
        
        public static void text(GraphicsContext Graphics){
                //explain 
                //explain 
                
                //player1 text 
                Graphics.setFill( Color.WHITE );
                Graphics.setStroke( Color.WHITE );
                Graphics.setLineWidth(2);
                Graphics.setTextAlign(TextAlignment.CENTER);
                Graphics.setFont(Font.font("Agency FB",60));
                Graphics.strokeText("Player 1", DisplayValues.ScreenWidth / 4, DisplayValues.ScreenHeight / 4);
                Graphics.fillText("Player 1", DisplayValues.ScreenWidth / 4, DisplayValues.ScreenHeight / 4);
                
                //player2 text 
                Graphics.setFill( Color.WHITE );
                Graphics.setStroke( Color.WHITE );
                Graphics.setLineWidth(2);
                Graphics.setTextAlign(TextAlignment.CENTER);
                Graphics.setFont(Font.font("Agency FB",60));
                Graphics.strokeText("Player 2", DisplayValues.ScreenWidth / 4*3, DisplayValues.ScreenHeight / 4);
                Graphics.fillText("Player 2", DisplayValues.ScreenWidth / 4*3, DisplayValues.ScreenHeight / 4);
        }
        
        public static void MainTitle(GraphicsContext Graphics){
                //explain 
                //Main menu title
                Graphics.setFill( Color.WHITE );
                Graphics.setStroke( Color.WHITE );
                Graphics.setLineWidth(2);
                Graphics.setTextAlign(TextAlignment.CENTER);
                Graphics.setFont(Font.font("Agency FB",100));
                Graphics.strokeText("PING PONG", DisplayValues.ScreenWidth -480, DisplayValues.ScreenHeight / 2);
                Graphics.fillText( "PING PONG", DisplayValues.ScreenWidth -480, DisplayValues.ScreenHeight / 2);
    
                Graphics.setFill( Color.YELLOW );
                Graphics.setStroke( Color.WHITE );
                Graphics.setLineWidth(2);
                Graphics.setTextAlign(TextAlignment.CENTER);
                Graphics.setFont(Font.font("Agency FB",80));
                Graphics.strokeText("Click SPACE To Start Game", DisplayValues.ScreenWidth -480, DisplayValues.ScreenHeight / 4*3);
                Graphics.fillText("Click SPACE To Start Game", DisplayValues.ScreenWidth -480, DisplayValues.ScreenHeight / 4*3);
                //Hint
                Graphics.setFill( Color.WHITE);
                Graphics.setLineWidth(2);
                Graphics.setTextAlign(TextAlignment.CENTER);
                Graphics.setFont(Font.font("Agency FB",25));
                Graphics.fillText("*You can enable 2 player mode by pressing the Y key then Space or to play the computer press the N key then space.", DisplayValues.ScreenWidth -505, DisplayValues.ScreenHeight -50);

                ScoreBoard(Graphics);
        }
        
        public static void StartScreen(GraphicsContext Graphics){
             //explain 
             if ( DisplayValues.Player1Score == 0 && DisplayValues.Player2Score == 0){
               Canvas canvas = new Canvas( DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRect(0, 0, DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               
               MainTitle(Graphics);
             }else if ( DisplayValues.Player1Score <= 5 && DisplayValues.Player2Score <= 5) {
               text(Graphics);
               MatchPoint( Graphics);
               ScoreDisplay(Graphics);
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -750, DisplayValues.ScreenHeight - 210 , 500, 70,10 ,10);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRoundRect(DisplayValues.ScreenWidth -746, DisplayValues.ScreenHeight - 206 , 492, 62,10 ,10);
               Graphics.setFill(Color.WHITE);
               
               Graphics.setFill( Color.WHITE );
               Graphics.setStroke( Color.WHITE );
               Graphics.setLineWidth(2);
               Graphics.setTextAlign(TextAlignment.CENTER);
               Graphics.setFont(Font.font("Agency FB",60));
               Graphics.strokeText("Click SPACE To Continue", DisplayValues.ScreenWidth -500, DisplayValues.ScreenHeight / 4*3);
               Graphics.fillText("Click SPACE To Continue", DisplayValues.ScreenWidth -500, DisplayValues.ScreenHeight / 4*3);
             }
        }
        
        public static void Container(){
            /*makes sure the ball stays within the stage, the way this works when the ball hits either the top or bottom the velocity Y of the Ball  
             *is times by -1 which simple inverts the values from accending to decending, this works both ways and is used to help keep the ball within 
             *the canvas.
             */
            if(ModelValues.ballYPos > DisplayValues.ScreenHeight - 24 || ModelValues.ballYPos < DisplayValues.ScreenHeight -DisplayValues.ScreenHeight + 24) {MovementValues.BallSpeedY *=-1;}
            //makes the controllable player (player 1) stay within the canvas / pitch.
            if(ModelValues.player1YPosition < 0) {ModelValues.player1YPosition  +=15;}
            if(ModelValues.player1YPosition > DisplayValues.ScreenHeight - 120 ) {ModelValues.player1YPosition  -=15;}
            //makes the controllable player (player 2) stay within the canvas / pitch.
            if(ModelValues.player2YPosition < 0) {ModelValues.player2YPosition  +=15;}
            if(ModelValues.player2YPosition > DisplayValues.ScreenHeight - 120 ) {ModelValues.player2YPosition  -=15;}
        }    
        
        public static void EndGame(GraphicsContext Graphics) {
            //explain 
            if(DisplayValues.Player1Score == 5) {
               Canvas Player1 = new Canvas( DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRect(0, 0, DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               p1Win(Graphics);
               WinnerDisplay(Graphics);
            }else if (DisplayValues.Player2Score == 5 ){
               Canvas Player2 = new Canvas( DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               Graphics.setFill(Color.BLACK);
               Graphics.fillRect(0, 0, DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
               p2Win(Graphics);
               WinnerDisplay(Graphics);
            }else if (DisplayValues.Player2Score == 6 || DisplayValues.Player1Score ==6){
              DisplayValues.Player2Score = 0;
              DisplayValues.Player1Score = 0; 
              ModelValues.player1YPosition = DisplayValues.ScreenHeight / 2 - 60;
              ModelValues.player2YPosition = DisplayValues.ScreenHeight / 2 - 60;
            }
        }
        
        public static void Player2Tracking(){
            //explain 
            if (Enable){
                
            }else if (Disable || Start){
              //computer opponent who is following the ball
                if(ModelValues.ballYPos < ModelValues.PaddleHeight  ) {
                    // This tells the AI to follow the ball 
                    ModelValues.player2YPosition = ModelValues.ballYPos - ModelValues.PaddleHeight/2  ;
    
               } else if (ModelValues.ballYPos > ModelValues.PaddleHeight) {
                
                   ModelValues.player2YPosition = ModelValues.ballYPos - ModelValues.PaddleHeight/2  ;
               } 
            }
        }
   
        public static void Player1Misses(GraphicsContext Graphics){
            //explain 
            if(ModelValues.ballXPos > ModelValues.player2XPosition + ModelValues.BallSize ) {  

                DisplayValues.Player1Score++;
                Start = false;
            }
        }

        public static void Player2Misses(GraphicsContext Graphics){
            //if the computer misses the ball, you get a point
            if(ModelValues.ballXPos < ModelValues.player1XPosition - ModelValues.BallSize ) {

                DisplayValues.Player2Score++;
                Start = false;
            }
        }

        public static void Collition(){
            //increase the speed after the ball hits the player1 and Player 2
        
            if( ((ModelValues.ballXPos + ModelValues.BallSize > ModelValues.player2XPosition) && ModelValues.ballYPos >= ModelValues.player2YPosition && ModelValues.ballYPos <= ModelValues.player2YPosition + ModelValues.PaddleHeight)){
           
                MovementValues.BallSpeedY +=  player2pad ;

                MovementValues.BallSpeedX += Math.signum(MovementValues.BallSpeedX); 

                MovementValues.BallSpeedX *= -1 ;

                MovementValues.BallSpeedY *= -1 ;
        
            }
            if( ((ModelValues.ballXPos < ModelValues.player1XPosition + ModelValues.PaddleWidth + 15) && ModelValues.ballYPos >= ModelValues.player1YPosition && ModelValues.ballYPos <= ModelValues.player1YPosition + ModelValues.PaddleHeight)){

                MovementValues.BallSpeedY += player1pad ;

                MovementValues.BallSpeedX += Math.signum(MovementValues.BallSpeedX);

                MovementValues.BallSpeedX *= -1 ;

                MovementValues.BallSpeedY *= -1 ;
        
            }
       
        }   
} 
