public class try_catch_finally {
  
    public static void main(String[] args) {

      
      try {
            int numero = 10 / 0; // causa "ArithmeticException" (divisão por zero)
            System.out.println("Resultado: " + numero);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            System.out.println("Bloco finally sempre é executado.");
        }

      
    }
  
}

// CATCH() RECEBE PARÂMETROS. O "E" PASSADO COMO ARGUMENTO É UM OBJETO DO TIPO "ARITHMETICEXCEPTON".
// ESTE OBJETO TEM COMO UM DOS MÉTODOS "e.getMessage()" QUE RETORNA UMA MENSAGEM DESCRITIVA DO ERRO EM QUESTÃO.
