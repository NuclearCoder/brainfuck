package brainfuck.parser

import brainfuck.impl.parser.BFLexer

interface Lexer {

    companion object {
        fun getToken(c: Char): Token = BFLexer.getToken(c)
        fun lex(str: CharSequence): TokenQueue = TokenQueue().also {
            it.addAll(str.map { getToken(it) })
        }
    }

    fun getToken(c: Char): Token

}