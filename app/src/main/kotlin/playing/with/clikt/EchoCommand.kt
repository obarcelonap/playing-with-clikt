package playing.with.clikt

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option

class EchoCommand : CliktCommand() {
    private val strings by argument(help = "Write arguments to the standard output").multiple()
    private val doNotAppendNewline by option("-n", help = "do not append a newline").flag()

    override fun run() = echo(strings.joinToString(separator = " "), trailingNewline = !doNotAppendNewline)
}

fun main(args: Array<String>) = EchoCommand().main(args)


