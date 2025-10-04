public class ex1_2 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 3; i <= 30; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }   
}


