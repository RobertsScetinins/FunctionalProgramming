package Solution;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTests {

    @Test
    public void superDigit17() {
        assertEquals(8, Solution.superDigit(17));
    }

    @Test
    public void superDigit0() {
        assertEquals(0, Solution.superDigit(-1));
    }

    @Test
    public void superDigit9875() {
        assertEquals(2, Solution.superDigit(9875));
    }

    @Test
    public void superDigit11() {
        assertEquals(2, Solution.superDigit(11));
    }

    @Test
    public void superDigit1306431() {
        assertEquals(9, Solution.superDigit(1306431));
    }

    @Test
    public void superDigit12x9() {
        assertEquals(9, Solution.superDigit(999999999999L));
    }

    @Test
    public void superDigit954367() {
        assertEquals(7, Solution.superDigit(954367));
    }

    @Test
    public void superDigit5() {
        assertEquals(5, Solution.superDigit(5));
    }

    @Test
    public void shortSuperDigit17() {
        assertEquals(8, Solution.shortSuperDigit(17));
    }

    @Test
    public void shortSuperDigit0() {
        assertEquals(0, Solution.shortSuperDigit(-1));
    }

    @Test
    public void shortSuperDigit9875() {
        assertEquals(2, Solution.shortSuperDigit(9875));
    }

    @Test
    public void shortSuperDigit11() {
        assertEquals(2, Solution.shortSuperDigit(11));
    }

    @Test
    public void shortSuperDigit1306431() {
        assertEquals(9, Solution.shortSuperDigit(1306431));
    }

    @Test
    public void shortSuperDigit12x9() {
        assertEquals(9, Solution.shortSuperDigit(999999999999L));
    }

    @Test
    public void shortSuperDigit954367() {
        assertEquals(7, Solution.shortSuperDigit(954367));
    }

    @Test
    public void shortSuperDigit5() {
        assertEquals(5, Solution.shortSuperDigit(5));
    }

    @Test
    public void powerSum100() {
        assertEquals(3, Solution.powerSum(100, 2));
    }

    @Test
    public void powerSum10() {
        assertEquals(1, Solution.powerSum(10, 2));
    }

    @Test
    public void powerSum19() {
        assertEquals(0, Solution.powerSum(19, 2));
    }

    @Test
    public void powerSum4() {
        assertEquals(1, Solution.powerSum(4, 2));
    }

    @Test
    public void powerSum51() {
        assertEquals(1, Solution.powerSum(51, 2));
    }

    @Test
    public void powerSum133_3() {
        assertEquals(1, Solution.powerSum(100, 3));
        // 100 = 4^3+3^3+2^3+1^3
    }

    @Test
    public void powerSum1937_4() {
        assertEquals(1, Solution.powerSum(1937, 4));
        // 1937 = 6^4+5^4+2^4
    }

    @Test
    public void powerSum1944_3() {
        assertEquals(3, Solution.powerSum(1944, 3));
        // 1944 = 12^3+6^3 = 12^3+5^3+4^3+3^3 = 10^3+8^3+6^3+5^3+4^3+3^3
    }

    @Test
    public void powerSumOOP100() {
        assertEquals(3, Solution.powerSumOOP(100, 2));
    }

    @Test
    public void powerSumOOP10() {
        assertEquals(1, Solution.powerSumOOP(10, 2));
    }

    @Test
    public void powerSumOOP19() {
        assertEquals(0, Solution.powerSumOOP(19, 2));
    }

    @Test
    public void powerSumOOP4() {
        assertEquals(1, Solution.powerSumOOP(4, 2));
    }

    @Test
    public void powerSumOOP51() {
        assertEquals(1, Solution.powerSumOOP(51, 2));
    }

    @Test
    public void powerSumOOP133_3() {
        assertEquals(1, Solution.powerSumOOP(100, 3));
        // 100 = 4^3+3^3+2^3+1^3
    }

    @Test
    public void powerSumOOP1937_4() {
        assertEquals(1, Solution.powerSumOOP(1937, 4));
        // 1937 = 6^4+5^4+2^4
    }

    @Test
    public void powerSumOOP1944_3() {
        assertEquals(3, Solution.powerSumOOP(1944, 3));
        // 1944 = 12^3+6^3 = 12^3+5^3+4^3+3^3 = 10^3+8^3+6^3+5^3+4^3+3^3
    }
}