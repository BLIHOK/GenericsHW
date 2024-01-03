package services

//import exceptions.NoteExistException
import data.CommentNote
import data.Note
import notes.NoteComment
import notes.Notes

object NoteService {

    private val notesCrud: Notes = Notes(mutableListOf()) // Почему бы не задать значение по умолчанию
    private val commentsCrud: NoteComment = NoteComment(mutableListOf())

    fun create(note: Note) = notesCrud.create(note)

    fun readNotes() = notesCrud.read()

    fun update(noteId: Int, note: Note) {
        notesCrud.update(note.copy(id = noteId))
    }

    fun delete(id: Int, note: Note) {
        notesCrud.delete(note.copy(id = id))
        commentsCrud.delete(CommentNote().copy(isDeleted = true))
    }

    fun getFriends(userId: Int, note: Note) {
        notesCrud.getFriendsNotes(note.copy(userId = userId))
    }

    fun getById(id: Int, note: Note) = notesCrud.getById(note.copy(id = id))


    fun create(noteId: Int, comment: CommentNote) {
        commentsCrud.create(comment.copy(noteId = noteId))
    }

    fun readComments() = commentsCrud.read()

    fun update(id: Int, comment: CommentNote) {
        commentsCrud.update(comment.copy(id = id))

    }

    fun delete(id: Int, comment: CommentNote) {
        if (comment.copy().isDeleted == commentsCrud.delete(comment)) {
            commentsCrud.delete(comment.copy(id = id))
        } else println("wrong")
    }


    fun getComments(noteId: Int, comment: CommentNote) {
        commentsCrud.getComments(comment.copy(noteId = noteId))
    }

    fun restoreComment(id: Int, comment: CommentNote) {
        if (CommentNote(id = id).isDeleted == comment.isDeleted) {
            commentsCrud.restoreComment(comment.copy(id = id))
        } else {
            println("wrong")
        }
    }
}