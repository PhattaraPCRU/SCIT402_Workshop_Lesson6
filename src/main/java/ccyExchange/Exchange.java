
package ccyExchange;
import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 11:43:14 AM Aug 31, 2022
 * This file is part of "ccyExchange" Package.
 */
public class Exchange {
    double krw_rate = 37.180345;
    double krw;
    nodes n = new nodes();
    Banknode b = new Banknode();
    public void getdata(){
        Scanner scn = new Scanner(System.in);
        double money;
        do{
            System.out.print("How many THB (Press 0 to Exit) : ");
            money = scn.nextDouble();
            if(money==0){break;}
            krw = exch(money,krw_rate);
            System.out.printf("%,.2f THB > %,.2f KRW\n", money,krw);
            b.toNodes(n, krw);
            b.showNodes(n);
            
        }while(money!=0);
        if(money==0){
            System.out.print("Exit");
        }
    }
    public double exch(double money,double rate){
        return money*rate;
    }
}

