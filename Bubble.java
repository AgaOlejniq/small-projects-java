package pack;

import java.util.Scanner;

class Bubble {
    public static void main(String[] args) {
        int size, a, b;

        Scanner user = new Scanner(System.in);
        System.out.println("Give me size of the tab: ");
        size = user.nextInt();

        int tab[] = new int[size];

        System.out.println("Give me numbers for tab: ");

        for (int i = 0; i < size; i++)
            tab[i] = user.nextInt();

        System.out.println("--- --- --- --- ---");
        for (int element : tab)
            System.out.println(element);
        System.out.println("--- --- --- --- ---");

        System.out.println("Sorting ASC");

        for (a=1; a< size; a++){
            for (b = size-1; b >= a; b--){
                if(tab[b-1] > tab[b]){
                    int t = tab[b-1];
                    tab[b-1] = tab[b];
                    tab[b] = t;
                }
            }
        }

        for(int element : tab)
            System.out.println(element);
    }
}