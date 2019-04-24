package trabalho.poo;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {  
    
    public static void main(String[] args) {
        Jogo jogo = new Jogo();       
        Jogador jogador = new Jogador();
        Mensagens mensagens = new Mensagens();
        
        //Cria o baralho principal
        ArrayList<Carta> baralhoTotal = new ArrayList<>();
        
        // chama o metodo que adiciona as cartas ao ArrayList
        baralhoTotal = jogo.criaBaralho(baralhoTotal);
        
        while (jogo.fimDoJogo(baralhoTotal.size()) == false) {
            int indice = jogo.cartaAleatoria(baralhoTotal);
            System.out.println(indice);
        }
                
    }
    
    public int cartaAleatoria(ArrayList<Carta> cartasEmbaralhadas) {
        Random ran = new Random();
        int indiceSorteado = ran.nextInt(cartasEmbaralhadas.size());
        return indiceSorteado;
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
        
        //Ordem dos params: grupo, nome, altura, comprimento, peso, viveuHa, superTrunfo
        monte.add(new Carta("1A", "Herrerassauro", 1.5, 4.5, 300, 231, false));
        monte.add(new Carta("1B", "Procompsognato", 0.3, 1.2, 1, 222, false));
        monte.add(new Carta("1C", "Patagossauro", 8, 18, 16000, 169, false));
        monte.add(new Carta("1D", "Ceratossauro", 2, 6, 1000, 156, false));
	monte.add(new Carta("2A", "Pterodáctilo", 0.5, 1, 1, 150, false));
	monte.add(new Carta("2B", "Velociraptor", 1, 1.8, 15, 80, false));
	monte.add(new Carta("2C", "Triceratopo", 6, 9, 6000, 60, false));
	monte.add(new Carta("2D", "Baptornis", 0.8, 1, 7, 83, false));
	monte.add(new Carta("3A", "Plateossauro", 2, 9, 4000, 221, false));
	monte.add(new Carta("3B", "Peteinossauro", 0.3, 0.6, 0.1, 210, false));
	monte.add(new Carta("3C", "Estegossauro", 4, 9, 2000, 156, false));
	monte.add(new Carta("3D", "Alossauro", 5.2, 14, 3600, 156, false));
	monte.add(new Carta("4A", "Ultrassauro", 22, 38, 90000, 154, false));
	monte.add(new Carta("4B", "Tiranosauro Rex", 5.6, 14, 7000, 68, true));
	monte.add(new Carta("4C", "Carnotauro", 3, 7.5, 1000, 113, false));
	monte.add(new Carta("4D", "Iberomesornis", 0.2, 0.1, 0.03, 125, false));
	monte.add(new Carta("5A", "Coelophisis", 1.8, 3, 30, 227, false));
	monte.add(new Carta("5B", "Melanorossauro", 12, 15, 8000, 228, false));
	monte.add(new Carta("5C", "Brachiossauro", 15, 28, 50000, 156, false));
	monte.add(new Carta("5D", "Dilofosauro", 2.5, 7, 450, 206, false));
	monte.add(new Carta("6A", "Othnielia", 1.1, 1.5, 40, 146, false));
	monte.add(new Carta("6B", "Carcharodontossauro", 5.8, 14, 8000, 113, false));
	monte.add(new Carta("6C", "Barionix", 8, 12, 2000, 125, false));
	monte.add(new Carta("6D", "Hylaeossauro", 1.8, 5, 1500, 130, false));
	monte.add(new Carta("7A", "Eoraptor", 0.8, 1, 10, 231, false));
	monte.add(new Carta("7B", "Nothossauro", 8, 9, 400, 220, false));
	monte.add(new Carta("7C", "Diplodoco", 5, 27, 20000, 156, false));
	monte.add(new Carta("7D", "Compsognato", 0.7, 1, 2, 156, false));
	monte.add(new Carta("8A", "Oftalmossauro", 1.3, 5, 3000, 165, false));
	monte.add(new Carta("8B", "Psitacossauro", 0.7, 2, 25, 125, false));
	monte.add(new Carta("8C", "Oviraptor", 1.3, 2.5, 35, 80, false));
	monte.add(new Carta("8D", "Globidens", 1.1, 6, 400, 150, false));
                        
        return monte;
    }  
    
    public boolean fimDoJogo (int tamanho) {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}

