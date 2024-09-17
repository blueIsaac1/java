public class TipoDeDados {
    public static void main(String[] args) {
        byte b = 127;                // 8 bits, -128 a 127
        short s = 32767;             // 16 bits, -32,768 a 32,767
        int i = 2147483647;          // 32 bits, -2^31 a 2^31-1
        long l = 9223372036854775807L; // 64 bits, -2^63 a 2^63-1
        float f = 3.14f;             // 32 bits, ponto flutuante
        double d = 3.14159265359;    // 64 bits, ponto flutuante de precisão dupla
        boolean bool = true;         // 1 bit, true ou false
        char c = 'A';                // 16 bits, caractere Unicode

        // Mais exemplos, valores maximos dos tipos de dados
        // Valores máximos e mínimos para tipos inteiros
        byte bMax = Byte.MAX_VALUE;          // 127
        byte bMin = Byte.MIN_VALUE;          // -128

        short sMax = Short.MAX_VALUE;        // 32767
        short sMin = Short.MIN_VALUE;        // -32768

        int iMax = Integer.MAX_VALUE;        // 2147483647
        int iMin = Integer.MIN_VALUE;        // -2147483648

        long lMax = Long.MAX_VALUE;          // 9223372036854775807
        long lMin = Long.MIN_VALUE;          // -9223372036854775808

        // Valores máximos e mínimos para tipos de ponto flutuante
        float fMax = Float.MAX_VALUE;        // 3.4028235E38
        float fMin = Float.MIN_VALUE;        // 1.4E-45

        double dMax = Double.MAX_VALUE;      // 1.7976931348623157E308
        double dMin = Double.MIN_VALUE;      // 4.9E-324

        // Valores para boolean (não tem max/min)
        boolean boolTrue = true;
        boolean boolFalse = false;

        // Valores para char
        char cMax = Character.MAX_VALUE;     // '\uffff' (65535 em decimal)
        char cMin = Character.MIN_VALUE;     // '\u0000' (0 em decimal)

        double teste = 10.9;
        int teste2 = (int) teste; // Casting de double para int /expetced = 10
        
        byte abyte = (byte) 0b00100001; // 33
        short aShort = (short) 0b1010_0001_0100_0101; // -24251
        int aInt = (int) 0b1010_0001_0100_0101_1010_0001_0100_0101; // -1589272251
        int aInt2 = 0b101; // 5
        int aInt3 = 0B101; // 5

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        System.out.println(abyte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aInt2);
        System.out.println(aInt3);
    }
}
