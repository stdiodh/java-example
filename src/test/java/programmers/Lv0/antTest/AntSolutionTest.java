package test.java.programmers.Lv0.antTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import programmers.Lv0.ant.AntSolution;

public class AntSolutionTest {
    @Test
    void 개미_군단_검증_테스트() {
        AntSolution sol = new AntSolution();

        int answer = sol.solution(23);

        assertEquals(5, answer);
    }
}
