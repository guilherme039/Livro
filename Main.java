
public class Main
  public static void main(String[] args) {
   Livro livro =new Livro();

    livro.nome = "Boson linux";
    livro.descricao = "Livro sobre Linux da Boson!";
    livro.isbn = "97867186617";
    livro.preco = 45.95;
    livro.autor = "Fabio dos Reis";
    livro.dataPub = "20/04/2017";

  System.out.printf("A data de publicacao do livro %s e %s",livro.nome,); 
    
  }
}