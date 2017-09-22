package brainfuck.instructions

import brainfuck.runtime.Context

object Write : Instruction {
    override fun action(context: Context) {
        context.getState().let(context::write)
    }

    override fun toString() = "Write"
}