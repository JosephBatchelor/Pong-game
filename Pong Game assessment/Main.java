import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
public class Main extends Application {
    public static boolean Start;
    public static boolean Enable;
    public static boolean Disable;
    /*
     * 
     */
    private static void main(String[] args){
        launch(args);
        
    }
    /*
     * Method start holds all my objects as well as my key control it plays an important role in 
     *functionaility.
     */
     public void start(Stage stage){
        /*
           This simple line below is used to set the title of the windows once the application is 
           running. As you can see i have set the title name to "Ping Pong", this can be seen in 
           the top left of the windows once ran.
        */
        stage.setTitle("Ping Pong");
        /*
          Group is a java import that is designed to have the ability to control nodes from an
          obserable list. Ive decided to create an object called group and will be using this import
          to use the method .getChildren() which can be seen below this allows me to get a list of
          childern nodes from this group.
        */
        Group group = new Group();
        /*
           Another object created is the scene this is also another java import that allows me to 
           use graphics and control features. this this case i have used Scene for my key control 
           which can be seen below. the reason for this nor group or canavs would allow me to manipulate 
           keycode control, by using scene this allows to do so.
        */
        Scene scene = new Scene(group);
        /*
         * Creating a new Canvas allows me to create a background dimension for my game to be displayed in.
         * The values I used are pulled from class DisplayValues, and should create a 1000 by 600 window.
         * 
        */
        Canvas canvas = new Canvas(DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
        group.getChildren().add(canvas);
        //The GraphicsContext import will allow me paint objects so that they are displayed on screen.
        //Throughout my classes you will see the parameters "GraphicsContext Graphics" which are essetnailly 
        //Using this object.
        GraphicsContext Graphics = canvas.getGraphicsContext2D();
        /*
         * This switch statement is used to old my key controls for both player 1 and player 2. It also houses 
         * additonal actions events using other keys such as space ,Y and N. Simple use of a switch with break.
         * statements so that each block is ran once , when the condition is met.
         */
         scene.setOnKeyPressed(e -> {
             //This line simple sends the keyscode of keys presses to Class Console , this allows the for the 
             //keys to be printed within the console. This line of code was found from the breakout game given 
             //us by roger the exact details can be found with the refernce page my report. (line 78)
        Console.Keystroke("Keystroke Down: " + e.getCode() );
        switch (e.getCode()) {
                case W:
                    ModelValues.player1YPosition = ModelValues.player1YPosition -15;
                    break;
                case S:
                    ModelValues.player1YPosition = ModelValues.player1YPosition + 15;
                    break;
                case SPACE:
                    Start = true;
                    break;
                    
                case Y:
                    Enable = true;
                    break;
                case N:
                    Disable = true;
                    break;
                    
                case UP:
                    ModelValues.player2YPosition = ModelValues.player2YPosition -15;
                    break;
                case DOWN:
                    ModelValues.player2YPosition = ModelValues.player2YPosition + 15;
                    break;
  
        }});
        scene.setOnKeyReleased(e -> {
        Console.Keystroke("Keystroke Up: " + e.getCode() ); //this line of code was taken from the breakout game same as the one above.
        switch (e.getCode()) {
                case W:
                    ModelValues.player1YPosition = ModelValues.player1YPosition -15;
                    break;
                case S:
                    ModelValues.player1YPosition = ModelValues.player1YPosition + 15;
                    break;
                    
                case UP:
                    ModelValues.player2YPosition = ModelValues.player2YPosition -15;
                    break;
                case DOWN:
                    ModelValues.player2YPosition = ModelValues.player2YPosition + 15;
                    break; 

            }}); 
        /*
           Using the parameter stage which a javaFX container i have set scene to object scene. Without this 
           line controls and graphics will not appear making the game unplayable. 
        */
        stage.setScene(scene);
        /*
           This line simply displays the stage i.e the graphics and the all the classes methods on the window.
        */
        stage.show();
        /*
           This method which can be seen below is used to set the dynamics of within the game this ill be 
           explained in detail below.
        */
        Dynamics(Graphics);
        //This displays all the text that needs printing in class Console this line simple calls the method
        //that prints text into the console.
        Console.Display();
    }
    /*
     * This method plays an important in simulating movement. this method is implemnted to refresh and update 
     * the game as for every refresh the mthod updates the method visual which essentially updates the methods
     * called from both class model and class function. Simulating movement , but in stead its updating the 
     * values of models so quick that it looks like smooth movement. I uses encapsulation to prevent other 
     * classes from altering.
     * Link-https://www.programcreek.com/java-api-examples/?api=javafx.animation.Timeline 
     */
    private static void Dynamics(GraphicsContext Graphics){
        //This objct is created to allow me to use the features of the import. Infomration on how i used java 
        //timeline was found on a website the link can be found in the reference page. 
        Timeline time = new Timeline();
        //TimeLine is a java fx import that helps for smoother frames when objects is moving within the stage.   
        /*
        * This line simply specifies the number of times the animation refreshes. 
        * You are able to set a limit of the amount of refreshes the application should preform by using a intger
        * However if ou want the application to constantly refresh use INDEFINITE which will refresh until the application has finshed or closed.
        */ 
        time.setCycleCount(Timeline.INDEFINITE);
        /*
        The line below is used to update the canvas the visuals on the canvas, meaning that every 8 milliseconds 
        will update the objects. 
        */
        time.getKeyFrames().add(new KeyFrame(Duration.millis(8),frame -> Visual(Graphics)));
        time.play();
    }
    /*
     * This method will provide the visuals and Display of objects and the stage.
    * This method will hold all objects created from class Models.
    */
    public static void Visual(GraphicsContext Graphics) {
        /*The two lines below are using the GraphicsContext import to help fill out the stage.
         * The setFill is used to specify the color you wantto fill your object.
         * The line belows is used to fill in the stage were using which should be the same as the Canvas size.
         * The two values (0,0) at the start of setFill are x and y coordinates this sets the location in the window of where the stage will be positioned (0,0 is center).
        */
        Graphics.setFill(Color.BLACK);
        Graphics.fillRect(0, 0, DisplayValues.ScreenWidth ,DisplayValues.ScreenHeight);
        /*GraphicsContext is able to be applied to text which is one of the reasons i decided to choose it becuase of its functionility.
         * The two lines below are implemented to display the color of the text as well as the style and size.
        */
        Graphics.setFill(Color.WHITE);
        Graphics.setFont(Font.font("Agency FB",35));
        //Objects made to call methods from class Model this is how models are displayed on screen.
        Models Visual = new Models();
        Visual.Scoreboardp1(Graphics);
        Visual.Scoreboardp2(Graphics);
        Visual.CenterLine(Graphics);
        Visual.CenterCircle(Graphics);
        Visual.CenterInnerCircle(Graphics);
        Visual.Visual(Graphics);
        Visual.Player2(Graphics);
        Visual.Ball(Graphics);
        Visual.PitchTop(Graphics);
        Visual.PitchBottom(Graphics);
        //This sections calls the methods found in fucntion which help provide the games movement and playability.By making an object for class Function
        Function funct = new Function();
        funct.Function(Graphics);
        funct.Player2Tracking();
        funct.Collition();
        funct.Player1Misses(Graphics);
        funct.Player2Misses(Graphics);
        funct.Container();
        funct.Visual(Graphics);
    }
}
