package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.graphics.Typeface
import android.support.v4.content.ContextCompat
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.TextView
import me.plic.playholic.R
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("searchDay")
fun dateToDayMonth(view: TextView, date: Date) {
    view.text = SimpleDateFormat("MM.dd", Locale.KOREAN).format(date)
}


@BindingAdapter("inputWord", "keyword")
fun changeColorInputWord(view: TextView, inputWord: String, keyword: String) {
    val wordIndex = keyword.indexOf(inputWord)

    if (wordIndex >= 0) {
        SpannableString(keyword).apply {
            setSpan(ForegroundColorSpan(ContextCompat.getColor(view.context, R.color.colorPrimary)),
                    wordIndex, wordIndex + inputWord.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

            setSpan(StyleSpan(Typeface.BOLD), wordIndex, wordIndex + inputWord.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

            view.text = this
        }
    }
}