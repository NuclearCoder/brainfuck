package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import brainfuck.runtime.Output
import java.io.Reader
import java.io.Writer

internal class BFReaderInput(private val reader: Reader) : Input {
    override fun read(): Int {
        return reader.read()
    }
}

internal class BFWriterOutput(private val writer: Writer) : Output {
    override fun write(o: Int) {
        writer.write(o)
        writer.flush()
    }
}