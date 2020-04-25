package com.company;

public class Main {

    private static int x = 9;
    private static int y = 9;

    public static void main(String[] args) {
        System.out.println("ZASADY: ");
        System.out.println("1. X to czarne pola, 0 to pola białe. ");
        System.out.println("2. Pionki białe są oznaczone znakiem B, a czarne znakiem C. ");
        String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[][] tab = new String[x][y];
        for (int i = 1; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                tab[i][j] = "X";
            }
        }
        for (int i = 0; i < 9; i++)
        {
            tab[0][0] = " ";
            tab[i][0] = String.valueOf(i);
        }
        for (int i = 1; i < tab.length; i++)
        {
            tab[0][i] = chars[i-1];
        }
        for (int i = 1; i < tab.length; i+=2)
        {
            for (int j = 1; j < 8; j+=2)
            {
                for (int k = 2; k < 9; k+=2)
                {
                    tab[j][i] = "0";
                    tab[k][i + 1] = "0";
                }
            }
        }
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab.length; j++)
            {
                String item = tab[i][j];
                System.out.print(item+"   ");
            }
            System.out.println();
        }
    }
    String[][] createArray()
    {
        String[][] tab = new String[x][y];
        return tab;
    }

}
