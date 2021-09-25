package guru.qa.tests;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("this is before all method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("this is after all method!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("this is before each method!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("this is after each method!");
    }

    @Test
    void firstTest() {
        System.out.println("this is a first @test");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("this is a second @test");
        Assertions.assertTrue(true);
    }
}