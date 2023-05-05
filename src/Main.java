import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();

        //first test
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account is not exist");
        } catch (WrongCurrencyException e) {
            System.out.println("This account include another currency");
        } catch (WrongOperationException e) {
            System.out.println("This account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Something got wrong. Please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
        System.out.println("-----------------------------------------------------");
        //second test
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("This account is not exist");
        } catch (WrongCurrencyException e) {
            System.out.println("This account include another currency");
        } catch (WrongOperationException e) {
            System.out.println("This account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Something got wrong. Please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
        System.out.println("-----------------------------------------------------");
        //third test
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException e) {
            System.out.println("This account is not exist");
        } catch (WrongCurrencyException e) {
            System.out.println("This account include another currency");
        } catch (WrongOperationException e) {
            System.out.println("This account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Something got wrong. Please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
        System.out.println("-----------------------------------------------------");
        //fourth test
        try {
            bankApplication.process("accountId001", 850, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account is not exist");
        } catch (WrongCurrencyException e) {
            System.out.println("This account include another currency");
        } catch (WrongOperationException e) {
            System.out.println("This account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Something got wrong. Please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
        System.out.println("-----------------------------------------------------");
        //fifth test
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account is not exist");
        } catch (WrongCurrencyException e) {
            System.out.println("This account include another currency");
        } catch (WrongOperationException e) {
            System.out.println("This account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Something got wrong. Please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
    }
}
