package oop;
public class LivrodeBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Fundamentos de Programação";
        livro1.autor = "Antonio Carlos da Rocha";
        livro1.anoPublicacao = 2026;
        livro1.genero = "Educação";
        

    
        System.out.println("você pegou o livro: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
        System.out.println("Gênero: " + livro1.genero);
        System.out.println("você tem que devolver o livro em 30 dias");
        

    }

}
