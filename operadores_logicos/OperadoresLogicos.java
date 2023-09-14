package operadores_logicos;

public class OperadoresLogicos {

    public static byte and(byte a, byte b) {
        if (a == 1 && b == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static byte or(byte a, byte b) {
        if (a == 0 && b == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static byte inversor(byte a) {
        if (a == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static byte nand_1(byte a, byte b) {
        if (a == 1 && b == 1) {
            return 0;
        } else {
            return 1;
        }

    }

    public static byte nand_2(byte a, byte b) {
        return inversor(and(a, b));
    }

    public static byte nor(byte a, byte b) {
        return inversor(or(a, b));
    }

    public static byte xor(byte a, byte b) {
        if (a != b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static byte norx(byte a, byte b) {
        return inversor(xor(a, b));
    }

    public static byte circuitA(byte a, byte b) {
        return or(and(a, b), b);

    }

    public static byte circuitoB(byte a, byte b) {
        return nor(or(a,b), and(a,b));
    }
    
    public static byte circuioC(byte a, byte b) {
       return nand_2(or(and(a,b),b), inversor(b));        
    }
    
    public static byte circuitoD(byte a, byte b) {
        return and(and(nor(a,b),inversor(b)),a);
    }

}
