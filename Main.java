import java.util.Scanner;

public class Main {

   
   public static void main(String []args) {
    Scanner scan = new Scanner(System.in);
    
    String className;



    System.out.println("Pick a race: orc, elf, human, tree, tiefling, gnome, dwarf, halfling, and gundam.");
    String command = scan.nextLine();

    if (command.equals("orc")){
      String race = command;
      System.out.print("You picked " + race);
    }
    else if (command.equals("elf")){
      String race = command;
      System.out.print("You picked " + race);
    }
    else if (command.equals("human")){
      String race = command;
      System.out.print("You picked " + race);
    }
    else if (command.equals("tree")){
      String race = command;
      System.out.print("You picked " + race);
    }
    else if (command.equals("tiefling")){
      String race = command;
      System.out.print("You picked " + race);
    }
    else if (command.equals("gnome")){
      String race = command;
      System.out.println("You picked " + race);
    }
    else if (command.equals("dwarf")){
      String race = command;
      System.out.println("You picked " + race);
    }
    else if (command.equals("halfling")){
      String race = command;
      System.out.println("You picked " + race);
    }
    else if (command.equals("gundam")){
      String race = command;
      System.out.println("You picked " + race);
    }
    else if (command.equals("Tyler the Creator")){
      System.out.println("PEAK");
    }
    else if (command.equals("ye")){
      System.out.println("");
    }
    else {
      System.out.println("Learn how to spell, dingus. Should should reload, NOW!");
    }

    



   }
}
