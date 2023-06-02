import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTeste {
    @Test
    @DisplayName("Teste metodo xxoo")

    fun testCountXO() {

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoox"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xXoo"))},
            {Assertions.assertTrue(countXO("xxOo"))}
        )
    }
}