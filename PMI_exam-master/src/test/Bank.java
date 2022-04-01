// array list- used to store back acounts
import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        // make pree existing acounts
        String accountNumber1 = "12345678-56482315-00000000";
        String accountNumber2 = "12345678-35984576-00000000";
        int total_num_of_accounts_open = 0;
        Integer[] balance = {0, 0};
    }

    static void openNewAccount(int total_num_of_accounts_open, Integer[] balance){
        if(total_num_of_accounts_open<=2) {
            balance[total_num_of_accounts_open] = 0;
            total_num_of_accounts_open += 1;
        }
        else{
            System.out.println("you cannot open more then two acounts, sorry");
        }
    }
    static void closeAccount(int total_num_of_accounts_open){
        total_num_of_accounts_open += 1;
    }
    static void getBalances(String accountNumber1, String accountNumber2, int total_num_of_accounts_open, Integer[] balance){
        for(int i=0; i<total_num_of_accounts_open; i++){
            if(i=1){
                System.out.println(accountNumber1+": has a balance of"+balance[i]);
            }
            else if(i>=1){
                System.out.println(accountNumber2+": has a balance of"+balance[i]);

            }
        }
    }
}
