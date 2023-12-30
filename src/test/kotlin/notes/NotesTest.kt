package notes


import Exceptions.NoteExistException
import data.Note
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NotesTest {

    @Test
    fun create() {
        val storage: MutableList<Note> = mutableListOf()
        val element = Note("1st note", 0, 2023, "My first note", 0, false)
        storage.add(element)
        assertEquals(element, storage.first())
    }

    @Test
    fun read() {
        val storage: MutableList<Note> = mutableListOf()
        val element = Note("1st note", 0, 2023, "My first note", 0, false)
        storage.add(element)
        assertEquals(element, storage.first())
    }

    @Test
    fun update() {
        val storage: MutableList<Note> = mutableListOf(Note("1st note", 0, 2023, "My first note", 0, false))
        val element = Note("1st note", 0, 2023, "My first note", 0, false)

        for ((i, b) in storage.withIndex()) {
            storage[i] = element

            assertEquals(storage.first(), element)
        }
    }

    @Test
    fun delete() {
        val storage: MutableList<Note> = mutableListOf(Note("1st note", 0, 2023, "My first note", 0, false))
        var deletedStorage: MutableList<Note> = mutableListOf()
        deletedStorage.addAll(storage)
        storage.clear()
        assertEquals(mutableListOf(), storage)
    }


    @org.junit.Test(expected = NoteExistException::class)
    fun getById() {
        val storage: MutableList<Note> = mutableListOf(Note("1st note", 0, 2023, "My first note", 0, false))
        val elementId: Int = 1
        assertEquals(true, storage[1].noteId == elementId)
    }

    @Test
    fun getFriendsNotes() {
        val storage: MutableList<Note> = mutableListOf(Note("1st note", 0, 2023, "My first note", 0, false))
        val elementId = 0
        assertEquals(true, storage[0].noteId == elementId)
    }

}