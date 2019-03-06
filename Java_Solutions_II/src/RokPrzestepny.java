//W zmiennej x przechowywany jest rok.
// Zadaniem programu jest wczytanie z klawiatury wartości zmiennej x i wypisanie komunikatu czy zadany rok jest przestępny czy nie.
//Rok przestępny to liczba: podzielna przez 4 i niepodzielna przez 100


import java.util.Scanner;

public class RokPrzestepny {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        int r = input.nextInt();


        if (r%4 == 0 && r%100 != 0){
            System.out.println("Jest to rok przestępny");
        } else{
            System.out.println("Nie jest to rok przestępny");
        }


    }
}
