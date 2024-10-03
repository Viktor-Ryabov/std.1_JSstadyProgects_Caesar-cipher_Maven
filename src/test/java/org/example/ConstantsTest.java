package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstantsTest {
    @Test
    public void setKEYCIPHERNUMBER(int KEYCIPHERNUMBER){
        boolean rigthIncomeData = (KEYCIPHERNUMBER <= 36 && KEYCIPHERNUMBER >= 1);
        Assertions.assertTrue(rigthIncomeData);
    }
}
