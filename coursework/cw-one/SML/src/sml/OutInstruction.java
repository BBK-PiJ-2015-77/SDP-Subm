package sml;

public class OutInstruction extends Instruction {

    private int register;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println("The content of register " + register + " is: " + m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " " + register;
    }

}

/**
 * public class LinInstruction extends Instruction {
 private int register;
 private int value;

 public LinInstruction(String label, String opcode) {
 super(label, opcode);
 }

 public LinInstruction(String label, int register, int value) {
 super(label, "lin");
 this.register = register;
 this.value = value;

 }

 @Override
 public void execute(Machine m) {
 m.getRegisters().setRegister(register, value);
 }

 @Override
 public String toString() {
 return super.toString() + " register " + register + " value is " + value;
 }
 }
 */
