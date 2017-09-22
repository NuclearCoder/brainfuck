package brainfuck.instructions

import brainfuck.runtime.Context

class Loop(private val instructions: InstructionQueue) : Instruction {
    override fun action(context: Context) {
        while (context.getState() != 0) {
            instructions.forEach { it.action(context) }
        }
    }

    override fun toString() = "Loop $instructions"
}