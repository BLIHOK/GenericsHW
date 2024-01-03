package notes

import data.Note


class Notes(
    override val storage: MutableList<Note>,
) : CRUD<Note> {
    override fun delete(element: Note): Boolean {
        for ((i, b) in storage.withIndex()) {
            if (element.id == b.id) {
                storage[i].isDeleted = true
                println("The object has been deleted!")
                return true
            }
        }
        return false
    }

    fun getFriendsNotes(element: Note) {
        for ((i, b) in storage.withIndex()) {
            if(element.userId == b.userId){
                println("User $b")
            }
        }
    }
    fun getById(element: Note): Note{
        for ((i, b) in storage.withIndex()) {
            if(element.id == b.id){
                return b
            }
        }
        return element
    }

    fun clear() {
        storage.clear()
    }
}



