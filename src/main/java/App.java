import com.google.common.base.Strings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Digite o primeiro numero: ");
            String valueRead = input.nextLine();
            validateBlankValue(valueRead);
            int value1 = Integer.parseInt(valueRead);

            System.out.println("Digite o segundo numero: ");
            valueRead = input.nextLine();
            validateBlankValue(valueRead);
            int value2 = Integer.parseInt(valueRead);

            int result = OperationsController.sum(value1, value2);

            System.out.println("Result: "+result);

        }
    }

    private static void validateBlankValue(String value){
        if(Strings.isNullOrEmpty(value)){
            System.out.println("Aplicação sendo encerrada");
            System.exit(0);
        }
    }
}
