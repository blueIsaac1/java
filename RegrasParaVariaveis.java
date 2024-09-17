public class RegrasParaVariaveis {
    public static void main(String[] args) {
        // Exemplos de declarações de variáveis inválidas

        // 1. Começando com número
        // int 1numero = 10;  // Inválido: nomes de variáveis não podem começar com números

        // 2. Usando caracteres especiais (exceto $ e _)
        // int valor@total = 100;  // Inválido: @ não é permitido em nomes de variáveis

        // 3. Usando palavras reservadas do Java
        // int class = 5;  // Inválido: 'class' é uma palavra reservada

        // 4. Espaços no nome
        // String nome completo = "João Silva";  // Inválido: espaços não são permitidos

        // 5. Usando hífen
        // int idade-anos = 25;  // Inválido: hífen não é permitido

        // 6. Variável não inicializada sendo usada
        // int x;
        // System.out.println(x);  // Erro: variável x pode não ter sido inicializada

        // 7. Tipo incompatível
        // int numeroGrande = 3.14;  // Inválido: não pode atribuir double a int

        // 8. Nome de variável muito longo (não é um erro, mas é uma má prática)
        // int estaVariavelTemUmNomeMuitoLongoEDificilDeLer = 10;

        // 9. Case sensitivity (não é um erro, mas pode causar confusão)
        int Valor = 5;
        int valor = 10;
        // System.out.println(VALOR);  // Erro: VALOR não foi declarado
    }
}