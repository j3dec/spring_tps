package Operation;

import java.time.LocalDate;

public abstract class Operation {

    private String operation_date;
    private int op_amount;
    private int global_amount = 0;

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

    public int getGlobal_amount() {
        return global_amount;
    }

    public void setGlobal_amount(int global_amount) {
        this.global_amount = global_amount;
    }

    public String toString() {
        return operation_date + " : " + op_amount;
    }

    public abstract String getType();


}
