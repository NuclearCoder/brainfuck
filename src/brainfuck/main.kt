package brainfuck

import brainfuck.parser.Interpreter
import brainfuck.runtime.Context
import brainfuck.runtime.Input
import brainfuck.runtime.Output


fun main(args: Array<String>) {
    val context = Context {
        input = Input.SYSTEM.toDebug()
        output = Output.SYSTEM.toDebug()
    }

    do {
        val input = readLine() ?: return
        Interpreter.run(context, input)
    } while(input.isNotEmpty())
}