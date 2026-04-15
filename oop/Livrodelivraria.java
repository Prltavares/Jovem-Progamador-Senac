package oop;
public class Livrodelivraria {
public static void main(String[] args) {
    Livro livro1 = new Livro();
    livro1.titulo = "O Senhor dos Anéis";
    livro1.autor = "J.R.R. Tolkien";
    livro1.anoPublicacao = 1954;
    livro1.genero = "Fantasia";
    livro1.preco = 39.99;

    System.out.println("você pegou o livro: " + livro1.titulo);
    System.out.println("Autor: " + livro1.autor);
    System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
    System.out.println("Gênero: " + livro1.genero);
    System.out.println("Preço: R$" + livro1.preco);
    
    }
}



