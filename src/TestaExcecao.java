import java.util.Scanner;

public class TestaExcecao {

    public static void main(String[] args){
        try {
            int num1;
            int num2;

            Scanner in = new Scanner(System.in);
            System.out.println("Informe o dividendo:");
            num1 = in.nextInt();

            System.out.println("Informe o divisor:");
            num2 = in.nextInt();

            boolean restoEhZero = restoDaDivisao(num1,num2);

            if(restoEhZero) {
                System.out.println("Resultado da divisão: " + (num1 / num2) + " com resto zero.");
            }
        } catch (ErroDivisao ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static boolean restoDaDivisao ( int num1, int num2) throws ErroDivisao {

        if (num1 % num2 != 0) {
            throw new ErroDivisao();
        }
        return true;
    }
}