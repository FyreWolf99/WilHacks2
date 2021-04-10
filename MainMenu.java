import java.util.Scanner;

public class MainMenu{
  private static Scanner scanner5;
  private static String gameStart;
  public static void startGame(){
    scanner5 = new Scanner(System.in);
    gameStart = scanner5.nextLine();
    gameStart = gameStart.toLowerCase();

    if(gameStart.contains("play")){
      Main.mainMenuOver = true;
    }
  }

}