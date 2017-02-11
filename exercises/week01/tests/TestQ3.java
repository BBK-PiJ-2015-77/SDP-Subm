import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by thomasmcgarry on 18/01/2017.
 */
public class TestQ3 {

    int fieldQty;
    boolean privFields;
    boolean arrayList;
    int maxHelper;
    boolean throwClause;
    boolean intReturn;
    boolean missingZero;
    String className;
    Class testClass;

    @Before
    public void setUp() {
        fieldQty = 4;
        maxHelper = 2;
        className = "java.lang.String";
        try {
            testClass = java.lang.Class.forName(className);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testFieldQty() {
        Field[] allFields = testClass.getFields();
        int check = allFields.length;
        assertEquals(fieldQty, 4);
    }

}
