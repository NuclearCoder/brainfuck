package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import brainfuck.runtime.Output
import java.io.InputStreamReader

internal object BFSystemInput : Input by BFReaderInput(InputStreamReader(System.`in`))
internal object BFSystemOutput : Output by BFAppendableOutput(System.out)