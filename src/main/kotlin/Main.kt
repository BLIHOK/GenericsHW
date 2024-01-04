import data.CommentNote
import data.Note
import services.NoteService

fun main() {

    val note1 = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
//    val note2 = Note("2st note", 0, 2023, "Friend1", id = 1, isDeleted = false)
//    val note3 = Note("3st note", 1, 2023, "Friend1", id = 2, isDeleted = false)
//    val noteUpdate = Note("Updated note", 0, 2023, "Friend4", id = 0, isDeleted = false)
    NoteService.create(note1)
//    NoteService.create(note2)
//    NoteService.create(note3)
//    println(NoteService.readNotes())
//    NoteService.update(0, noteUpdate)
    println(NoteService.readNotes())
//    NoteService.delete(0,Note())
//    println(NoteService.readNotes())
//    println( NoteService.getFriends(0, Note()))
//    println(NoteService.readNotes())
//    println(NoteService.getById(2, Note()))

    val com1 = CommentNote("1st comment", 0, 2023, "Friend1", id = 1, isDeleted = false)
//    val com2 = CommentNote("2st comment", 0, 2023, "Friend2", id = 2, isDeleted = false)
//    val com3 = CommentNote("3st comment", 0, 2023, "Friend3", id = 2, isDeleted = false)
//    val updatedCom = CommentNote("4st comment", 0, 2023, "Friend4", id = 0, isDeleted = true)
    NoteService.create(0, com1)
//    NoteService.create(0, com2)
//    NoteService.create(1, com3)
    NoteService.delete(0, Note())
    println(NoteService.readNotes())

//    println(NoteService.readComments())
//    NoteService.update(1, updatedCom)
//    println(NoteService.readComments())
    NoteService.delete(1, CommentNote())
    println(NoteService.readComments())
//    NoteService.delete(2, CommentNote())
//    println(NoteService.readComments())
//    NoteService.restoreComment(1, CommentNote())
//    println(NoteService.readComments())

}
