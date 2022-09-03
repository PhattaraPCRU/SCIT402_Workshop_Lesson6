
package ccyExchange;

import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 6:25:09 PM Sep 3, 2022
 * This file is part of "ccyExchange" Package.
 */
public class ccyExchangeAio {
    public static void main(String[] args){
        int FFTS,TTS,FTS,OTS,ONE;
        double krw_rate = 37.180345;
        double krw;
        Scanner scn = new Scanner(System.in);
        double money;
        do{
            System.out.print("How many THB (Press 0 to Exit) : ");
            money = scn.nextDouble();
            if(money==0){break;}
            krw = money*krw_rate;
            System.out.printf("%,.2f THB > %,.2f KRW\n", money,krw);
            FFTS = (int)krw/50000;
            TTS = (int)(krw%50000)/10000;
            FTS = (int)((krw%50000)%10000)/5000;
            OTS = (int)(((krw%50000)%10000)%5000)/1000;
            ONE = (int)(((krw%50000)%10000)%5000)%1000;
            System.out.printf(
                "[%,.2f Won to Banknodes]\nFifty thousand = %d\nTen thousand = %d\nFive thousand = %d\nOne thousand = %d\n[Coins]\nOne coin = %d\n\n", 
                krw,FFTS,TTS,FTS,OTS,ONE);
            
        }while(money!=0);
        if(money==0){
            System.out.print("Exit");
        }
    }

}
