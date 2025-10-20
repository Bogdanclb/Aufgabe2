public class Zahl {
    public int MaxZahl (int [] Zahlen){
        int max = -99999;
        for (int i = 0; i < Zahlen.length; i++){
            if (Zahlen[i] > max){
                max = Zahlen[i];
            }
        }
        return max;
    }

    public int MinZahl (int [] Zahlen){
        int min = 99999;
        for (int i = 0; i < Zahlen.length; i++){
            if (Zahlen[i] < min){
                min = Zahlen[i];
            }
        }
        return min;
    }

    public int MaxSumme(int [] Zahlen){
        int Summe = 0;
        for (int i = 0; i < Zahlen.length; i++){
            Summe += Zahlen[i];
        }
        int MaxSumme = -99999;
        for (int i = 0; i < Zahlen.length; i++){
            int x = Summe;
            x = x - Zahlen[i];
            if (x > MaxSumme)
                MaxSumme = x;
        }
        return MaxSumme;
    }

    public int MinSumme(int [] Zahlen){
        int Summe = 0;
        for (int i = 0; i < Zahlen.length; i++){
            Summe += Zahlen[i];
        }
        int MinSumme = 99999;
        int x;
        for (int i = 0; i < Zahlen.length; i++){
            x = Summe;
            x = x - Zahlen[i];
            if (x < MinSumme)
                MinSumme = x;
        }
        return MinSumme;
    }
}
