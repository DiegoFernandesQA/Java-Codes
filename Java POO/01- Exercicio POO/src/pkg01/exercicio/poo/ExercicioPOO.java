package pkg01.exercicio.poo;

import java.util.Scanner;

/**
 *
 * @author Diego Fernandes
 */
public class ExercicioPOO {

    public static void main(String[] args) {
        System.out.println("++++CANETA C1+++++");
        Caneta c1 = new Caneta();
            c1.cor = "Azul";
            c1.carga = 30;
            c1.modelo = "Compactor";
            c1.ponta = 0.7f;
            c1.tampar();            
            //c1.status();
            c1.rabiscar();
            
            System.out.println("++++CANETA C2+++++");
            Caneta c2 = new Caneta();
            c2.cor = "Cyano";
            c2.modelo = "Golden";
            c2.ponta = 0.3f;
            c2.destampar();
            c2.rabiscar();


            //c2.status();
            
            Scanner al = new Scanner(System.in);
            Scanner am = new Scanner(System.in);
            Scanner an = new Scanner(System.in);
            Livro ler = new Livro();
            
            System.out.println("Digite o ano de publicação do livro: ");
            ler.ano = al.nextInt();
            System.out.println("Qual é o assunto do livro? ");
            ler.assunto = al.next();
            System.out.println("Qual o nome do autor? ");
            ler.autor = al.next();
            System.out.println("Qual é a edição do livro? ");
            ler.edicao = am.next();
            System.out.println("Qual é a editora do livro? ");
            ler.editora = am.next();
            System.out.println("Qual a quantidade de paginas do livro? ");
            ler.paginas = an.nextInt();
            ler.livroaberto();
            ler.leitura();
            
    }
    
}
