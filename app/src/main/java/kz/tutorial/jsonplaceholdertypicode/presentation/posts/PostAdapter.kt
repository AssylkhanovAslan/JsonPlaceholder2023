package kz.tutorial.jsonplaceholdertypicode.presentation.posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kz.tutorial.jsonplaceholdertypicode.domain.Post
import kz.tutorial.jsonplaceholdertypicode.R
import kz.tutorial.jsonplaceholdertypicode.presentation.utils.ClickListener

class PostAdapter(private val layoutInflater: LayoutInflater) :
    RecyclerView.Adapter<PostViewHolder>() {

    private val posts: MutableList<Post> = mutableListOf()
    var listener: ClickListener<Post>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = layoutInflater.inflate(R.layout.item_post, parent, false)

        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.bind(post)
        holder.itemView.setOnClickListener {
            listener?.onClick(post)
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    fun setData(newData: List<Post>) {
        notifyItemRangeRemoved(0, posts.size)
        posts.clear()
        posts.addAll(newData)
        notifyItemRangeInserted(0, posts.size)
    }
}

class PostViewHolder(itemView: View) : ViewHolder(itemView) {
    private var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
    private var tvBody: TextView = itemView.findViewById(R.id.tv_body)

    fun bind(post: Post) {
        tvTitle.text = post.title
        tvBody.text = post.body
    }
}