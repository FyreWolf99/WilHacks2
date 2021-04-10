import java.util.Scanner;

class Main {

 //we can add more rooms later if there is a need.
 public static boolean mainMenuOver;

  public static void main(String[] args){
    
    MainMenu();
    Intro();
    Run();
  }

  public static void MainMenu(){
      MainMenu menu = new MainMenu();
      menu.startGame();
      

  }
  
  public static void Intro(){
    if(mainMenuOver == true){
      Introduction intro = new Introduction();
      intro.Intructions();
      intro.characterCreator();
    }

  }
  public static void Run(){
    Rooms StartGame = new Rooms();
    boolean running = true;
    
    while(running){
      StartGame.Input();
    }
  }
}