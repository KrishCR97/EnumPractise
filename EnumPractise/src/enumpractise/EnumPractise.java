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
SATURDAY,SUNDAY;
String weekends;
private Weekends(String weekend){
this.weekends = weekend;
}
public String getWeekendDay(){
return this.weekends;
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Weekends w1 = Weekends.valueOf("SATURDAY");
        System.out.println(Arrays.toString(Weekends.values()));
        
    }
    
}
