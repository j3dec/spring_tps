package Operation;

public class Debit extends Operation{
    public Debit(String operation_date, int op_amount) {
        super(operation_date, op_amount);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
