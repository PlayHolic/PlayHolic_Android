package me.plic.playholic.common.view

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View


class ItemOffsetDecorator(private val itemOffset: Int, private val spanCount: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State?) {

        val frameWidth = ((parent.width - itemOffset * (spanCount - 1)) / spanCount)
        val padding = parent.width / spanCount - frameWidth
        val itemPosition = parent.getChildAdapterPosition(view)
        val columnPosition = itemPosition % spanCount

        outRect.top = itemOffset
        outRect.bottom = itemOffset

        when (columnPosition) {
            0 -> {
                outRect.left = 0
                outRect.right = padding
            }
            spanCount - 1 -> {
                outRect.right = 0
                outRect.left = padding
            }
            spanCount - 2 -> {
                outRect.left = itemOffset / 2
                outRect.right = itemOffset - padding
            }
            else -> {
                outRect.left = itemOffset / 2
                outRect.right = itemOffset / 2
            }
        }
    }
}