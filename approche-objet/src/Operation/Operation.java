package Operation;

import java.time.LocalDate;

public abstract class Operation {

    private String operation_date;
    private int op_amount;

    public Operation(String operation_date, int op_amount) {
        this.operation_date = operation_date;
        this.op_amount = op_amount;
    }

    public String getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(String operation_date) {
        this.operation_date = operation_date;
    }

    public int getOp_amount() {
        return op_amount;
    }

    public void setOp_amount(int op_amount) {
        this.op_amount = op_amount;
    }

    public String toString() {
        return operation_date + " - " + op_amount;
    }

    public abstract String getType();


}
