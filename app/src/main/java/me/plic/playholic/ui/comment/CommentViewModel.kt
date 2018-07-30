package me.plic.playholic.ui.comment

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import android.util.Log
import me.plic.playholic.data.Comment
import me.plic.playholic.ui.comment.adapter.CommentAdapter
import java.util.*

class CommentViewModel : BaseObservable(){

    @Bindable
    val comments : ObservableArrayList<Comment> = ObservableArrayList()

    val adapter = CommentAdapter().apply {

        for (i in 1..10) {
            comments.add(Comment("제목 $i", Date(), "" +
                    "살고 싶은 자와 스스로 삶을 포기하려 했던 자의 이야기를 보면서 웃기도 하고 " +
                    "눈물이 흐르기도 하고 가슴 찡하기도 했지만 결국 나 스스로를 돌아보게 되는 뮤지컬 이었다." ))
            Log.d("Comment", "date is null? ${comments[i-1].date}")
        }

        addItems(comments)
    }
}