fun main() {
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
}
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}