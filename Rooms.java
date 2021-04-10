import java.util.Scanner;

class Rooms {
  
  

private static int roomNum = 1;
private Scanner scanner1;
private String inputRooms; 

  //read the action inputs
  public void Input(){

    scanner1 = new Scanner(System.in);
    inputRooms = scanner1.nextLine();

    if(inputRooms.contains("look")){
      look();
    }
    
    if(inputRooms.contains("observe")){
      observe();
    }
   
    if(inputRooms.contains("interact")){
      interact();
    }
    
    if(inputRooms.contains("clue")){
      clue();
    }
     
  }
  //possible messages for look
  public void look(){
    if(roomNum == 1){
      System.out.println("You’re stuck in a room, all that’s around you is a bed a toilet, a door, and your own thoughts.");
    }

    if(roomNum == 2){
      System.out.println("You’re in the guards' chambers, there’s a guard right ahead of you.");
    }

    if(roomNum == 3){
      System.out.println("You see a room with 2 Pressure Activated Plates, it seems that you would need to be on both plates, but alas, you are too small for that to work.");
    }

  }

  public void observe(){

    Scanner scanner1 = new Scanner(System.in);
    String inputRooms = scanner1.nextLine();

      if(roomNum == 1){
          if(inputRooms.contains("bed")){
            System.out.println("You take a closer look at the bed, it’s red sheets and white pillow all the more perplexing. After looking under the bed, you find a small key, and take it.");
            
          }else if(inputRooms.contains("toilet")){
            System.out.println(" It’s a toilet, white and shiny, it looks like it hasn’t been used so far.");
          
          }else if(inputRooms.contains("door")){
            System.out.println("it’s a solid grey concrete door, though there is an open keyhole.");
          }

      }
    
  }
  public void interact(){

    Scanner scanner1 = new Scanner(System.in);
    String inputRooms = scanner1.nextLine();

    if(roomNum == 1){
      if(inputRooms.contains("key") && inputRooms.contains("door")){
        roomNum = 2;
        
      }
    }
    
  }


  public void clue(){
    if(roomNum == 1){
      System.out.println("Maybe there’s a key somewhere, try to OBSERVE the BED");
    }

    if(roomNum == 2){
      System.out.println("If you were to INTERACT with GUARD, you just might slip past.");
    }

    if(roomNum == 3){
      System.out.println("That guard would be a good weight for that second plate, try to INTERACT with the GUARD.");
      break
    }
  

  }

}
