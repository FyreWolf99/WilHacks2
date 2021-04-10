import java.util.Scanner;
public class Introduction{
  private String name;
  private String eyeColor;
  private String hairColor;

  public void Intructions(){
    System.out.println("Welcome to the Prison Escape Room Game! Your task is to use various actions including 'look', 'observe', 'interact', and 'clue' to help you escape the prison. ");
    System.out.println("Here is a list the functions of each of the commands: ");
    String look = "look: gives a 360 view of the entire room and the objects within it.";
    String observe = "observe: gives a specific description of the one of the objects in the room";
    String interact = "interact: allows you to use a choosen object";
    String clue = "clue: gives a hint to help you solve the puzzle and escape one room";
    System.out.print(look + "\n" + observe + "\n" + interact + "\n" + clue);

  }
  public void characterCreator(){
    System.out.println("Now that you understand the guidelines to the game. It is time to create your character!");
    System.out.println("Please enter the name you would like to give your character: ");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    System.out.println("Please enter the hair color for your character: ");
    hairColor = input.nextLine();
    System.out.println("Please enter the eye color for your character: ");
    eyeColor = input.nextLine();
    System.out.println("Congratulations!!! You have finished creating your character!");
  }
}