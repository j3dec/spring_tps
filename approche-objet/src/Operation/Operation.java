package Operation;

import java.time.LocalDate;

public abstract class Operation {

    String operation_date;
    int op_amount;

    public Operation(String operation_date, int op_amount) {
        this.operation_date = operation_date;
        this.op_amount = op_amount;
    }

    public String toString() {
        return operation_date + " - " + op_amount;
    }

    public abstract String getType();


}
