import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by thomasmcgarry on 18/01/2017.
 */
public class Worksheet2 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Input class name: ");
        String input = scanner.nextLine();

        try {
            Class reflectClass = java.lang.Class.forName(input);

            String className = reflectClass.getName();
            System.out.println("Classname is: " + className);

            if (reflectClass.isInterface()) {
                System.out.println(className + " is an Interface");
            } else {
                System.out.println(className + " is a Class");
            }

            //Constructors
            Constructor[] constructors = reflectClass.getConstructors();
            System.out.println("Constructors are: " + Arrays.toString(constructors));

            //Methods
            Method[] allMethods = reflectClass.getDeclaredMethods();
            System.out.println("Methods are: " + Arrays.toString(allMethods));

            //Fields
            Field[] allFields = reflectClass.getFields();
            System.out.println("Qty: " + allFields.length);
            System.out.println("Fields are: " + Arrays.toString(allFields));

            Type[] classType = reflectClass.getGenericInterfaces();
            System.out.println("Types are: " + reflectClass.getTypeName());


        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
