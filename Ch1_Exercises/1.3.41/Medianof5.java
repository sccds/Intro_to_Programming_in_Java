public class Medianof5 { 
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int com1, com2;
        if (a > b)  com1 = a;
        else        com1 = b;
        if (c > d)  com2 = c;
        else        com2 = d;

        int com3;
        if (com1 > com2)    com3 = com1;
        else                com3 = com2;
        
        int com4, com5;
        
    }
}