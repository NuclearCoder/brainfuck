package brainfuck.runtime

internal abstract class AbstractContext(private val maxCycleCount: Int) : Context {

    private var cycleCount = 0

    protected abstract val stack: Stack
    protected abstract val input: Input
    protected abstract val output: Output

    override fun read(): Int {
        checkCycles()
        return input.read()
    }

    override fun write(o: Int) {
        checkCycles()
        return output.write(o)
    }

    override fun increment() {
        checkCycles()
        stack.get().let(Int::inc).let(stack::set)
    }

    override fun decrement() {
        checkCycles()
        stack.get().let(Int::dec).let(stack::set)
    }

    override fun shiftLeft() {
        checkCycles()
        stack.shiftLeft()
    }

    override fun shiftRight() {
        checkCycles()
        stack.shiftRight()
    }

    override fun getState(): Int {
        return stack.get()
    }

    override fun setState(o: Int) {
        stack.set(o)
    }

    override fun reset() {
        stack.clear()
    }

    private fun checkCycles() {
        cycleCount++
        if (cycleCount >= maxCycleCount) {
            throw IllegalStateException("Cycle count exceeded max cycle count ($maxCycleCount)")
        }
    }

}