package kz.tutorial.jsonplaceholdertypicode.presentation.comments

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kz.tutorial.jsonplaceholdertypicode.R
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment
import kz.tutorial.jsonplaceholdertypicode.presentation.utils.EmailClickListener

class CommentViewHolder(
    itemView: View,
    private val emailClickListener: EmailClickListener
) : ViewHolder(itemView) {
    private val tvCommentName: TextView = itemView.findViewById(R.id.tv_comment_name)
    private val tvEmail: TextView = itemView.findViewById(R.id.tv_email)
    private val tvBody: TextView = itemView.findViewById(R.id.tv_body)

    fun bind(comment: Comment) {
        tvCommentName.text = comment.name
        tvEmail.text = comment.email
        tvBody.text = comment.body
        tvEmail.setOnClickListener { emailClickListener.onEmailClick(comment.email) }
    }
}