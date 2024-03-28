package kotlinD.factoryK

interface FileParserFactory {
    fun createFromFileName(fileName: String): FileParser
}