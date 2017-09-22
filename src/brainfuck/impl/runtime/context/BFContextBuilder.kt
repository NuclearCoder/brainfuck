package brainfuck.impl.runtime.context

import brainfuck.runtime.Context
import brainfuck.runtime.ContextBuilder
import brainfuck.runtime.Input
import brainfuck.runtime.Output

internal class BFContextBuilder : ContextBuilder {

    override var maxStackSize: Int = Context.DEFAULT_MAX_STACK_SIZE
    override var maxCycleCount: Int = Context.DEFAULT_MAX_CYCLE_COUNT

    override var input: Input? = null
    override var output: Output? = null

    override fun build(): Context {
        if (maxStackSize <= 0) throw IllegalArgumentException("Max stack size must be non-zero positive")
        if (maxCycleCount <= 1) throw IllegalArgumentException("Max cycle count must be greater than or equal to 2")

        return BFContext(
                maxStackSize,
                maxCycleCount,
                input ?: Input.NULLARY,
                output ?: Output.NULLARY
        )
    }

}