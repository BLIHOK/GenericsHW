package data

import notes.Identifiable

data class CommentNote(
    val title: String = "",
    val noteId: Int = 0,
    var date: Int = 0,
    val text: String = "",
    override val id: Int = 0,
    override val isDeleted: Boolean = false,
) : Identifiable
