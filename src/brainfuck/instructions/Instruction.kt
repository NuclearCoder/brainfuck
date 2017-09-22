package brainfuck.instructions

import brainfuck.runtime.Context

interface Instruction {
    fun action(context: Context)
}