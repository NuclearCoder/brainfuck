package brainfuck.instructions

import brainfuck.runtime.Context

object Decrement : Instruction {
    override fun action(context: Context) {
        context.decrement()
    }

    override fun toString() = "Decrement"
}