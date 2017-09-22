package brainfuck.parser

enum class Token {
    LEFT, RIGHT,
    INCR, DECR,
    START_LOOP, END_LOOP,
    READ, WRITE,

    IGNORED
}