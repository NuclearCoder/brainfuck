package brainfuck.impl.parser

import brainfuck.instructions.Decrement
import brainfuck.instructions.Increment
import brainfuck.instructions.InstructionQueue
import brainfuck.instructions.Loop
import brainfuck.instructions.Read
import brainfuck.instructions.ShiftLeft
import brainfuck.instructions.ShiftRight
import brainfuck.instructions.Write
import brainfuck.parser.Parser
import brainfuck.parser.Token
import brainfuck.parser.TokenQueue

internal object BFParser : Parser {

    override fun parse(tokens: TokenQueue): InstructionQueue = parse(tokens, depth = 0)

    private fun parse(tokens: TokenQueue, depth: Int): InstructionQueue = InstructionQueue().also {
        while (tokens.isNotEmpty()) {
            val token = tokens.remove()
            if (token == Token.END_LOOP) {
                if (depth <= 0)
                    throw IllegalStateException("Closed inexistent loop")
                return@also
            }
            val instruction = when (token) {
                Token.INCR -> Increment
                Token.DECR -> Decrement
                Token.LEFT -> ShiftLeft
                Token.RIGHT -> ShiftRight
                Token.READ -> Read
                Token.WRITE -> Write
                Token.START_LOOP -> Loop(parse(tokens, depth + 1))
                else -> null
            } ?: continue
            it.add(instruction)
        }
        if (depth > 0)
            throw IllegalStateException("Unclosed loop")
    }

}