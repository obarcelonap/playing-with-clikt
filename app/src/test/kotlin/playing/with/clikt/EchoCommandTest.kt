package playing.with.clikt

import com.github.ajalt.clikt.core.context
import kotlin.test.Test
import kotlin.test.assertEquals

class EchoCommandTest {

    @Test
    fun `should print the provided string`() {
        val testConsole = TestConsole()

        EchoCommand()
            .context { console = testConsole }
            .main(arrayOf("foo"))


        assertEquals(
            listOf("foo"),
            testConsole.stdoutTokens,
        )
    }
}
