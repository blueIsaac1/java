public class LiteralBinario {
    public static void main(String[] args) {
        int decimalLiteral = 42;        // Literal decimal (base 10)
        int hexLiteral = 0x2A;          // Literal hexadecimal (base 16)
        int octalLiteral = 052;         // Literal octal (base 8)
        long longLiteral = 42L;         // Literal long
        float floatLiteral = 3.14f;     // Literal float
        double doubleLiteral = 3.14;    // Literal double
        char charLiteral = 'A';         // Literal char
        String stringLiteral = "Hello"; // Literal string
        boolean boolLiteral = true;     // Literal boolean

        // Exemplos de literais binários
        int binaryLiteral = 0b101010;   // 42 em decimal
        byte binaryByte = 0b0010_1010;  // Uso de underscore para legibilidade
        // short binaryShort = 0B1010_1010_1010_1010; // -21846 em decimal

        // Comparação
        System.out.println(binaryLiteral == 42);  // true
        System.out.println(binaryByte == 42);     // true
        // System.out.println(binaryShort == -21846);// true

    }    
}
