package playing.with.clikt

import com.github.ajalt.clikt.output.CliktConsole

class TestConsole : CliktConsole {
    var stdoutTokens = listOf<String>()
    var stderrTokens = listOf<String>()

    override val lineSeparator: String = System.lineSeparator()

    override fun print(text: String, error: Boolean) {
        if (error) {
            stderrTokens = stderrTokens + text
        } else {
            stdoutTokens = stdoutTokens + text
        }
    }

    override fun promptForLine(prompt: String, hideInput: Boolean): String? {
        TODO("Not yet implemented")
    }
}
