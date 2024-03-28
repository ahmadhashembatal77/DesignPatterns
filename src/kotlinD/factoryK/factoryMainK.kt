package kotlinD.factoryK

/*
check this link for more fun with factory pattern
https://github.com/geraldcroes/kotlin_design_patterns/tree/master/src/com/github/geraldcroes/kotlin/gof/factory
*/
private fun main() {
    val parserFactory = StandardFileParserFactory()
    val fileParser = parserFactory.createFromFileName("fileName.xml")
    println(fileParser.readFiles())
}