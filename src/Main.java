void main() {
    Zahl z = new Zahl();
    int [] Zahlen = {4,8,3,10,17};
    System.out.println("Max Zahl : "+z.MaxZahl(Zahlen));
    System.out.println("Min Zahl : " + z.MinZahl(Zahlen));
    System.out.println("Max Summe : " + z.MaxSumme(Zahlen));
    System.out.println("Min Summe : " + z.MinSumme(Zahlen));
    }
