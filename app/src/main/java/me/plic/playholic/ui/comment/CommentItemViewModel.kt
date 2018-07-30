package me.plic.playholic.ui.comment

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Comment
import java.util.*

class CommentItemViewModel(comment : Comment) : BaseObservable() {

    val title : ObservableField<String> = ObservableField()
    val date : ObservableField<Date> = ObservableField()
    val content : ObservableField<String> = ObservableField()

    init {
        title.set(comment.title)
        date.set(comment.date)
        content.set(comment.content)
    }
}