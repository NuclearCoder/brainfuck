package brainfuck.parser

import brainfuck.impl.parser.BFParser
import brainfuck.instructions.Instruction
import brainfuck.instructions.InstructionQueue
import java.util.*

interface Parser {

    companion object {
        fun parse(tokens: TokenQueue): InstructionQueue = BFParser.parse(tokens)
        fun parse(str: CharSequence): InstructionQueue = parse(Lexer.lex(str))
    }

    fun parse(tokens: TokenQueue): InstructionQueue

}