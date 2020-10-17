package com.example.recyclerview_in_recyclerview

data class PostList(
    var posts: List<Post>
)

data class Post(
    var id: Int,
    var title: String,
    var description: String
)