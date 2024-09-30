package dev.jullls.news.presentation.ui

data class Article(
    val id: Long,
    val image: Int,
    val name: String,
    val section: String,
    val author: Int,
    val information: String
)
