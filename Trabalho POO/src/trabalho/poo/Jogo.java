package trabalho.poo;

import java.util.ArrayList;

public class Jogo {  
    
    public static void main(String[] args) {
        Jogo jogo = new Jogo();       
        
        //Cria o baralho principal
        ArrayList<Carta> baralhoTotal = new ArrayList<>();
        
        // chama o metodo que adiciona as cartas ao ArrayList
        baralhoTotal = jogo.criaBaralho(baralhoTotal);
        
        // chama o metodo que embaralha as cartas do baralho
        baralhoTotal = jogo.embaralhaCartas(baralhoTotal);
        
    }
    
    public ArrayList embaralhaCartas(ArrayList<Carta> embaralha) {
        
        return embaralha;
    }
    
    public void entregaCartas() {
        
    }
    
    public Carta removeCartaOponente(int indice, Carta carta) {
    
        return carta;
    }
 
    public Carta recebeCarta(Carta carta) {
        
        return carta;
    }
    
    
    public Carta comparaCartas(Carta carta1,int indice1, Carta carta2, int indice2) {
        

        return carta1;
    }
        
    public ArrayList criaBaralho(ArrayList<Carta> monte) {
                
        return monte;
    }  
    
}

