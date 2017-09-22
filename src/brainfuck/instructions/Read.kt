package brainfuck.instructions

import brainfuck.runtime.Context

object Read : Instruction {
    override fun action(context: Context) {
        context.read().let(context::setState)
    }

    override fun toString() = "Read"
}