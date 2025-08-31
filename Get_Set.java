public class Usuario {
    private String nome; // ATRIBUTO PRIVADO: IMPEDE ACESSO OU MODIFICAÇÃO INDEVIDA.

  // MÉTODO GET
    public String getNome() {
        return nome;
    }

  // MÉTODO SET RECEBE UM NOME COMO PARÂMETRO.
    public void setNome(String nome) { 
        if (nome != null && !nome.isEmpty()) { 
            this.nome = nome;
        }
    }
}

// EM RESUMO, O ATRIBUTO NOME SÓ PODE SER ACESSADO OU MODIFICADO SE HOUVER ACESSO AOS MÉTODOS GET E SET.
// EXEMPLO: BOTÕES QUE ESTÃO ASSOCIADOS AOS MÉTODOS GET E SET. NÃO HÁ COMO MANIPULAR DE OUTRA FORMA.
// DENTRO DESSES MÉTODOS É POSSÍVEL ADICIONAR DIVERSAS VALIDAÇÕES E OUTRAS LÓGICAS.
