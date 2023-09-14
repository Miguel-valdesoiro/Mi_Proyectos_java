package cadena;

public class Principal6 {

    public static void main(String[] args) {
       int n = 255;
       String sb = Integer.toBinaryString(n);
       String sh = Integer.toHexString(n);
       System.out.println("Decimal    : " + n);
       System.out.println("Binario    : " + sb);               // 1111 1111
       System.out.println("Hexadecimal: " + sh.toUpperCase()); // F    F
    }

}
