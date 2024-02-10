package kz.tutorial.jsonplaceholdertypicode.presentation.post_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post
import kz.tutorial.jsonplaceholdertypicode.domain.entity.User
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPostPreviewCommentsUseCase
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPostUseCase
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetUserUseCase

class PostDetailsViewModel(
    private val postId: Int,
    private val getPostPreviewCommentsUseCase: GetPostPreviewCommentsUseCase,
    private val getPostUseCase: GetPostUseCase,
    private val getUserUseCase: GetUserUseCase,
) : ViewModel() {

    private val _postDetailsLiveData: MutableLiveData<Post> = MutableLiveData()
    val postDetailsLiveData: LiveData<Post> = _postDetailsLiveData

    private val _commentsLiveData: MutableLiveData<List<Comment>> = MutableLiveData()
    val commentsLiveData: LiveData<List<Comment>> = _commentsLiveData

    private val _userLiveData: MutableLiveData<User> = MutableLiveData()
    val userLiveData: LiveData<User> = _userLiveData

    init {
        getPostDetails()
        getPostComments()
    }

    private fun getPostDetails() {
        viewModelScope.launch {
            val postDetails = getPostUseCase.invoke(postId)
            getUserDetails(postDetails.userId)
            _postDetailsLiveData.value = postDetails
        }
    }

    private fun getPostComments() {
        viewModelScope.launch {
            val postComments = getPostPreviewCommentsUseCase.invoke(postId)
            _commentsLiveData.value = postComments
        }
    }

    private fun getUserDetails(userId: Int) {
        viewModelScope.launch {
            val user = getUserUseCase.invoke(userId)
            _userLiveData.value = user
        }
    }
}