import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    private val listPalindromo = listOf("Rotator", "bob", "madam", "mAlAyAlam",
        "1", "Able was I, ere I saw Elba", "Madam I’m Adam",
        "Step on no pets", "Top spot!", "02/02/2020", "Socorram-me subi no ônibus em marrocos")

    private val listIsNotPalindromo = listOf("xyz", "elephant", "Country", "Top . post!", "Wonderful-fool", "Wild imagination!")


    @Test
    fun Should_True_When_IsPalindromo() {
        listPalindromo.forEach {
            assertEquals(true, isPalindromo(it))
        }
    }

    @Test
    fun Should_False_When_IsNotPalindromo() {
        listIsNotPalindromo.forEach {
            assertEquals(false, isPalindromo(it))
        }
    }
}