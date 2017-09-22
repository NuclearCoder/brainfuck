package brainfuck.parser

import brainfuck.impl.parser.BFInterpreter
import brainfuck.instructions.InstructionQueue
import brainfuck.runtime.Context

interface Interpreter {

    companion object {
        fun run(context: Context, instructions: InstructionQueue) = BFInterpreter.run(context, instructions)
        fun run(context: Context, tokens: TokenQueue) = run(context, Parser.parse(tokens))
        fun run(context: Context, str: CharSequence) = run(context, Parser.parse(str))
    }

    fun run(context: Context, instructions: InstructionQueue)

}