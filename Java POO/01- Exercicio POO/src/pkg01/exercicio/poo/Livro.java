
package pkg01.exercicio.poo;

/**
 *
 * @author Diego Fernandes
 */
public class Livro {
    int ano;
    String edicao;
    String titulo;
    int paginas;
    String autor;
    String assunto;
    String editora;
    boolean leitura;
    
    void livroaberto() {
        this.leitura = true;
        
    }
    void livrofechado() {
        this.leitura = false;
    }
    
    void leitura() {
        if (leitura == true) {
            System.out.println("Você pode ler pois o livro está aberto!");
            statusLivro();
            
        }else { System.out.println("ERRO! O livro está fechado então você não pode inicair a leitura");
        }
    } 
    
    void statusLivro() {
        System.out.println("O ano de lançamento do livro é " + ano);
        System.out.println("O livro já está em sua " + edicao);
        System.out.println("O titulo é " + titulo);
        System.out.println("O número de páginas é de " + paginas);
        System.out.println("O autor é " + autor);
        System.out.println("O assunto do livro é " + assunto);
        System.out.println("A editora responsável pela publicação do livro é " + editora);

    }
}
