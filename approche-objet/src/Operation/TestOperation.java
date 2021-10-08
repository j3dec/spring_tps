package Operation;

import banque.entities.Compte;
import banque.entities.CompteTaux;

public class TestOperation {

    public static void main(String[] args) {

        Operation[] op_arr = new Operation[4];

        op_arr[0] = new Credit("06/10/2021", 1865);
        op_arr[1] = new Debit("07/10/2021", 2000);
        op_arr[2] = new Credit("08/10/2021", 1200);
        op_arr[3] = new Debit("08/10/2021", 234);

        int global_amount = 0;
        for (Operation operation : op_arr) {
            if (operation.getType() == "CREDIT") {
                System.out.println(operation.getType());
                global_amount += operation.getOp_amount();
                operation.setGlobal_amount(global_amount);

            }
            if (operation.getType() == "DEBIT") {
                System.out.println(operation.getType());
                global_amount -= operation.getOp_amount();
                operation.setGlobal_amount(global_amount);

            }

            System.out.println(operation);
            System.out.println("Montant Global : " + global_amount);
            System.out.println("\n");
        }
    }
}
