import java.util.Scanner;

class Main {

 //we can add more rooms later if there is a need.

   public static void main(String[] args){
  
    
    Intro();
    Run();
   }

  
  
  public static void Intro(){
    
    Introduction intro = new Introduction();
    intro.Intructions();
    intro.characterCreator();

  }
  public static void Run(){
    Rooms StartGame = new Rooms();
    public static boolean running = true;
    
    while(running == true){
      StartGame.Input();
    }
  }

}