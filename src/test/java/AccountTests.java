import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTests {

    private String namePositive = "Тимоти Шаламе";
    private String nameWhiteSpaceBegin = " Тимоти Шаламе";
    private String nameWhiteSpaceEnd = "Тимоти Шаламе ";
    private String nameWithoutSpace = "ТимотиШаламе";
    private Account accountPositive;
    private Account accountWhiteSpaceBegin;
    private Account accountWhiteSpaceEnd;
    private Account accountWithoutSpace;

    @Before
    public void init() {
        accountPositive = new Account(namePositive);
        accountWhiteSpaceBegin = new Account(nameWhiteSpaceBegin);
        accountWhiteSpaceEnd = new Account(nameWhiteSpaceEnd);
        accountWithoutSpace = new Account(nameWithoutSpace);
    }

    @Test
    public void checkIsNotWhiteSpaceInTheBeginTestTrue() {
        boolean expected = true;
        boolean actual = accountPositive.isNotWhiteSpaceInTheBegin();
        assertEquals(expected, actual);
    }

    @Test
    public void checkIsNotWhiteSpaceInTheEndTestTrue() {
        boolean expected = true;
        boolean actual = accountPositive.isNotWhiteSpaceInTheEnd();
        assertEquals(expected, actual);
    }

    @Test
    public void checkNameToEmbossTestTrue() {
        boolean expected = true;
        boolean actual = accountPositive.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Test
    public void checkOneWhiteSpaceTestTrue() {
        int expected = 1;
        int actual = accountPositive.countOfWhiteSpace();
        assertEquals(expected, actual);
    }

    @Test
    public void checkIsNotWhiteSpaceInTheBeginTestFalse() {
        boolean expected = false;
        boolean actual = accountWhiteSpaceBegin.isNotWhiteSpaceInTheBegin();
        assertEquals(expected, actual);
    }

    @Test
    public void checkIsNotWhiteSpaceInTheEndTestFalse() {
        boolean expected = false;
        boolean actual = accountWhiteSpaceEnd.isNotWhiteSpaceInTheEnd();
        assertEquals(expected, actual);
    }

    @Test
    public void checkNameToEmbossTestFalse() {
        boolean expected = false;
        boolean actual = accountWithoutSpace.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Test
    public void checkZeroWhiteSpaceTestFalse() {
        int expected = 0;
        int actual = accountWithoutSpace.countOfWhiteSpace();
        assertEquals(expected, actual);
    }
}
