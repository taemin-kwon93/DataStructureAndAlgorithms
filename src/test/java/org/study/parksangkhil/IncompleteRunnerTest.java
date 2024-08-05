package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IncompleteRunnerTest {
    private IncompleteRunner incompleteRunner;

    @BeforeEach
    void setUp() {
        incompleteRunner = new IncompleteRunner();
    }

    @ParameterizedTest
    @CsvSource({
            "'leo,kiki,eden', 'eden,kiki', 'leo'",
            "'marina,josipa,nikola,vinko,filipa','josipa,filipa,marina,nikola', 'vinko'",
            "'mislav,stanko,mislav,ana', 'stanko,ana,mislav', 'mislav'"
    })
    void solution(String a, String b, String expected) {
        String[] participant = a.split(",");
        String[] completion = b.split(",");

        String result = incompleteRunner.solutionB(participant, completion);

        assertEquals(expected, result);
    }
}
