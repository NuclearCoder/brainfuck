package brainfuck.impl.parser

import brainfuck.parser.Lexer
import brainfuck.parser.Token

internal object BFLexer : Lexer {

    private val tokenMap = mapOf(
            '+' to Token.INCR,
            '-' to Token.DECR,
            '<' to Token.LEFT,
            '>' to Token.RIGHT,
            '[' to Token.START_LOOP,
            ']' to Token.END_LOOP,
            ',' to Token.READ,
            '.' to Token.WRITE
    )

    override fun getToken(c: Char): Token = tokenMap[c] ?: Token.IGNORED

}