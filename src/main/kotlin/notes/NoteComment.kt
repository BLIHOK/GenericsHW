package notes

import data.CommentNote

class NoteComment(
    override val storage: MutableList<CommentNote>,
) : CRUD<CommentNote> {
    override fun delete(element: CommentNote): Boolean {
        for ((i, b) in storage.withIndex()) {
            if (element.id == b.id) {
                storage[i].isDeleted = true
                println("The object has been deleted!")
                return true
            }
        }
        return false
    }

    fun getComments(element: CommentNote) {
        for ((i, b) in storage.withIndex())
            if (element.noteId == b.noteId) {
                println("User $b")
            }
    }

    fun restoreComment(element: CommentNote): Boolean {
        for ((i, b) in storage.withIndex()) {
            if (element.id == b.id) {
                storage[i].isDeleted = false
                println("The object has been restored!")
                return true
            }
        }
        return false
    }
}

