package brainfuck.runtime

interface ContextBuilder {

    var maxStackSize: Int
    var maxCycleCount: Int

    var input: Input?
    var output: Output?

    fun build(): Context

}