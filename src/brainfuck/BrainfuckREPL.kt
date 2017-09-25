package brainfuck

import brainfuck.parser.Interpreter
import brainfuck.runtime.Context
import brainfuck.runtime.Input
import brainfuck.runtime.Output

object BrainfuckREPL {

    @JvmStatic
    fun main(args: Array<String>) {
        val sb = StringBuilder()

        val context = Context {
            input = Input.SYSTEM
            output = Output.ofAppendable(sb)
        }

        while (true) {
            print("brainfuck> ")
            val input = readLine()
            if (input == null || input.isBlank()) return
            try {
                sb.setLength(0)
                Interpreter.run(context, input)
                println(sb)
                println()
            } catch (e: Exception) {
                System.err.println("Exception thrown: " + e.message)
            }
        }
    }

}