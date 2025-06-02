import java.util.Scanner;

public class Main {

   
   public static void main(String []args) {
    Scanner scan = new Scanner(System.in);
    
int maxHealth = 20;
String className;
String race;
String biome;
    System.out.println("Pick a race: orc, elf, human, tiefling, gnome, dwarf, halfling, and gundam.");
    String command = scan.nextLine();

    if (command.equals("orc")){
       race = command;
      
      System.out.println("You picked " + race + ". Your health is " + maxHealth + "! Stay healthy!");
      

      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
         className = command;
        System.out.println("You picked " + className + "!");
        
        
        System.out.println("You must now pick an area to spawn in! You can pick from Mountain, Hell, Grassland, Ocean, Desert.");
        command = scan.nextLine();
        if(command.equals("Mountain") ) {
           biome = command;
          System.out.println("You picked, " + biome + "!");

          
          System.out.println("You have spawned on a large mountain, it is cold. There are two paths, one leading down the mountain and one leading up the mountain. which do you pick? (up,down)");
          System.out.println("Your health is " + maxHealth);
          command = scan.nextLine();
          if (command.equals("up")) {
            
            System.out.println("As you walk up the path, you reach the peak. You freeze to death. THE FROZEN ENDING");
          }
          if (command.equals("down")) {
            

            
            System.out.println("Your health is " + maxHealth);
            System.out.println("The path leads you down to the entrance of a cave. You can enter or turn back.(enter/back)");
           command = scan.nextLine();
            if(command.equals("back")) {
              
              System.out.println(maxHealth);
              System.out.println("You walk back to the path you were on before. You can keep walking or look around. (walk/look)");
              command = scan.nextLine();
              if(command.equals("walk")) {
              
              System.out.println(maxHealth);
              System.out.println("You keep walking, and you feel like you're not supposed to be there. The world feels more and more off each time you take a step. Fog starts to appear and get denser. You can only go forward.(forward)");
              command = scan.nextLine();
              if(command.equals("forward")) {
              
              System.out.println(maxHealth);
              System.out.println("You keep wqlking forward. You can't see anything. Then, you accidently walk off a cliff.THE LOST ENDING");
              command = scan.nextLine();
            }
            }
            if(command.equals("look")) {
             
              System.out.println(maxHealth);
              System.out.println("You look around, and hear clomping of hooves, and it's getting louder. You look to see a large ram charging straight for you. You can either challenge it or run away.(challenge/run)");
              command = scan.nextLine();
              if(command.equals("run")) {
              
              System.out.println(maxHealth - 10);
              System.out.println("You try to run, but it catches up to you and hits you square in the back. You take 10 damage. It winds up to charge again. You can run or attack it. (run/attack)");
              command = scan.nextLine();
              if(command.equals("run")){
                System.out.println("It catches up, and kills you on impact.");
              }
              if (command.equals("attack")) {
              if(className.equals("Wizard")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Fighter")){
              System.out.println(maxHealth);
              System.out.println("You stab the ram in the head with your sword. Ending the beast. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING ");
              
              }
              if(className.equals("Monk")){
              System.out.println(maxHealth);
              System.out.println("You unleash a flurry of punches, ending the beast. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING ");
              
              }
              if(className.equals("Druid")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Warlock")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Barbarian")){
              System.out.println(maxHealth);
              System.out.println("You swing your axe at it, and lob its head off. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING");

              if(command.equals("challenge")) {
              
              System.out.println(maxHealth);
              System.out.println("You charge straight at the ram. Do you attack it or dodge it?(attack/dodge)");
              command = scan.nextLine();

             if(command.equals("attack")) {
              if(className.equals("Wizard")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Fighter")){
              System.out.println(maxHealth);
              System.out.println("You stab the ram in the head with your sword. Ending the beast. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING ");
              
              }
              if(className.equals("Monk")){
              System.out.println(maxHealth);
              System.out.println("You unleash a flurry of punches, ending the beast. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING ");
              
              }
              if(className.equals("Druid")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Warlock")){
              System.out.println(maxHealth);
              System.out.println("You're a spellcaster! You have no close range options, and therefore die. THE STUPID ENDING");
              
              }
              if(className.equals("Barbarian")){
              System.out.println(maxHealth);
              System.out.println("You swing your axe at it, and lob its head off. You look around, nothing else to bother you, so you look at the view of the mountain range. THE VIEW ENDING");
              
              }
              if(command.equals("dodge")){
                System.out.println("There isn't enough time to dodge it, and it hits you straight in the head, killing you instantly.");
              }
            }
            }
            }
            }
          }
        }
      }
    }
  }
        if(command.equals("Hell") ) {
           biome = command;
          System.out.println("You picked," + biome + "!");

          System.out.println("You have spawned in hell. You get tortured for till the end of time. THE HELL ENDING(what did you expect)");
        }
        if(command.equals("Grassland") ) {
           biome = command;
          System.out.println("You picked," + biome + "!");
          System.out.println("You have spawned in a grassland. It is quiet, too quiet. Do you look around, or take a nap?(look/nap)");
          System.out.println("Your health is " + maxHealth);
          command = scan.nextLine();
          if(command.equals("look")){
            System.out.println("You look around to see nothing but peaceful grass, and an amazing view. THE TOUCHING GRAS ENDING");
            
          }
          if(command.equals("nap")){
            System.out.println("You fall asleep in the grassland, letting the world take the wheel. THE SLEEP ENDING.");
            
          }
        }
        if(command.equals("Desert") ) {
           biome = command;
          System.out.println("You picked," + biome + "!");
          System.out.println("You have spawned in a desert. It is hot. There seems to be a oasis nearby. There is also a group of people behind you.(oasis/people)");
          System.out.println("Your health is " + maxHealth);
          
          if(command.equals("oasis")){
            System.out.println("You go up to the oasis, and touch the water. You feel your hands hit the sand, and realize it was a mirage. The wind starts to pick up. A sandstorm is rolling in. You can either run, or look around for shelter(look,run)");
            System.out.println("Your health is " + maxHealth);
            command = scan.nextLine;
            if (command.equals("look")) {
              System.out.println("You try to look for a place to hide, but you take too long and are swept away by the sandstorm.");
              
            }
            if (command.equals("run")) {
              System.out.println("You don't even look anywhere, you just run. You can feel the storm getting closer and closer until it swallows you whole. THE HOPELESS ENDING");
              
            }
          }
          if(command.equals("people")){
            System.out.println("You walk to the group of people, they turn out to be a group of merchants. You have no money, so you can't buy anything. You and the merchant group awquardly stare ateach, not daring to move or say something. THE QUIET ENDING");
            System.out.println("Your health is " + maxHealth);
          }

        }
        if(command.equals("Ocean") ) {
           biome = command;
          System.out.println("You picked," + biome + "!");

          System.out.println("You drowned. THE OBVIOUS ENDING");
        }
      
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }

      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      

    }
    else if (command.equals("elf")){
       race = command;
      
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      
      
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("human")){
       race = command;
      
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      
      }
    }
    
    
    else if (command.equals("tiefling")){
       race = command;
      
      System.out.print("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
     
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("gnome")){
       race = command;
      
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
  
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("dwarf")){
  
       race = command;
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
    }
    else if (command.equals("halfling")){
      
      race = command;
      System.out.println("You picked " + race);
      System.out.println("Now, pick a class. Wizard, Fighter, Monk, Druid, Fighter, Barbarian, Rogue, Warlock");
       command = scan.nextLine();
      if(command.equals("Wizard")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Fighter")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Monk")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Virgil from DMC5")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Gun")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Shadow the hedgehog")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Warlock")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Druid")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
      if(command.equals("Barbarian")){
        className = command;
        System.out.println("You picked " + className + "!");
      }
    }
  





    else if (command.equals("gundam")){
      
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

   
  

