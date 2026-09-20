import java.util.Scanner;
public class Nokia{
    public static void main(String[] args){
        Scanner inputCollector= new Scanner(System.in);

        String prompt = """

Welcome to Nokia

1. Phonebook
2. Message
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music
9. Games
10. Calculator
11. Reminders7
12. Clock
13. Profiles
14. Services
15. SIM services
""";

        
        System.out.println(prompt);
        int menuChoice = inputCollector.nextInt();
       
        switch(menuChoice){
            case 1 -> {System.out.println("Phonebook");
                String phoneBookMenu = """
1   Search
2   Service nos
3   Add name
4   Erase
5   Edit
6   Copy
7   Assign tone
8   Send b'card
9   Option
10  Speed dials
11  Voice tags
""";

                System.out.println(phoneBookMenu);
                int phoneBookMenuChoice = inputCollector.nextInt();

                switch(phoneBookMenuChoice){
                    case 1 -> {System.out.println("Search");}
                    case 2 -> {System.out.println("Service nos");}
                    case 3 -> {System.out.println("Add name");}
                    case 4 -> {System.out.println("Erase");}
                    case 5 -> {System.out.println("Edit");}
                    case 6 -> {System.out.println("Copy");}
                    case 7 -> {System.out.println("Assign tone");}
                    case 8 -> {System.out.println("Send b'card");}
                    case 9 -> {System.out.println("Option");
                        String optionMenu = """

1. Memory in use
2. Types of view
3. Memory status

""";
                        System.out.println(optionMenu);
                        int optionMenuChoice = inputCollector.nextInt();
                        
                        switch(optionMenuChoice){
                            case 1 -> {System.out.println("Memory in use");}
                            case 2 -> {System.out.println("Types of view");}
                            case 3 -> {System.out.println("Memory status");}
                            default -> {System.out.println("Invalid input");} 
                        }
                    }
                    case 10 -> {System.out.println("Speed dials");}
                    case 11 -> {System.out.println("Voice tags");}  
                    default -> {System.out.println("Invalid input");}              
                }
            }
            case 2 -> {System.out.println("Mesage");
                String messageMenu = """
1   Write messages
2   Inbox
3   Outbox
4   Picture messages
5   Templates
6   Smileys
7   Message settings
8   Info service
9   Voice mailbox number 
10  Service command editor
""";

                System.out.println(messageMenu);
                int messageMenuChoice = inputCollector.nextInt();
                
                switch(messageMenuChoice){
                    case 1 -> {System.out.println("Write messages");}
                    case 2 -> {System.out.println("Inbox");}
                    case 3 -> {System.out.println("Outbox");}
                    case 4 -> {System.out.println("Picture messges");}
                    case 5 -> {System.out.println("Templates");}
                    case 6 -> {System.out.println("Smileys");}
                    case 7 -> {System.out.println("Message settings");
                        String messagesettingsMenu = """
    1.  Set1
    2.  Common
    """;
                                                
                        System.out.println(messagesettingsMenu);
                        int messagesettingsMenuChoice = inputCollector.nextInt();
                        switch(messagesettingsMenuChoice){
                        case 1 -> {
         String Set1Menu = """
1.  Message centre number
2.  Message sent as 
3.  Message validity
""";    
                        System.out.println(Set1Menu);
                        int messagesettingMenuChoice = inputCollector.nextInt();
                        switch(messagesettingMenuChoice) {
                        
                            case 1 ->   {System.out.println("Message centre number");}
                            case 2 ->   {System.out.println("Message sent as");}
                            case 3 ->   {System.out.println("Message validity");}
                            default -> {System.out.println("Invalid input");}  
                            }
                            }
                             
                 
                        case 2 -> {
                        
                        String commonMenu = """
1. Delivery reports
2. Reply via same centre
3. Character support
""";
                        
                        System.out.println(commonMenu);
                        int commonMenuChoice = inputCollector.nextInt();

                        switch(commonMenuChoice){
                            case 1 ->   {System.out.println("Delivery reports");}
                            case 2 ->   {System.out.println("Reply via same centre");}
                            case 3 ->   {System.out.println("Character support");}
                            default -> {System.out.println("Invalid input");}
                        }   
                                }
                                }
                                }

                    case 8 -> {System.out.println("Info service");}
                    case 9 -> {System.out.println("Voice mailbox number");}
                    case 10 -> {System.out.println("Service command editor");}
                    default -> {System.out.println("Invalid input");} 
                    
                   } 
                }

            case 3 -> {System.out.println("Chat");}
            
            case 4 -> {System.out.println("Call resgister");
                        String callregisterMenu = """
1.  Missed calls
2.  Received calls
3.  Dailled numbers
4.  Erase recent call lists
5.  Show call duration
6.  Show call costs
7.  Call cost settings
""";
                          System.out.println(callregisterMenu);
                          int callregisterMenuChoice = inputCollector.nextInt();
                          
                          switch(callregisterMenuChoice){
                              case 1 -> {System.out.println("Missed calls");}
                              case 2 -> {System.out.println("Recevied calls");} 
                              case 3 -> {System.out.println("Dailled numbers");}
                              case 4 -> {System.out.println("Erase recent call lists");}
                              case 5 -> {System.out.println("Show call duration");
                                        String showcalldurationMenu = """
1.  Last call cost duration
2.  All calls cost duration
3.  Received calls duration
4.  Dailled calls duration
5.  Clear timers
""";
                          System.out.println(showcalldurationMenu);
                          int showcalldurationMenuChoice = inputCollector.nextInt();
                           
                          switch(showcalldurationMenuChoice){
                              case 1 -> {System.out.println("Last call duration");}
                              case 2 -> {System.out.println("All call duration");}
                              case 3 -> {System.out.println("Received calls duration");}
                              case 4 -> {System.out.println("Dailled calls duration");}
                              case 5 -> {System.out.println("Clear timers");}
                           }
                          }
                              case 6 -> {System.out.println("Show call costs");
                                        String showcallcostsMenu = """
1.  Last call cost 
2.  All call cost 
3.  Clear counters
""";
                          System.out.println(showcallcostsMenu);
                          int showcallcostsMenuChoice = inputCollector.nextInt();
                           
                          switch(showcallcostsMenuChoice){
                               case 1 -> {System.out.println("Last call cost");}
                               case 2 -> {System.out.println("All call cost");}
                               case 3 -> {System.out.println("Clear counters");}
                          }     
                           }
                        
                              case 7 -> {System.out.println("Call cost settings");
                                         String callcostsettings = """
1.  Call cost limit
2.  Show costs in 
""";        
                          System.out.println(callcostsettings);
                          int callcostsettingsMenuChoice = inputCollector.nextInt();
                          
                          switch(callcostsettingsMenuChoice){
                              case 1 -> {System.out.println("Call cost limit");}
                              case 2 -> {System.out.println("Show costs in");}
                         
                          }
                              }
                          }
                        
            }
            case 5 -> {System.out.println("Tones");
                       String tonesMenu = """
1.  Ringing tone
2.  Ringing volume
3.  Incoming call alert
4.  Message alert tones
5.  Keypad tones 
6.  Warning tones 
7.  Vibrating alert
8.  Screen saver
""";
                        System.out.println(tonesMenu);
                        int tonesMenuChoice = inputCollector.nextInt();
                        
                        switch(tonesMenuChoice){
                            case 1 ->  {System.out.println("Ringing tone");}
                            case 2 ->  {System.out.println("Ringing volume");}
                            case 3 ->  {System.out.println("Incomimg call alert");}
                            case 4 ->  {System.out.println("Message alert tones");}
                            case 5 ->  {System.out.println("Keypad tones");}
                            case 6 ->  {System.out.println("Warning tones");}
                            case 7 ->  {System.out.println("Screen saver");}
                       }
                        }                       
            case 6 -> {System.out.println("Settings");
                       String settingsMenu = """
1.  Call settings  
2.  Phone settings   
3.  Security settings
4.  Restore factory settings
""";
                        System.out.println(settingsMenu);
                        int settingsMenuChoice = inputCollector.nextInt();
                        
                        switch(settingsMenuChoice){
                            case 1 ->   {System.out.println("Call settings");
                                        String callsettingMenu = """
1.  Automatic redial 
2.  Speed dialling 
3.  Call waiting options
4.  Own number sending 
5.  Phone line in use 
6.  Automatic answer 
""";                    
                        System.out.println(callsettingMenu);
                        int callsettingMenuChoice = inputCollector.nextInt();
                        
                        switch(callsettingMenuChoice){
                            case 1 ->   {System.out.println("Automatic redial");}
                            case 2 ->   {System.out.println("Speed dialling");}
                            case 3 ->   {System.out.println("Call waiting options");}
                            case 4 ->   {System.out.println("Own number sending");}
                            case 5 ->   {System.out.println("Phone line in use");}
                            case 6 ->   {System.out.println("Automatic answer");}
                        }                
                             }      
                            case 2 ->   {System.out.println("Phone settings");
                                         String phonesettingMenu = """
1. Language 
2. Cell info display 
3. Welcome note 
4. Network selection 
5. Confirm SIM service actions
""";
                        System.out.println(phonesettingMenu);
                        int phonesettingMenuChoice = inputCollector.nextInt();
                        
                        switch(phonesettingMenuChoice){
                            case 1 ->   {System.out.println("Language");}
                            case 2 ->   {System.out.println("Cell info display");}
                            case 3 ->   {System.out.println("Welcome note");}
                            case 4 ->   {System.out.println("Network selection");}
                            case 5 ->   {System.out.println("Confirm SIM service actions");}
                        }
                            }             
                            case 3 ->   {System.out.println("Security settings");
                                         String securitysettingsMenu = """
1. PIN code request 
2. Call barring service 
3. Fixed dialling 
4. Closed user group 
5. Security level 
6. Change access codes
""";
                        System.out.println(securitysettingsMenu);
                        int securitysettingsMenuChoice = inputCollector.nextInt();
                        
                        switch(securitysettingsMenuChoice){
                            case 1 ->   {System.out.println("PIN code request");}
                            case 2 ->   {System.out.println("Call barring service");}
                            case 3 ->   {System.out.println("Fixed dialling");}
                            case 4 ->   {System.out.println("Closed user group");}
                            case 5 ->   {System.out.println("Security level");}
                            case 6 ->   {System.out.println("Change access codes");}
                        }
                            }
                            case 4 ->   {System.out.println("Restore factory settings");}

                            
                        }  }
                        
            case 7 -> {System.out.println("Call divert");}

            case 8 -> {System.out.println("Music");
                       String musicMenu = """
1. Music player 
2. Radio 
3. Recorder 
4. Track list
""";
                        System.out.println(musicMenu);
                        int musicMenuChoice = inputCollector.nextInt();
                        
                        switch(musicMenuChoice){
                            case 1 ->   {System.out.println("Music player");}
                            case 2 ->   {System.out.println("Radio");}
                            case 3 ->   {System.out.println("Recorder");}
                            case 4 ->   {System.out.println("Track list");}
                        }
            }
            case 9 -> {System.out.println("Games");}
            
            case 10 -> {System.out.println("Calculator");}
            
            case 11 -> {System.out.println("Reminders");}
            
            case 12 -> {System.out.println("Clock");
            
                        String clockMenu = """
1. Alarm clock 
2. Clock settings 
3. Date setting 
4. Stopwatch 
5. Countdown timer 
6. Auto update of date and time
""";
                        System.out.println(clockMenu);
                        int musicMenuChoice = inputCollector.nextInt();
                        
                        switch(musicMenuChoice){
                            case 1 ->   {System.out.println("Alarm clock");}
                            case 2 ->   {System.out.println("Clock settings");}
                            case 3 ->   {System.out.println("Date setting");}
                            case 4 ->   {System.out.println("Stopwatch");}
                            case 5 ->   {System.out.println("Countdown timer");}
                            case 6 ->   {System.out.println("Auto update of date and time");} 
                        }
                       } 
            case 13 -> {System.out.println("Profiles");}
            
            case 14 -> {System.out.println("Serives");}
            
            case 15 -> {System.out.println("Sim services");
            }
            default -> {System.out.println("Invalid input");}                

    
  }
 }
} 
