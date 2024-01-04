package notes

interface CRUD<T : Identifiable> {
    val storage: MutableList<T>

    fun create(element: T) : T{
        println("The object has been added!")
        storage.add(element)
        return element
    }

    fun read(): MutableList<T> {
        return storage
    }

    fun update(element: T): Boolean {
        for ((i, b) in storage.withIndex()) {
            if (element.id == b.id) {
                storage[i] = element
                println("The object has been updated!")
                return true
            }
        }
        println("Object not exist or wrong Id!")
        return false
    }

    fun delete(element: T): Boolean {
        for ((i, b) in storage.withIndex()) {

            if (element.id == b.id) {
//                storage.removeAt(i)
                storage[i] = element
                println("The object has been deleted!")
                return true
            }
        }
        println("The object cannot be deleted!")
        return false
    }
    fun clear() {
        storage.clear()
    }
}