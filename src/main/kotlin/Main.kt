//import notes.NoteComment
import data.CommentNote
import data.Note
import notes.NoteComment
import notes.Notes

fun main() {

    val note = Notes(mutableListOf())
    note.create(Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false))
    note.create(Note("2st note", 0, 2023, "Friend2", id = 1, isDeleted = false))
//    println(note.read())

//    note.create(Note("3 note", 1, 2023,"My first note",id = 2, isDeleted = false))
//    println(note.read())

//    note.update(Note("3 note", 1, 2023,"My first note", id = 0))
//    println(note.read())

//    note.delete(Note(id = 0))
//    note.getFriendsNotes(Note(userId = 0))
//    println(note.read())
//    println(note.getById(Note(id = 1)))

    val comment = NoteComment<CommentNote>(mutableListOf())
//    comment.create(CommentNote("1st comment", 0, 2023,"My first comment", 0, false))
//    println(comment.read())
//    comment.delete()
//    println(comment.read())
//    comment.restoreComment()
//    println(comment.read())
//    comment.getComments(1)


}
