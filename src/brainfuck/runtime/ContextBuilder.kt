package brainfuck.runtime

import brainfuck.impl.runtime.io.BFChainOutput

interface ContextBuilder {

    var maxStackSize: Int
    var maxCycleCount: Int

    var input: Input?
    var output: Output?

    fun build(): Context

    operator fun Output.plus(other: Output): Output = BFChainOutput(this, other)

}