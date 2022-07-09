import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scan.nextLine();
            if(title.isEmpty()){
                break;
            }//end of if
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int pbyear = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title,pages,pbyear));
        }// end of while
        
        System.out.println("What information to be printed?");
        String info = scan.nextLine();
        
        for(Book temp : books){
            if(info.equals("everything")){
                System.out.println(temp.toString());
            }else if(info.equals("name")){
                System.out.println(temp.getName());
            }//end of else if
        }//end of for
        
    }//end of main
}