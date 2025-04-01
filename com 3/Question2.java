/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2;

import javax.swing.JOptionPane;

/**
 *
 * @author karab
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asset assetDe= new Asset("ABC123","000111222","HP Laptop");
       
        JOptionPane.showConfirmDialog(null, assetDe.assetDetails(),"Asset details", JOptionPane.INFORMATION_MESSAGE);
       
        
    }
    
}
