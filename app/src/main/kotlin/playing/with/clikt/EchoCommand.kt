package playing.with.clikt

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple

class EchoCommand : CliktCommand() {
    private val args: List<String> by argument(help = "write arguments to the standard output").multiple()

    override fun run() = echo(args.joinToString(separator = " "), trailingNewline = false)
}

fun main(args: Array<String>) = EchoCommand().main(args)

