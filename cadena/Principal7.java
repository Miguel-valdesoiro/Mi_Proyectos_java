package cadena;

public class Principal7 {

    public static void main(String[] args) {
        int n = 10;
        int c=0,r;
        String s = "";
        
        while(n >= 2) {
            c = n / 2;
            r = n % 2;
            n = c;
            s = r + s;
            //System.out.print(r);
        }
        //System.out.print(c);
        s = c + s;
        System.out.println("Binario: " + Integer.parseInt(s));
        
    }

}

/*
8 4 2 1
1 0 1 0

s = ""
n = 10 
c = 5
r = 0
s = 0

n = 5
c = 2
r = 1
s = 1 + "0" = 10

n = 2
c = 1
r = 0
s = 0 + "10" = 010

n = 1
s = 1 + "010" = 1010




*/

