
package ccyExchange;
import java.util.Random;

/**
 *
 * @author koonp@641102064111
 * Create on 3:36:29 PM Sep 1, 2022
 * This file is part of "ccyExchange" Package.
 */
public class Banknode extends nodes {
    public void toNodes(nodes n,double amount){
        n.prev = amount;
        n.FFTS = (int)amount/50000;
        n.TTS = (int)(amount%50000)/10000;
        n.FTS = (int)((amount%50000)%10000)/5000;
        n.OTS = (int)(((amount%50000)%10000)%5000)/1000;
        n.ONE = (int)(((amount%50000)%10000)%5000)%1000;
    }
    public void showNodes(nodes n){
        System.out.printf(
                "[%,.2f Won to Banknodes]\nFifty thousand = %d\nTen thousand = %d\nFive thousand = %d\nOne thousand = %d\n[Coins]\nOne coin = %d\n\n", 
                n.prev,n.FFTS,n.TTS,n.FTS,n.OTS,n.ONE);
    }

}

class nodes{
    int FFTS,TTS,FTS,OTS,ONE;
    double prev;
    public void clear(){
        FFTS=TTS=FTS=OTS=ONE=0;
        prev=0;
    }
}
class coins{
    int FHD,OHD,FF,T,F;
}

class test extends Banknode{
    public static void main(String[] args){
        test t = new test();
        nodes n = new nodes();
        Random ran = new Random();
        //Uncomment this if you're on jdk 17 or abrove.
        //t.toNodes(n,ran.nextDouble(10000,99999999));
        System.out.printf("%d %d %d %d %d\n", n.FFTS,n.TTS,n.FTS,n.OTS,n.ONE);
        t.showNodes(n);
        
    }
}


