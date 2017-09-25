package brainfuck.parser

import java.util.*

class TokenQueue : LinkedList<Token>() {
    override fun toString() = joinToString(", ", "[", "]")
}
