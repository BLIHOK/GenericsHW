package ru.netology.notes

import Exceptions.NoteExistException
import notes.Identifiable


open class Notes<T, E>(
    override val storage: MutableList<T>,
    override var deletedStorage: MutableList<T>,
) : CRUD<T, Identifiable> {

    override fun create(element: T) {
        storage.add(element)
    }

    override fun read(): MutableList<T> {
        return storage
    }

    override fun update(element: T): Boolean {
        for ((i, b) in storage.withIndex()) {
            storage[i] = element
            return true
        }
        return false
    }

    override fun delete() {
        deletedStorage.addAll(storage)
        storage.clear()
    }

    fun getById(elementId: E): T {
        for (i in storage.indices) {
            for(j in storage.indices){
                if(j == elementId){
                    return storage[j]
                }
            }
        }
        return throw NoteExistException("This Id not exist")
    }

    fun getFriendsNotes(elementId: E): T {
        for (i in storage.indices) {
            for(j in storage.indices){
                if(j == elementId){
                    return storage[j]
                }
            }
        }
        return throw NoteExistException("This Id not exist")
    }

    fun clear(){
        storage.clear()
        deletedStorage.clear()
    }
}

