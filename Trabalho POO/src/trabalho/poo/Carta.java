
package trabalho.poo;

public class Carta {
    String grupo;
    String nome;
    double altura;
    double comprimento;
    double peso;
    int viveuHa;
    boolean superTrunfo;
    
    Carta(
        String grupo,
        String nome,
        double altura,
        double comprimento,
        double peso,
        int viveuHa,
        boolean superTrunfo
    ){
        this.grupo = grupo;
        this.nome = nome;
        this.altura = altura;
        this.comprimento = comprimento;
        this.peso = peso;
        this.viveuHa = viveuHa;
        this.superTrunfo = superTrunfo;
    };
}
