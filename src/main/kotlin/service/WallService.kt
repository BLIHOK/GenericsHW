package ru.netology.service

import ru.netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()

    fun findById(id: Long): Post? {
        for (post in posts) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        TODO("Unimplemented")
    }

    fun removeById(id: Long): Boolean {
        // TODO: some action
        // return true
        TODO("Unimplemented")
    }

    fun likeById(id: Long) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }
}

