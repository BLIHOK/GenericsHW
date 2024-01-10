package services

import data.CommentNote
import data.Note
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class NoteServiceTest {

    @BeforeEach
    fun clearBeforeTest() {
        NoteService.clear()
    }

    @Test
    fun create() {
        val note = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        val createdNote = NoteService.add(note)
        assertEquals(note.id, createdNote.id)
    }

    @Test
    fun readNotes() {
        val note = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        NoteService.add(note)
        val readNote = NoteService.get()
        assertEquals(mutableListOf(note), readNote)
    }

    @Test
    fun update() {
        val note = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        val updateNote = Note("updated note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        NoteService.add(note)
        val noteUpdate = NoteService.edit(0, updateNote)
        assertEquals(true, noteUpdate)

    }

    @Test
    fun delete() {
        val note = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        NoteService.add(note)
        val deletedNote = NoteService.delete(0, note)
        assertEquals(true, deletedNote)
    }

    @Test
    fun getFriends() {
        val note1 = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        val note2 = Note("2st note", 0, 2023, "Friend1", id = 1, isDeleted = false)
        NoteService.add(note1)
        NoteService.add(note2)
        val getFriend = NoteService.getFriendsNotes(0, Note())
        assertEquals(mutableListOf(note1, note2), getFriend)
    }

    @Test
    fun getById() {
        val note1 = Note("1st note", 0, 2023, "Friend1", id = 0, isDeleted = false)
        val note2 = Note("2st note", 0, 2023, "Friend1", id = 1, isDeleted = false)
        NoteService.add(note1)
        NoteService.add(note2)
        val get = NoteService.getById(1, Note())
        assertEquals(note2, get)
    }

    @Test
    fun testCreate() {
        val note1 = Note("1st note", 1, 2023, "Friend1", id = 1, isDeleted = false)
        val com1 = CommentNote("1st comment", 0, 2023, "Friend1", id = 0, isDeleted = false)
        val createdNote = NoteService.createComment(1, com1)
        assertEquals(note1.id, createdNote.noteId)
    }

    @Test
    fun readComments() {
        val com1 = CommentNote("1st comment", 0, 2023, "Friend1", id = 0, isDeleted = false)
        NoteService.createComment(0, com1)
        val read = NoteService.getComment()
        assertEquals(mutableListOf(com1), read)
    }

    @Test
    fun testUpdate() {
        val com1 = CommentNote("3st comment", 0, 2023, "Friend3", id = 0, isDeleted = false)
        val updatedCom = CommentNote("4st comment", 0, 2023, "Friend4", id = 0, isDeleted = true)
        NoteService.createComment(0, com1)
        val update = NoteService.editComment(0, updatedCom)
        assertEquals(true, update)
    }

    @Test
    fun testDelete() {
        val com1 = CommentNote("3st comment", 0, 2023, "Friend3", id = 0, isDeleted = false)
        NoteService.createComment(0, com1)
        val del = NoteService.deleteComment(0, com1)
        assertEquals(true, del)
    }

    @Test
    fun getComments() {
        val com1 = CommentNote("1st comment", 0, 2023, "Friend3", id = 0, isDeleted = false)
        val com2 = CommentNote("2st comment", 0, 2023, "Friend3", id = 0, isDeleted = false)
        NoteService.createComment(0, com1)
        NoteService.createComment(0, com2)
        val get = NoteService.getComments(0, CommentNote())
        assertEquals(mutableListOf(com1, com2), get)
    }

    @Test
    fun restoreComment() {
        val com1 = CommentNote("1st comment", 0, 2023, "Friend3", id = 0, isDeleted = true)
        NoteService.createComment(0, com1)
        val restore = NoteService.restoreComment(0, CommentNote())
        assertEquals(false, restore)
    }
}