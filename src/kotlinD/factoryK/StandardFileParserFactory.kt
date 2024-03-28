package kotlinD.factoryK

class StandardFileParserFactory : FileParserFactory {
    override fun createFromFileName(fileName: String) =
        when (fileName.substringAfterLast('.')) {
            "xml" -> XmlFileParser()
            "json" -> JsonFileParser()
            else -> throw Exception("I don't know how to deal with $fileName.")
        }
}