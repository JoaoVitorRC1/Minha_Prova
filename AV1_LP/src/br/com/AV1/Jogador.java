package br.com.AV1;

import java.util.ArrayList;
import java.util.Scanner;

class Jogador {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }
}




























/* Primeiro, faça;
   Implemente uma solução em Java para contabilizar os votos que resultarão na
    eliminação de um participante da casa mais vigiada do Brasil. De início, crie um
        ArrayList<Jogador> para cadastrar cada um dos participantes no game, são eles:

        Alane Dias
        Beatriz Reis
        Davi Brito
        Deniziane Ferreira
        Fernanda Bande
        Giovanna Lima
        Giovanna Pitel
        Isabelle Nogueira
        Juninho
        Leidy Elin
        Lucas Henrique
        Lucas Luigi
        Lucas Pizane
        Marcus Vinicius
        Matteus Amaral
        Maycon Cosmer
        MC Bin Laden
        Michel Nogueira
        Nizam
        Raquele Cardozo
        Rodriguinho
        Thalyta Alves
        Vanessa Lopes
        Vinicius Rodrigues
        Wanessa Camargo
        Yasmin Brunet

        Os votos serão computados por meio da classe Scanner. Exemplo:
        - Em quem você vota para sair da casa?
        - Rodriguinho
        Neste momento, deverá ser computado 1 voto para o Rodriguinho. Os votos serão
        contabilizados até que o usuário digite “sair"

      Depois, faça:

 Ao final do programa, a seguinte mensagem de eliminação deverá ser exibida:
 “Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir
domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu
conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu
vou conseguir te eliminar com alegria. Com **X** votos, é você quem sai
**FULANO**”.
A classe Jogador deverá representar a pessoa que será votada. Ela terá apenas uma
variável String nome e uma variável int votos.
Para contabilizar os votos da pessoa, use:
public void incrementaUmVoto() {
this.votos = getVotos() + 1;
}
Depois, faça:
Percorra a lista até encontrar a pessoa que deverá receber o voto.
Após contabilizar todos os votos, você precisará percorrer a lista novamente para
encontrar qual foi o jogador mais votado que deixará a casa.
Dica: O algoritmo está dividido em 3 partes, cadastro de jogadores, votos e apuração
final dos votos (discurso de eliminação)
 */








