package sml;

public class SubInstruction extends AddInstruction {
    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String label, String op) {
        super(label, op);
    }

    @Override
    public SubInstruction(String label, int result, int op1, int op2) {
        super("Sub", result, op1, op2)
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " - " + op2 + " to " + result;
    }
}
