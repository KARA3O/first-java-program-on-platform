/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxingfight;

import boxer.Boxer;

/**
 *
 * @author karab
 */
public class BoxingFight2 {
    
    private String boxer1;
    private String  boxer2;

    public BoxingFight2(String boxer1, String boxer2) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
    }

   
    public String getBoxer1() {
        return boxer1;
    }

    public String getBoxer2() {
        return boxer2;
    }
    
    public void possibleWinner(int r1,int R1,int r2,int R2 ){
        
        r1 =5;
        R1 = 6;
        r2 = 8;
        R2 = 9;
        
        int total1 = r1+r2;
        int total2 = r2+R2;
        
        if(total1>total2){
            System.out.println(boxer1+" has won");
            
        }else{
            System.out.println(boxer2+ " has won");
        }
    }

    
    
    
    
}
