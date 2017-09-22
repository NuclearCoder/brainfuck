package brainfuck.impl.runtime.context

import brainfuck.impl.runtime.BFStack
import brainfuck.runtime.AbstractContext
import brainfuck.runtime.Input
import brainfuck.runtime.Output
import brainfuck.runtime.Stack

internal class BFContext(stackSize: Int,
                         maxCycleCount: Int,
                         override val input: Input,
                         override val output: Output)
    : AbstractContext(maxCycleCount) {

    override val stack: Stack = BFStack(stackSize)

}