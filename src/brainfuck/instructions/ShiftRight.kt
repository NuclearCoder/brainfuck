package brainfuck.instructions

import brainfuck.runtime.Context

object ShiftRight : Instruction {
    override fun action(context: Context) {
        context.shiftRight()
    }

    override fun toString() = "ShiftRight"
}