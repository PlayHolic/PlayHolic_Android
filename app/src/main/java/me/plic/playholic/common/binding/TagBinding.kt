package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import com.moxun.tagcloudlib.view.TagCloudView
import com.moxun.tagcloudlib.view.TagsAdapter


@BindingAdapter("adapter")
fun bindTagAdapter(view : TagCloudView , adapter : TagsAdapter) {
    view.setAdapter(adapter)
    view.isNestedScrollingEnabled = false
}

class TagBinding {
}