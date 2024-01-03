package data

import notes.Identifiable

data class Note(
    val title: String = "",
    val userId: Int = 0,
    var date: Int = 0,
    val text: String = "",
    override var id: Int = 0,
    override var isDeleted: Boolean = false,
) : Identifiable
