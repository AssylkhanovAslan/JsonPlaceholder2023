package kz.tutorial.jsonplaceholdertypicode.presentation.utils

fun interface ClickListener<T : Any> {
    fun onClick(item: T)
}