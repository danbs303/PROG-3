public class ex2 {
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










/*Faça  um  programa  que  imprima  os  trinta 
primeiros elementos da série de Fibonacci. A 
série  é  a  seguinte:  1,  1,  2,  3,  5,  8,13  etc.  Para 
calculá-la,  o  primeiro  e  segundo  elementos 
valem 1; daí por diante, cada elemento vale a 
soma dos dois elementos anteriores
*/