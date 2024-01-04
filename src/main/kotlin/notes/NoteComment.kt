package notes

import data.CommentNote
import data.Note


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
            if (b.isDeleted == true) {
                return false
            }
        }
        return false
    }

    fun getComments(element: CommentNote) :MutableList<CommentNote>{
        val st = mutableListOf<CommentNote>()
        for ((i, b) in storage.withIndex())
            if (element.noteId == b.noteId) {
                st.add(b)
            }
        return st
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

