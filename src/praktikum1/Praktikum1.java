/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author MOKLET-01
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        int a = 3;
        //perulangan agar membentuk pola sesuai praktikum 1
        for (int b = 0; b <= a; b++)
        {
            for (int c = 0; c <= a; c++)
            {
                if(b == 0||c == 0||b == a||c == a) 
                {
                //output yang diinginkan
                System.out.print("@ ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
        System.out.println();
                }
    }
    
}
