import java.util.Scanner;

public class ex03 {

    /*
    Informar um saldo e imprimir o saldo com reajuste de 1%.
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int saldo;

        System.out.println("Informe um saldo");
        saldo = input.nextInt();

        int reajuste = saldo+(saldo*1/100);

        System.out.println("Seu novo saldo é de: "+reajuste);

    }

}
