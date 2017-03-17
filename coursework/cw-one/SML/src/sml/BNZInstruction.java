package sml;

public class BNZInstruction extends Instruction {

    private int op;
    private String instruction;

    public BNZInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BNZInstruction(String label, int op, String instruction) {
        super(label, "bnz");
        this.op = op;
        this.instruction = instruction;

    }

    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(op) != 0) {
            m.setPc(m.getLabels().indexOf(instruction));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + op + " " + instruction;
    }

}
