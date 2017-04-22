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

        //addInstruction has...arguments: label, r, s1, s2  | String, int, int, int
        //LinInstruction has...arguments: label, r, s1      | String, int, int
        //SubInstruction has...arguments: label, r, s1, s2  | String, int, int, int
        //MulInstruction has...arguments: label, r, s1, s2  | String, int, int, int
        //BNZInstruction has...arguments: label, s1, l2     | String, int, String
        //OutInstruction has...arguments: label, r          | String, int
        //DivInstruction has...arguments: label, r, s1, s2  | String, int, int, int

        //What patterns are in these classes that can be applied each time.
        //add, sub, mul, div can all be treated the same

        //find out how many parameters there are
        //1st parameter must be a string - use 'label' as argument
        //2nd parameter has to be an int (I think) - use scanInt() as argument
        //3rd parameter, if string, use scan(), else scanInt() - just use this rule in general apart from 1st argument

        try {

            System.out.println("\nTest");

            Constructor[] addConstructors = Class.forName(className).getConstructors();
            Constructor<?> lastConstructor = null;

            //Select the last constructor
            for (Constructor<?> currentConstructor : addConstructors) {
                lastConstructor = currentConstructor;
            }

            //Create a list of arguments/objects

            System.out.println(lastConstructor.getName());
            Class[] parameterTypes = lastConstructor.getParameterTypes();

            for (Class param : parameterTypes) {
                System.out.println(param.getName());
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
