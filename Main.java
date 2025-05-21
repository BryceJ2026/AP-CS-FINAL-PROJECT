import java.util.Scanner;

public class Main {

   
   public static void main(String []args) {
    Scanner scan = new Scanner(System.in);
    

    System.out.println("Pick a race: orc, elf, human, tree, tiefling, gnome, dwarf, halfling, and gundam.");
    String command = scan.nextLine();

    if (command.equals("orc")){
      String race = command;
      int maxHealth = 20;
      System.out.println("You picked " + race + ". Your health is " + maxHealth + "! Stay healthy!");
      

      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
        
        
        System.out.println("You must now pick an area to spawn in! You can pick from Mountain, Hell, Grassland, Ocean, Desert.");
        command = scan.nextLine();
        if(command.equals("Mountain") ) {
          String biome = command;
          System.out.println("You picked, " + biome + "!");

          command = scan.nextLine();
          System.out.println("You have spawned on a large mountain, it is cold. There are two paths, one leading down the mountain and one leading up the mountain. which do you pick? (up,down)");

          if (command.equals("up")) {
            System.out.println("As you walk up the path, you reach the peak. You freeze to death. THE FROZEN ENDING");
          }
          if (command.equals("down")) {
            System.out.println("The path leads you down to the entrance of a cave.");
          }
        }
        if(command.equals("Hell") ) {
          String biome = command;
          System.out.println("You picked," + biome + "!");

          System.out.println("You have spawned in hell. You get tortured for till the end of time. THE HELL ENDING(what did you expect)");
        }
        if(command.equals("Grassland") ) {
          String biome = command;
          System.out.println("You picked," + biome + "!");
          System.out.println("You have spawned in a grassland. It is quiet, too quiet. Do you look around, or take a nap?(look/nap)");
        }
        if(command.equals("Desert") ) {
          String biome = command;
          System.out.println("You picked," + biome + "!");
          System.out.println("You have spawned in a desert. It is hot. There seems to be a oasis nearby. There is also a group of people behind you.(oasis/people)");
        }
        if(command.equals("Ocean") ) {
          String biome = command;
          System.out.println("You picked," + biome + "!");

          System.out.println("You drowned. THE OBVIOUS ENDING");
        }
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      

    }
    else if (command.equals("elf")){
      String race = command;
      int maxHealth = 20;
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("human")){
      String race = command;
      int maxHealth = 20;
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("tree")){
      int maxHealth = 20;
      String race = command;
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("tiefling")){
      String race = command;
      int maxHealth = 20;
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("gnome")){
      String race = command;
      int maxHealth = 20;
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("dwarf")){
      int maxHealth = 20;
      String race = command;
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("halfling")){
      int maxHealth = 20;
      String race = command;
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Virgil from DMC5, Gun, Shadow the hedgehog, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        String className = command;
        System.out.println("You picked " + className + "!");
      }
    }
  





    else if (command.equals("gundam")){
      String race = command;
      System.out.println("You fly off into space. THE GUNDAM ENDING");
      
    }
    else if (command.equals("Tyler the Creator")){
      System.out.println("PEAK. THE TYLER ENDING");
    }
    else if (command.equals("ye")){
      System.out.println("We miss the old kanye. THE YE ENDING");
    }
    else if (command.equals("Mario")){
      System.out.println("Go back to the mushroom kingdom. THE MARIO ENDING");
    }
    else if (command.equals("Luigi")){
      System.out.println("L is real. THE L ENDING");
    }
    else if (command.equals("Toad")){
      System.out.println("Get out. Leave. We don't want you here. THE TOAD ENDING");
    }
    else if (command.equals("Secret")){
      System.out.println("Oh wow, look at the special little baby trying to be cool. Get out of my sight. THE 'SECRET' ENDING");
    }
    else {
      System.out.println("Learn how to spell, dingus. YOU should reload, NOW! THE DINGUS ENDING");
    }

    



   }
}
