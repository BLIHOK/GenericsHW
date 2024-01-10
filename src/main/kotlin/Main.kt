import data.CommentNote
import data.Note
import services.NoteService

fun main() {

    val note1 = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
//    val note2 = Note("2st note", 0, 2023, "Friend1", id = 1, isDeleted = false)
//    val note3 = Note("3st note", 1, 2023, "Friend1", id = 2, isDeleted = false)
//    val noteUpdate = Note("Updated note", 0, 2023, "Friend4", id = 0, isDeleted = false)
    NoteService.add(note1)
//    NoteService.add(note2)
//    NoteService.add(note3)
//    println(NoteService.get())
//    NoteService.edit(0, noteUpdate)
    println(NoteService.get())
    NoteService.delete(0,Note())
    println(NoteService.get())
//    println( NoteService.getFriendsNotes(0, Note()))
//    println(NoteService.get())
//    println(NoteService.getById(2, Note()))

    val com1 = CommentNote("1st comment", 0, 2023, "Friend1", id = 1, isDeleted = false)
    val com2 = CommentNote("2st comment", 0, 2023, "Friend2", id = 2, isDeleted = false)
////    val com3 = CommentNote("3st comment", 0, 2023, "Friend3", id = 2, isDeleted = false)
////    val updatedCom = CommentNote("4st comment", 0, 2023, "Friend4", id = 0, isDeleted = true)
    NoteService.createComment(0, com1)
    NoteService.createComment(0, com2)
////    NoteService.createComment(1, com3)
    println(NoteService.getComment())
    NoteService.delete(0, Note())
    println(NoteService.get())
//
    println(NoteService.getComment())
////    NoteService.editComment(1, updatedCom)
//    println(NoteService.getComment())
//    NoteService.deleteComment(1, CommentNote())
//    println(NoteService.getComment())
//    NoteService.deleteComment(2, CommentNote())
//    println(NoteService.getComment())
    NoteService.restoreComment(1, CommentNote())
    println(NoteService.getComment())

}
