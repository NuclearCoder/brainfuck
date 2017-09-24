package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import java.nio.CharBuffer

internal class BFReaderInput(private val readable: Readable) : Input {
    private val buffer = CharBuffer.allocate(1)
    override fun read(): Int {
        val read = readable.read(buffer)
        if (read < 1)
            throw NoSuchElementException("No more input chars to read")
        return buffer[0].toInt()
    }
}
