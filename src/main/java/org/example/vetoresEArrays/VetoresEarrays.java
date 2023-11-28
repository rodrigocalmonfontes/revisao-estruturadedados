package org.example.vetoresEArrays;

public class VetoresEarrays {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor);

        vetor.adiciona(0, "A");
        System.out.println(vetor);

        vetor.adiciona(3, "D");
        System.out.println(vetor);

        

    }
}
