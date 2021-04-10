import java.util.Scanner;

class Rooms {
  
  

private static int roomNum = 1;
private Scanner scanner1;
private String inputRooms; 
boolean running = true;
private static boolean hasLooked = false;


  //read the action inputs
  public void Input(){

    scanner1 = new Scanner(System.in);
    inputRooms = scanner1.nextLine();
    //turns the input to lower case. Makes it easier for the user.
    inputRooms = inputRooms.toLowerCase(); 

     

    if(inputRooms.contains("look")){
      Look();
    }else if(inputRooms.contains("observe")){
      Observe();
    }else if(inputRooms.contains("interact")){
      Interact();
    }else if(inputRooms.contains("clue")){
      Clue();
    }else if(inputRooms.contains("inventory")){
      Inventory.PrintInventory();
    } else {
      Help();
    }
     
  }

  public void Help(){
    System.out.println("Please type a valid command, you can type \" LOOK \", \" OBSERVE \", \" INTERACT \" or \" CLUE \". \" LOOK \" lists all the objects that you see. You can \" OBSERVE \" all the items that you see. You can \" INTERACT \" with any item that you find with other items that you see in the room. Type \" clue \" if you are having a hard time finishing the puzzle. Good luck!");

  }
  //possible messages for look
  public void Look(){
    if(roomNum == 1){
      System.out.println("You’re stuck in a room, all that’s around you is a" + ConsoleColors.YELLOW_BOLD + " bed, a toilet, a door, " + ConsoleColors.RESET +  "and your own thoughts.");
      hasLooked = true;
    }

    if(roomNum == 2){
      System.out.println("You’re in the guards' chambers, there’s a" + ConsoleColors.YELLOW_BOLD + " guard " + ConsoleColors.RESET +  "right ahead of you.");
    }

    if(roomNum == 3){
      System.out.println("You see a room with 2 Pressure Activated Plates, it seems that you would need to be on both plates, but alas, you are too small for that to work.");
    }

  }

  public void Observe(){

    //Scanner scanner1 = new Scanner(System.in);
    //String inputRooms = scanner1.nextLine();

      if(roomNum == 1 && hasLooked){
          if(inputRooms.toLowerCase().contains("bed")){
            System.out.println("You take a closer look at the bed, it’s red sheets and white pillow are all the more perplexing. After looking under the bed, you find a small" + ConsoleColors.YELLOW_BOLD + " key, " + ConsoleColors.RESET + "and take it.");

            Inventory.InventoryList("Key");
            
          }else if(inputRooms.contains("toilet")){
            System.out.println(" It’s a toilet, white and shiny, it looks like it hasn’t been used so far.");
          
          }else if(inputRooms.contains("door")){
            System.out.println("it’s a solid grey concrete door, though there is an open keyhole.");
          }else{
            System.out.println("This cannot be observed.");
          }

      }else{
        System.out.println("You cannot obverse an object before you look.");
      }
    
  }
  public void Interact(){

    
    
    if(roomNum == 1){
      if(Inventory.addObjects.contains("Key")){
        if(inputRooms.contains("key") && inputRooms.contains("door")){
        roomNum = 2;
        hasLooked = false;
        System.out.println("Congrats! You made it out of the Jail Cell. ");
        }
      } else {
        System.out.println("You can't do that!");
      }
    }
    
  }


  public void Clue(){
    if(roomNum == 1){
      System.out.println("Maybe there’s a" + ConsoleColors.YELLOW_BOLD + "key" + ConsoleColors.RESET + "somewhere, try to OBSERVE the BED");
    }

    if(roomNum == 2){
      System.out.println("If you were to INTERACT with GUARD, you just might slip past.");
    }

    if(roomNum == 3){
      System.out.println("That guard would be a good weight for that second plate, try to INTERACT with the GUARD.");

    }
  

  }
  
  



}
