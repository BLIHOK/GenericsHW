package ru.netology.notes

import data.Note

interface CRUD<T, Identifiable> {
    val storage: MutableList<T>
    var deletedStorage: MutableList<T>

    fun create(element: T) {
        storage.add(element)
    }

    fun read(): MutableList<T> {
        return storage
    }

    fun update(element: T): Boolean {
        for ((i, b) in storage.withIndex()) {
            storage[i] = element
            return true
        }
        return false
    }

    fun delete() {
        deletedStorage.addAll(storage)
        storage.clear()
    }
}