package svalbuena.springframework.spring5jokesappv2.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuckNorrisJokeServiceTest {
    private ChuckNorrisJokeService service;

    @BeforeEach
    void setUp() {
        service = new ChuckNorrisJokeService();
    }

    @Test
    void test() {
        final String joke = service.getJoke();
        System.out.println("ChuckNorrisJoke = " + joke);
        assertNotNull(joke);
    }
}