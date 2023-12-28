import data.Note
import ru.netology.notes.Notes

fun main() {

    val nt= Notes<Note>(storage = mutableListOf(), deletedStorage = mutableListOf())
    nt.create(Note("1st note", 0, 2023,"My first note", 0, false))
//    nt.create(Note("2 note", 0, 2023,"My first note", 0, false))
    println(nt.read())
    nt.update(Note("3 note", 0, 2023,"My first note", 0, false))
    println(nt.read())
//    nt.delete()
//    println(nt.read())
    println(nt.getById(elementId = Note(id = 0)))


}
