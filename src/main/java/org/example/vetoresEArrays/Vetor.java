package org.example.vetoresEArrays;

public class Vetor {
    private String[] elementos;
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

//     método adiciona:
//     iterar o vetor, passar por tds elementos e verificar se esse vetor tem posicao nula,
//     se for nula sigifnica que está disponível para poder usar e ai adicionamos nosso elemento
//     nesta posição do vetor
//     quer que o codigo pare de executar na 1a posi que encontrar null, por isso usamos break
//     para frear o loop do for, e aí add o elemento no vetor.
    public void adiciona(String elemento) {
        for(int i = 0; i < elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

}
