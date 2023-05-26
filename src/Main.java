public class Main {
    public static void main(String[] args) {

        // aula introdutória de orientação à objetos
        // criar objetos
        // pessoa = classe; adao = objeto; new pessoa = construtor
        Pessoa adao = new Pessoa();

        // declaração do objeto
        Pessoa qualquer;

        // instânciaação do objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();

        // definir forma do objeto
        qualquer.nome = "rita";
        qualquer.sobrenome = "lee";

        // definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");

        // criar mais objetos
        Pessoa rainha;

        // instanciar objetos
        rainha = new Pessoa();

        // definir formato do objeto
        rainha.nome = "tina";
        rainha.sobrenome = "tunner";

        // definir comportamento
        rainha.falar();
        rainha.falar("alto");
        System.out.println(rainha.falar("alto","grave"));

    }
}