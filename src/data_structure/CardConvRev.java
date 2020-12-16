package data_structure;

public class CardConvRev {

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        }while(x!=0);
        return digits;
    }

}
