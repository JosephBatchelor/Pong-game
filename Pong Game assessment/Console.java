
public class Console extends Main{
    private static String appD= "\n<------------Application details----------->";
    private static String key= "\n<--------------Keystroke Input------------->";
    
   public static void Display(){
        int Width = output(0,0);
        int Heigth = output(0);
        double BallSpeedY = output(0.0);
        double BallSpeedX = output(0.0,0.0);
        System.out.println(output("",""));
        System.out.println(appD);
        System.out.println("Canvas Width: "+Width);
        System.out.println("Canvas Height: "+Heigth);
        System.out.println("Starting BallSpeedY: "+BallSpeedY);
        System.out.println("Starting BallSpeedX: "+BallSpeedX);
        System.out.println(output("","","",""));
        System.out.println(key);
        System.out.println(Keystroke(""));
          }
          
   public static String output(String X,String Y){
         X = "<----------------PING PONG---------------->";
         Y = "Something";
         
        return X +"\n"+Y;
   }
   
   public static String output(String p1,String p2,String Title,String Gen){
        Title = "<----------------Controls----------------->";
       p1 = "\nPlayer 1: \n-W key = Up \n-S key = Down ";
       p2 ="\n\nPlayer 2: \n-Arrow key Up = Up \n-Arrow key Down = Down";
       Gen = "\n\nGeneal keys: \n-Space key = Start \n-Y key = Enables 2 player \n-N key = Disables 2 player";
       return Title+p1+p2+Gen;
   }
   
   public static int output(int x){
       x= DisplayValues.ScreenHeight;
       return x;
   }
   public static int output(int x,int y ){
       x= DisplayValues.ScreenWidth;
       return x;
   }
   
   public static double output(double x){
       x= MovementValues.BallSpeedY;
       return x;
   }
 
   public static double output(double x,double y){
       x= MovementValues.BallSpeedX;
       return x;
   }
   
   public static String Keystroke(String Key){
        System.out.println(Key);
        return Key;
   }
}
