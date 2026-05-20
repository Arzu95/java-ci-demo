package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private App calculatorApp;

    // pastikan setiap test selalu menggunakan instance kalkulator yang baru
    @BeforeEach
    public void setUp() {
        calculatorApp = new App();
    }

    @Test
    public void testAdditionLogic() {
        int result = calculatorApp.calculate("add(5, 3)", null);
        assert result == 8 : "Test Penambahan Gagal! Hasilnya: " + result;
        System.out.println("Test Penambahan Sukses!");
    }

    @Test
    public void testSubtractionLogic() {
        int result = calculatorApp.calculate("sub(10, 4)", null);
        assert result == 6 : "Test Pengurangan Gagal! Hasilnya: " + result;
        System.out.println("Test Pengurangan Sukses!");
    }

    @Test
    public void testMultiplicationLogic() {
        int result = calculatorApp.calculate("mult(3, 4)", null);
        assert result == 12 : "Test Perkalian Gagal! Hasilnya: " + result;
        System.out.println("Test Perkalian Sukses!");
    }

    @Test
    public void testDivisionLogic() {
        int result = calculatorApp.calculate("div(20, 5)", null);
        assert result == 4 : "Test Pembagian Gagal! Hasilnya: " + result;
        System.out.println("Test Pembagian Sukses!");
    }

    @Test
    public void testLetVariableLogic() {
        // let(a, 5, add(a, a)) -> a=5, hitung a+a -> 10
        int result = calculatorApp.calculate("let(a, 5, add(a, a))", null);
        assert result == 10 : "Test Let (Variabel) Gagal! Hasilnya: " + result;
        System.out.println("Test Let (Variabel) Sukses!");
    }

    @Test
    public void testNestedExpressionLogic() {
        // add(1, mult(2, 3)) -> 1 + (2 * 3) = 7
        int result = calculatorApp.calculate("add(1, mult(2, 3))", null);
        assert result == 7 : "Test Ekspresi Bertingkat Gagal! Hasilnya: " + result;
        System.out.println("Test Ekspresi Bertingkat Sukses!");
    }

    @Test
    public void testRawNumberLogic() {
        int result = calculatorApp.calculate("123", null);
        assert result == 123 : "Test Angka Polos Gagal! Hasilnya: " + result;
        System.out.println("Test Angka Polos Sukses!");
    }
}