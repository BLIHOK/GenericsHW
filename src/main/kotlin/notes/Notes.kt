package ru.netology.notes

import data.Note
import notes.Identifiable

class Notes<T>(
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

    fun getById(elementId: T): T? {
        for(i in storage){
            if(i?.equals(elementId) == true){
                return elementId
            }
        }
        return null
    }
}