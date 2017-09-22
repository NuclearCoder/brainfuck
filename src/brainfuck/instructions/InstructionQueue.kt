package brainfuck.instructions

import java.util.*

class InstructionQueue : Queue<Instruction> by LinkedList<Instruction>() {
    override fun toString() = this.joinToString(", ", "[", "]")
}