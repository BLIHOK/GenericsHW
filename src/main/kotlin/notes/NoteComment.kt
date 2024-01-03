package notes

import Exceptions.NoteExistException
import data.CommentNote

class NoteComment(
    override val storage: MutableList<CommentNote>,
    ) : CRUD<CommentNote>  {

    override fun create(element: CommentNote) {
        storage.add(element)
    }

    override fun read(): MutableList<CommentNote> {
        return storage
    }

    override fun update(element: CommentNote): Boolean {
        for ((i, b) in storage.withIndex()) {
            storage[i] = element
            return true
        }
        return false
    }

    override fun delete(element: CommentNote):Boolean{

        storage.clear()
    }

    fun getComments(elementId: CommentNote): CommentNote {
        for (i in storage.indices) {
            for(j in storage.indices){
                if(j == elementId){
                    return storage[j]
                }
            }
        }
        return throw NoteExistException("This Id not exist")
    }

    fun restoreComment(): Boolean{
        return storage.addAll(deletedStorage)
    }
}

