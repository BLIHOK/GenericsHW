package notes

import data.CommentNote
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NoteCommentTest {

    @Test
    fun create() {
        val storage = mutableListOf<CommentNote>()
        val element = CommentNote("1st comment", 0, 2023, "My first comment", 0, false)
        storage.add(element)
        assertEquals(element, storage.first())
    }

    @Test
    fun read() {
        val storage = mutableListOf<CommentNote>()
        val element = CommentNote("1st comment", 0, 2023, "My first comment", 0, false)
        storage.add(element)
        assertEquals(element, storage.first())
    }

    @Test
    fun update() {
        val storage = mutableListOf(CommentNote("1st comment", 0, 2023, "My first comment", 0, false))
        val element = CommentNote("1st comment", 0, 2023, "My first comment", 0, false)

        for ((i, b) in storage.withIndex()) {
            storage[i] = element

            assertEquals(storage.first(), element)
        }
    }

    @Test
    fun delete() {
        val storage = mutableListOf(CommentNote("1st comment", 0, 2023, "My first comment", 0, false))
        val deletedStorage: MutableList<CommentNote> = mutableListOf()
        deletedStorage.addAll(storage)
        storage.clear()
        kotlin.test.assertEquals(mutableListOf(), storage)

    }

    @Test
    fun getComments() {
        val storage = mutableListOf(CommentNote("1st comment", 0, 2023, "My first comment", 0, false))
        assertEquals(true, storage.contains(CommentNote()))
    }

    @Test
    fun restoreComment() {
        val storage = mutableListOf(CommentNote("1st comment", 0, 2023, "My first comment", 0, false))
        val deletedStorage: MutableList<CommentNote> = mutableListOf()
        deletedStorage.addAll(storage)
        assertEquals(storage, deletedStorage)
    }
}