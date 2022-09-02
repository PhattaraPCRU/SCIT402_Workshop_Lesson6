
package ccyExchange;
import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 11:43:14 AM Aug 31, 2022
 * This file is part of "ccyExchange" Package.
 */
public class Exchange {
    public void getdata(){
        Scanner scn = new Scanner(System.in);
        double money;
        do{
            money = scn.nextDouble();
            System.out.printf("%d THB > %d KRW", money,exch(money,1));
            
        }while(money!=0);
    }
    public double exch(double money,double rate){
        return money*rate;
    }
    
    

}

