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

}
