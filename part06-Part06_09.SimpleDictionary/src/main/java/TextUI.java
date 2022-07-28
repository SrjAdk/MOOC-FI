/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class TextUI {
    private Scanner s;
    private SimpleDictionary simpleDictionary;
    public TextUI(Scanner scanner, SimpleDictionary SimpleDictionary){
        this.s = scanner;
        this.simpleDictionary = SimpleDictionary;
        
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String in = this.s.nextLine();
            if(in.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(in.equals("add")){
                System.out.println("Word: ");
                String word = this.s.nextLine();
                System.out.println("Translation");
                String translation = this.s.nextLine();
                this.simpleDictionary.add(word,translation);
            }else if (in.equals("search")){
                System.out.println("To be translated: ");
                String toTranslate = this.s.nextLine();
                if(this.simpleDictionary.translate(toTranslate) == null){
                    System.out.println("Word "+ toTranslate+ " was not found");
                }else{
                System.out.println("Translation: " + this.simpleDictionary.translate(toTranslate));
                }
            }else{
            System.out.println("Unknown command");
            }
        }
    }
}
