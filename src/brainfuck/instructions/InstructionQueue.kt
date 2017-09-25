package brainfuck.instructions

import java.util.*

class InstructionQueue : LinkedList<Instruction>() {
    override fun toString() = joinToString(", ", "[", "]")
}