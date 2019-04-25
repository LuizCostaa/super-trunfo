package trabalho.poo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {  
    
    Mensagens mensagens = new Mensagens();
    
    ArrayList<Carta> baralhoTotal = new ArrayList<>();
    ArrayList<Carta> maquina = new ArrayList<>();
    ArrayList<Carta> jogador = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Jogo jogo = new Jogo();    
        jogo.iniciaJogo();
        int rodada = 0;
        
        do {
            rodada++;
            jogo.rodada(rodada);
        } while ( jogo.fimDoJogo() != true );
        
    }
    
    public void iniciaJogo(){
        this.baralhoTotal = criaBaralho(baralhoTotal);
        this.mensagens.escreveCaracteristicas();
        this.mensagens.printaInstrucoes();
    }
    
    public void rodada(int rodada) {
        
        int rod = rodada % 2;
        int prop;
        int indice1 = this.cartaAleatoria(this.baralhoTotal);
        Carta objJogador = new Carta(
            this.baralhoTotal.get(indice1).grupo,
            this.baralhoTotal.get(indice1).nome,
            this.baralhoTotal.get(indice1).altura,
            this.baralhoTotal.get(indice1).comprimento,
            this.baralhoTotal.get(indice1).peso,
            this.baralhoTotal.get(indice1).viveuHa,
            this.baralhoTotal.get(indice1).superTrunfo
        );
        this.baralhoTotal.remove(indice1);
        
        int indice2 = this.cartaAleatoria(this.baralhoTotal);
        Carta objMaquina = new Carta(
            this.baralhoTotal.get(indice1).grupo,
            this.baralhoTotal.get(indice1).nome,
            this.baralhoTotal.get(indice1).altura,
            this.baralhoTotal.get(indice1).comprimento,
            this.baralhoTotal.get(indice1).peso,
            this.baralhoTotal.get(indice1).viveuHa,
            this.baralhoTotal.get(indice1).superTrunfo
        );
        this.baralhoTotal.remove(indice2);
        
        if (rod == 0) {
           prop = this.escolhePropriedade(0);
        } else {
            prop = this.escolhePropriedade(1);
        }
        
        this.comparaCartas(prop, objJogador, objMaquina);
        
    }
    
    public void comparaCartas(int prop, Carta obj1, Carta obj2) {
                        
        if (prop == 1) {
            if (obj1.altura > obj2.altura){
                
            }
        } else if (prop == 2) {
            
        } else if (prop == 3) {

        } else if (prop == 4 ) {
            
        } else {
            System.out.println("Propriedade indefinida");
        }
    }
    
    public void cartasToJogador(Carta obj1, Carta obj2, int quem) { // 1: Jogador, 2: Maquina
        
        if (quem == 1) {
            this.jogador.add(new Carta(
                    obj1.grupo, obj1.nome,
                    obj1.altura, obj1.comprimento,
                    obj1.peso, obj1.viveuHa,
                    obj1.superTrunfo
                )   
            );
            this.jogador.add(new Carta(
                    obj2.grupo, obj2.nome,
                    obj2.altura, obj2.comprimento,
                    obj2.peso, obj2.viveuHa,
                    obj2.superTrunfo
                )
            );
        } else if (quem == 2){
            this.maquina.add(new Carta(
                    obj1.grupo, obj1.nome,
                    obj1.altura, obj1.comprimento,
                    obj1.peso, obj1.viveuHa,
                    obj1.superTrunfo
                )   
            );
            this.maquina.add(new Carta(
                    obj2.grupo, obj2.nome,
                    obj2.altura, obj2.comprimento,
                    obj2.peso,  obj2.viveuHa,
                    obj2.superTrunfo
                )
            );
        }
        
    }
    
    public int escolhePropriedade(int vez) {
        Random ran = new Random();
        Scanner ler = new Scanner(System.in);
        int prop = 0;
        
        if (vez == 0){
            prop = ran.nextInt(4);
        } else if (vez != 0){
            System.out.println("Digite o nome da propriedade para comparação conforme a tabela:");
            System.out.println("[1]: Altura \n[2]: Comprimento \n[3]: Peso \n[4]: Viveu há \n");
            prop = ler.nextInt();
        }
        
        return prop;
    }
    
    public int cartaAleatoria(ArrayList<Carta> cartasEmbaralhadas) {
        Random ran = new Random();
        int indiceSorteado = ran.nextInt(cartasEmbaralhadas.size());
        return indiceSorteado;
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
    
    public boolean fimDoJogo () {
        if (this.jogador.size() == 0) {
            System.out.println("A máquina venceu o jogo");
            return true;
        } else if (this.maquina.size() == 0) {
            System.out.println("O jogador venceu o jogo");
            return true;
        } else {
            return false;
        }
    }
    
}

