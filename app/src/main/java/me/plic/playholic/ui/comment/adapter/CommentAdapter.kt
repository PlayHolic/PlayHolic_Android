package me.plic.playholic.ui.comment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.reactivex.subjects.PublishSubject
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Comment
import me.plic.playholic.ui.comment.viewHolder.CommentViewHolder

class CommentAdapter : BaseRecyclerViewAdapter<me.plic.playholic.data.Comment, CommentViewHolder>() {

    val clickSubject : PublishSubject<Comment> = PublishSubject.create()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        return CommentViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_comment, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        getItem(position).let {
            holder.getClickObservable(it).subscribe(clickSubject)
        }
    }
}