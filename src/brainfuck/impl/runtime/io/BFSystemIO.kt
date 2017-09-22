package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import brainfuck.runtime.Output
import java.io.InputStreamReader
import java.io.OutputStreamWriter

internal object BFSystemInput : Input by BFReaderInput(InputStreamReader(System.`in`))
internal object BFSystemOutput : Output by BFWriterOutput(OutputStreamWriter(System.out))