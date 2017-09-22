package brainfuck.instructions

import brainfuck.runtime.Context

object ShiftLeft : Instruction {
    override fun action(context: Context) {
        context.shiftLeft()
    }

    override fun toString() = "ShiftLeft"
}