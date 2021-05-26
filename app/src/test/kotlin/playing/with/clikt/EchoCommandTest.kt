package playing.with.clikt

import com.github.ajalt.clikt.core.context
import kotlin.test.Test
import kotlin.test.assertEquals

class EchoCommandTest {

    @Test
    fun `should print the provided string without new line when -n is used`() {
        val testConsole = TestConsole()

        EchoCommand()
            .context { console = testConsole }
            .main(arrayOf("-n", "foo"))


        assertEquals(
            listOf("foo"),
            testConsole.stdoutTokens,
        )
    }

    @Test
    fun `should print the provided string with new line`() {
        val testConsole = TestConsole()

        EchoCommand()
            .context { console = testConsole }
            .main(arrayOf("foo"))


        assertEquals(
            listOf("foo\n"),
            testConsole.stdoutTokens,
        )
    }

    @Test
    fun `should print the provided strings with new line`() {
        val testConsole = TestConsole()

        EchoCommand()
            .context { console = testConsole }
            .main(arrayOf("foo", "bar"))


        assertEquals(
            listOf("foo bar\n"),
            testConsole.stdoutTokens,
        )
    }
}
