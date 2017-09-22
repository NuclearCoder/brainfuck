package brainfuck.impl.parser

import brainfuck.instructions.InstructionQueue
import brainfuck.parser.Interpreter
import brainfuck.runtime.Context

internal object BFInterpreter : Interpreter {

    override fun run(context: Context, instructions: InstructionQueue) {
        context.reset()
        instructions.forEach { it.action(context) }
    }

}