package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import com.moxun.tagcloudlib.view.TagCloudView
import me.plic.playholic.R
import me.plic.playholic.tag.TagViewModel


@BindingAdapter("adapter")
fun bindTagAdapter(view: TagCloudView, viewModel: TagViewModel) {
    view.isNestedScrollingEnabled = false

    when (view.id) {
        R.id.tag_cast -> view.setAdapter(viewModel.castAdapter)
        R.id.tag_crew -> view.setAdapter(viewModel.crewAdapter)
    }
}

class TagBinding {
}