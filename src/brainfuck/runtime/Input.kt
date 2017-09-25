package brainfuck.runtime

import brainfuck.impl.runtime.io.*
import java.io.Reader

interface Input {

    companion object {
        val NULLARY: Input = BFNullaryInput
        val SYSTEM: Input = BFSystemInput
        fun ofReadable(reader: Reader): Input = BFReaderInput(reader)
        fun ofString(string: CharSequence): Input = BFStringInput(string)
    }

    fun read(): Int

    fun toDebug(): Input = BFDebugInput(this)

}