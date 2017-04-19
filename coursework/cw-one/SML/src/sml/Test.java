package sml;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by thomasmcgarry on 19/03/2017.
 */
public class Test {

    public static void main(String[] args){

        //Class<?> instructionClass;
        Constructor<?> instructionConstructor;

        Machine m = new Machine();
        Instruction i1 = new AddInstruction("L1", 10, 10, 10);

        /**
        Method[] methods = Instruction.class.getMethods();
        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }
         */

        Class myClass = AddInstruction.class;
        String myClassName = myClass.getName();
        String myClassNameSimple = myClass.getSimpleName();
        System.out.println("Name: " + myClassName);
        System.out.println("Simple Name: " + myClassNameSimple);


        Class instructionClass = Instruction.class;

        Constructor[] constructors = myClass.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println("constructor = " + cons.getName());
        }
        //AddInstruction is the constructor and there are 2 constructors

        //This doesn't work
        //Constructor constructor = myClass.getConstructor(Class[]{Integer});

        //Constructor constructor = sml.AddInstruction.class.getConstructor(String.class, String.class);


        //String ins = scan();
        //case "add"

        String ins = "add";

        String className = "sml." + ins.substring(0,1).toUpperCase() + ins.substring(1) + "Instruction";
        System.out.println(className);

        //addInstruction has...arguments: label, r, s1, s2
        //LinInstruction has...arguments: label, r, s1
        //SubInstruction has...arguments: label, r, s1, s2
        //MulInstruction has...arguments: label, r, s1, s2
        //BNZInstruction has...arguments: label, s1, l2
        //OutInstruction has...arguments: label, r
        //DivInstruction has...arguments: label, r, s1, s2

        //What patterns are in these classes that can be applied each time.
        //add, sub, mul, div can all be treated the same

        try {
            Class instruction = Class.forName(className);
            Constructor[] addConstructors = Class.forName(className).getConstructors();
            for (Constructor constructor : addConstructors) {
                //System.out.println("Constructor = " + constructor.getName());
                System.out.println("\nNew constructor:");
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class c : parameterTypes) {
                    System.out.println(c.getName());
                }
            }




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        /**
         * Class names:
         *
         * sml.AddInstruction
         * sml. blah blah
         */
    }

}
