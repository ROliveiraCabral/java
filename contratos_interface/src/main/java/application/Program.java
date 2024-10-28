package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy: ");
        LocalDate localDate = LocalDate.parse(scanner.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int months = scanner.nextInt();

        Contract contract = new Contract(number, localDate, totalValue);

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, months);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
