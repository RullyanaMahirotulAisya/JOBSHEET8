/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

/**
 *
 * @author WINDOWS 10
 */
public class PerulanganBersarang {
    public static void main(String[] args) {
        
        //membuat variabel
        int x, y;
        
        //membuat perulangan sebanyak x dan y kali
        for (x = 0; x <= 5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
    
}
