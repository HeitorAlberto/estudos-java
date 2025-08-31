// O NOME DO ARQUIVO DEVE SER IGUAL AO NOME DA CLASSE PRINCIPAL (Usuario.java)
public class Usuario {
    private String nome; // ATRIBUTO PRIVADO: IMPEDE ACESSO OU MODIFICAÇÃO INDEVIDA.

    // MÉTODO GET
    public String getNome() {
        return nome;
    }

    // MÉTODO SET COM VALIDAÇÕES ADICIONAIS
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            if (nome.length() <= 50) { // LIMITA O TAMANHO DO NOME
                if (nome.matches("[A-Za-zÀ-ÿ ]+")) { // PERMITE APENAS LETRAS E ESPAÇOS
                    this.nome = nome;
                } else {
                    System.out.println("Erro: Nome contém caracteres inválidos.");
                }
            } else {
                System.out.println("Erro: Nome muito longo. Máximo de 50 caracteres.");
            }
        } else {
            System.out.println("Erro: Nome não pode ser nulo ou vazio.");
        }
    }
}

// EM RESUMO, O ATRIBUTO NOME SÓ PODE SER ACESSADO OU MODIFICADO SE HOUVER ACESSO AOS MÉTODOS GET E SET.
// EXEMPLO: BOTÕES QUE ESTÃO ASSOCIADOS AOS MÉTODOS GET E SET. NÃO HÁ COMO MANIPULAR DE OUTRA FORMA.
// DENTRO DESSES MÉTODOS É POSSÍVEL ADICIONAR DIVERSAS VALIDAÇÕES E OUTRAS LÓGICAS. SEGURANÇA É A PALAVRA-CHAVE.
// NESSE EXEMPLO, A CLASSE USUÁRIO ESTÁ EM UM ARQUIVO A PARTE DO ARQUIVO MAIN, QUE CONTÉM A CLASSE E O MÉTODO PRINCIPAL "MAIN".
