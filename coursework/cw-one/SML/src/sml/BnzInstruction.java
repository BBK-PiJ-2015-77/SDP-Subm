package sml;

public class BnzInstruction extends Instruction {
    //
    private int op;
    private String instruction;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int op, String instruction) {
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
