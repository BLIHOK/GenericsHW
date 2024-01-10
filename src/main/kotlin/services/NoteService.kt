package services


import data.CommentNote
import data.Note
import notes.NoteComment
import notes.Notes

object NoteService {

    private val notesCrud: Notes = Notes(mutableListOf()) // Почему бы не задать значение по умолчанию
    private val commentsCrud: NoteComment = NoteComment(mutableListOf())

    fun add(note: Note) = notesCrud.create(note)

    fun get() = notesCrud.read()

    fun edit(noteId: Int, note: Note): Boolean {
        return notesCrud.update(note.copy(id = noteId))
    }

    fun delete(id: Int, note: Note): Boolean {
        val commentsForNote = commentsCrud.getComments(CommentNote(noteId = id))
        if(!commentsCrud.storage.isEmpty()) {
            commentsForNote.forEach { it.isDeleted = true }
//            commentsForNote[id].isDeleted = true
        }
        return notesCrud.delete(note.copy(id = id))
    }

    fun getFriendsNotes(userId: Int, note: Note): MutableList<Note> {
        return notesCrud.getFriendsNotes(note.copy(userId = userId))
    }

    fun getById(id: Int, note: Note) = notesCrud.getById(note.copy(id = id))


    fun createComment(noteId: Int, comment: CommentNote): CommentNote {
        return commentsCrud.create(comment.copy(noteId = noteId))
    }

    fun getComment() = commentsCrud.read()

    fun editComment(id: Int, comment: CommentNote): Boolean {
        return commentsCrud.update(comment.copy(id = id))
    }

    fun deleteComment(id: Int, comment: CommentNote): Boolean {
        return commentsCrud.delete(comment.copy(id = id))
    }


    fun getComments(noteId: Int, comment: CommentNote): MutableList<CommentNote> {
        return commentsCrud.getComments(comment.copy(noteId = noteId))
    }

    fun restoreComment(id: Int, comment: CommentNote): Boolean {
        return commentsCrud.restoreComment(comment.copy(id = id))
    }

    fun clear() {
        notesCrud.clear()
        commentsCrud.clear()
    }
}
