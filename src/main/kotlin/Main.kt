import data.CommentNote
import data.Note
import notes.Identifiable
import ru.netology.notes.NoteComment
import ru.netology.notes.Notes
import javax.xml.stream.events.Comment

fun main() {

    val note= Notes<Note, Int>(storage = mutableListOf(), deletedStorage = mutableListOf())
    note.create(Note("1st note", 0, 2023,"My first note", 0, false))
//    println(note.read())
    note.update(Note("3 note", 1, 2023,"My first note", 0, false))
//    println(note.read())
//    note.delete()
//    println(note.read())
    println(note.getById(0))
    println(note.getFriendsNotes(0))

    val comment = NoteComment<CommentNote, Int>(mutableListOf(), mutableListOf())
    comment.create(CommentNote("1st comment", 0, 2023,"My first comment", 0, false))
    println(comment.read())
    comment.delete()
    println(comment.read())
    comment.restoreComment()
    println(comment.read())
    comment.getComments(1)


}
