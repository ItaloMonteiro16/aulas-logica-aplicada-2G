public class Pessoa {

    // atributos da classe
    String nome;
    String sobrenome;

    // métodos da classe
    public void falar() {
        System.out.println("falei");
    }
    // sobrecarga do metodo
    public void falar(String volume) {
        System.out.println("falei " + volume);
    }
    public String falar(String volume, String tom) {
        return "falei " + volume;
    }
}