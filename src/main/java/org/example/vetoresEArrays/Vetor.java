package org.example.vetoresEArrays;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0; //iniciado com 0 para ir incrementando
    }

//     método adiciona:
//     iterar o vetor, passar por tds elementos e verificar se esse vetor tem posicao nula,
//     se for nula sigifnica que está disponível para poder usar e ai adicionamos nosso elemento
//     nesta posição do vetor
//     quer que o codigo pare de executar na 1a posi que encontrar null, por isso usamos break
//     para frear o loop do for, e aí add o elemento no vetor
//     este método não é performático, uma vez que é necessário percorrer elemento por elemento
//     melhor controlar incluindo um novo atributo na classe para controlar o tamanho do vetor
  /*  public void adiciona(String elemento) {
        for(int i = 0; i < elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
 */
    public void adiciona(String elemento) throws Exception {
        if(this.tamanho < this.elementos.length) { //se o tamanhhio é menor que a capacidade do vetor de elementos
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio");
        }
    }
    public int tamanho() {
        return this.tamanho;
    }
    //imprimir somente os vetores que estão preenchidos
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i<this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();

    }
}
