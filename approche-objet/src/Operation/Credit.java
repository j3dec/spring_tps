package Operation;

public class Credit extends Operation {
    public Credit(String operation_date, int op_amount) {
        super(operation_date, op_amount);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }


}
