package me.plic.playholic.ui.comment.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.Comment
import me.plic.playholic.databinding.ItemCommentBinding


class CommentViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemCommentBinding? = DataBindingUtil.bind(itemView)

    fun getClickObservable(item : Comment) : Observable<Comment> {
        return Observable.create { emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }
}