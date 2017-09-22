package brainfuck.impl.parser

import brainfuck.instructions.*
import brainfuck.parser.Parser
import brainfuck.parser.Token
import brainfuck.parser.TokenQueue

internal object BFParser : Parser {

    override fun parse(tokens: TokenQueue): InstructionQueue = parse(tokens, isLoop = false)

    private fun parse(tokens: TokenQueue, isLoop: Boolean = false): InstructionQueue = InstructionQueue().also {
        while (tokens.isNotEmpty()) {
            val token = tokens.remove()
            if (token == Token.END_LOOP && isLoop) return@also
            val instruction = when (token) {
                Token.INCR -> Increment
                Token.DECR -> Decrement
                Token.LEFT -> ShiftLeft
                Token.RIGHT -> ShiftRight
                Token.READ -> Read
                Token.WRITE -> Write
                Token.START_LOOP -> Loop(parse(tokens, isLoop = true))
                else -> null
            } ?: continue
            it.add(instruction)
        }
    }

}