//import notes.NoteComment
import data.CommentNote
import data.Note
import notes.NoteComment
import services.NoteService

fun main() {

//    val note = Notes(mutableListOf())
//    note.create(Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false))
////    note.create(Note("2st note", 0, 2023, "Friend2", id = 1, isDeleted = false, commentNote = CommentNote()))
//    println(note.read())

//    note.create(Note("3 note", 1, 2023,"My first note",id = 2, isDeleted = false))
//    println(note.read())

//    note.update(Note("3 note", 1, 2023,"My first note", id = 0))
//    println(note.read())

//    note.delete(Note(id = 0))
//    note.getFriendsNotes(Note(userId = 0))
//    println(note.read())
//    println(note.getById(Note(id = 1)))

//    val comment = NoteComment(mutableListOf())
//    comment.create(CommentNote("1 comment", 0, 2023, "Friend 1 comm", 0, false))
//    comment.create(CommentNote("1st comment", 0, 2023,"My first comment", 1, false))
//    println(comment.read())
//    comment.delete(CommentNote(id = 0))
//    println(comment.read())
//    comment.restoreComment(CommentNote(noteId = 0))
//    println(comment.read())
//    comment.getComments(CommentNote(noteId = 0))

    val note1 = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
//    val note2 = Note("2st note", 0, 2023, "Friend1", id = 1, isDeleted = false)
//    val note3 = Note("3st note", 1, 2023, "Friend1", id = 2, isDeleted = false)
//    val noteUpdate = note1.copy(title = "Updated note")
    NoteService.create(note1)
//    NoteService.create(note2)
//    NoteService.create(note3)
//    println(NoteService.readNotes())
//    NoteService.update(0, noteUpdate)
//    println(NoteService.readNotes())
//    NoteService.delete(0,Note())
//    println(NoteService.readNotes())
//    NoteService.getFriends(0, Note())
//    println(NoteService.readNotes())
//    println(NoteService.getById(2, Note()))

    val com1 = CommentNote("1st comment", 0, 2023, "Friend1", id = 1, isDeleted = true)
//    val com2 = CommentNote("2st comment", 0, 2023, "Friend2", id = 1, isDeleted = false)
//    val com3 = CommentNote("3st comment", 0, 2023, "Friend3", id = 2, isDeleted = false)
//    val updatedCom = CommentNote("4st comment", 0, 2023, "Friend4", id = 0, isDeleted = true)
    NoteService.create(0, com1)
//    NoteService.delete(0,Note())
//    NoteService.create(0, com2)
//    NoteService.create(1, com3)
//    println(NoteService.readComments())
//    NoteService.update(1, updatedCom)
//    println(NoteService.readComments())
    NoteService.delete(1, CommentNote())
    println(NoteService.readComments())
//    NoteService.delete(1, CommentNote())
//    println(NoteService.readComments())
//    NoteService.restoreComment(1, CommentNote())
//    println(NoteService.readComments())

}
