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
        this.aumentaCapacidade();
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
    public String busca(int posicao) {
        //posicoes que existem dentro deste vetor que tem elementos
        //a posicao precisa ser >= a 0 ja q indice comeca no 0
        //posi tb tem que ser menor que o tamanho
        //se negar td a expressao tem o range de tds posi que n podem ser acessadas
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }
    //como str é um obj nao pode usar ==
    public int busca(String elemento) {
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1; //-1 é posi q n existe dentro do vetor
    }
//     e se tentar colocar na posi 4 colocar na posi 3 que é onde ta o f
//            pode mover o g pra posi 5, mover o f pra posi 4, e pode atribuir o a pro f que é a posi 3
//    ai insere o valor e nao perde nada no vetor
//            concluindo essa logica tem q mover os elementos pra posi seguinte pra fazer
//    espaco no vetor
    //
   public void adiciona(int posicao, String elemento) {
       if(!(posicao >= 0 && posicao < tamanho)) {
           throw new IllegalArgumentException("Posição inválida");
       }
       this.aumentaCapacidade();
       //p mover os elementos usar for para iterar o vetor
       // 0 1 2 3 4 5 6 = tamanho 5
       // B C E F G + +
       for(int i = this.tamanho-1; i >= posicao; i--) {
           this.elementos[i+1] = this.elementos[i];
       }
       this.elementos[posicao] = elemento;
       this.tamanho++;
   }
   //metodo pra add capacidade no vetor
    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            //se tamanho é igual a capacidade do vetor que tem
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++) {
                //atrb posi 0 do elementos novos a posi 0 do nosso vetor
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; //atr novo vetor ao vetor que estamos trab dentro desta classe
        }
    }
}
