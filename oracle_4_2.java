// O package declara o namespace da classe, organizando-a logicamente
// e evitando conflitos de nomes. Deve corresponder à estrutura de diretórios.
public class oracle_4_2 {
    public static void main(String[] args) {
        String str = "Hello World"; 
        System.out.println(str.charAt(0)); // Retorna o caractere da string de acordo com o indice
        System.out.println(str.length()); // Retorna o comprimento da string
        System.out.println(str.substring(0, 5)); // Retorna a substring da string de acordo com o indice
        System.out.println(str.substring(6, 11)); // Retorna a substring da string de acordo com o indice

        // Concatenação de strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // Concatenação de strings com o operador +=
        String str4 = "Hello";
        str4 += " World";
        System.out.println(str4);

        // Concatenação de strings com o método concat
        String str5 = "Hello";
        str5 = str5.concat(" World");
        System.out.println(str5);


        
    }
}       