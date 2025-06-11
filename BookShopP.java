
package bookshop;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import za.ac.tut.comicnovel.ComicNovel;

public class BookShop {

    
    // METHOD TO DISPLAY FULL LIST OF NOVELS TO ENABLE USER TO CHOOSE
    public static void globalDetails( ArrayList<ComicNovel> List) {
        
        System.out.println("the list of comic novels with its search coded:");
        System.out.println("=========");
        for (ComicNovel v : List) {
            
            System.out.println(v.getTitle()+"=>"+v.getCode());
            
            
        }
        
    }
    //METHOD DETERMINE IF GIVEN CODE BY USER MATCHES CODE AVAILABLE ON THE LIST PROVIDED(FIRST EDDITION OR NOT)
    //RETURNS BOOLEAN - IF TRUE IT IS FIRST EDDITION ,IF NOT ,THE OPPOSITE ( TO BE DONE IN THE MAIN METHOD)
    public static boolean isFirstEdition(ArrayList<ComicNovel> List, String code) {
        boolean value = false;
        for (int i = 0; i < List.size(); i++) {
            ComicNovel comic = List.get(i);
            if(comic.getCode().equals(code)){
                value = true;
            }
                    
                 }
        
               return value;
    }   
    
    //MAIN METHOD
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //OBJECT ALLOWS USER INPUT
        
        //GIVEN ARRAY STRING
        String[] bookInfo = {
            "The Stupidest Angel#2#CM002",
            "Vile Bodies#8#EW008",
            "Cold Comfort Farm#1#SG001",
            "Lightning Rods#2#HDW002",
            "A Complicated Kindness#1#MT001",
            "Auntie Mame#9#PD009",
            "Catch-22#5#JH005",
            "The Color of Magic#1#TP001",
            "Lucky Jim#3#KA003"};
        
         ArrayList<ComicNovel> List = new ArrayList<ComicNovel> (); //OBJECT TO INSERT DIFFERENT VARIABLES IN THE ARRAYLIST
         
         
         //FOR LOOP USED TO POPULATE VARIABLES INTO THE ARRAYLIST
         for(int i = 0; i<bookInfo.length;i++){
             
             //SEPARATION OF VARIABLES FROM ARRAY INTO ARRAYLIST
             String[] separateInfo = bookInfo[i].split("#");
             String title = separateInfo[0];
             int volume = Integer.parseInt(separateInfo[1]) ;
             String code = separateInfo[2];
             
             ComicNovel new1 = new ComicNovel(title,volume,code);
             List.add(new1);

         }
         //globalDetails(List); INVOKE THE MWTHOD TO DISPLAY THE LIST 
         
         //USERINPUT
         System.out.print("Enter the code of a comic novel: ");
         String code = input.next();
         
         //INVOKE METHOD TO TEST IF BOOK IF FIRTS EDDITION
         boolean value = isFirstEdition(List,code);
         
         if(value == true){
             
             System.out.println(" the commic novel with global code "+code+ " is a first edition and is acollectors item");
                   }else{
             System.out.println("the commic novel with global code " + code + " is NOt a first edition and is acollectors item");
         }

    }
}
