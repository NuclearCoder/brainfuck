package brainfuck.instructions

import brainfuck.runtime.Context

object Increment : Instruction {
    override fun action(context: Context) {
        context.increment()
    }

    override fun toString() = "Increment"
}