/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumpractise;

import java.util.Arrays;

/**
 *
 * @author GameS
 */
public class EnumPractise {
enum Weekends{
SATURDAY(6),SUNDAY(7);
int number;

        private Weekends(int num) {
            System.out.println("In here " + num);
        this.number = num;
        }
        public int getNumber(){
        return this.number;
        }

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Weekends w1 = Weekends.valueOf("SATURDAY");
        System.out.println(w1.getNumber());
        
        outer: 
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                if (j == 1)
                    continue outer;
                System.out.println(" value of j = " + j);
            }
        } // end of outer loop
     // end of main()
        
    }
    
}
