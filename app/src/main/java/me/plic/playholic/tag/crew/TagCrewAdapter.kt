package me.plic.playholic.tag.crew

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.moxun.tagcloudlib.view.TagsAdapter

class TagCrewAdapter : TagsAdapter() {

    private val tagList: ArrayList<String> = ArrayList()

    fun updateItems(items: ArrayList<String>) {
        tagList.clear()
        tagList.addAll(items)
    }

    override fun getPopularity(position: Int): Int {
        return position % 3
    }

    override fun onThemeColorChanged(view: View?, themeColor: Int) {
        if (view is TextView) {
            view.setTextColor(themeColor)
        }
    }

    override fun getView(context: Context?, position: Int, parent: ViewGroup?): View {
        return TextView(context).apply {
            gravity = Gravity.CENTER
            text = tagList[position]
        }
    }

    override fun getItem(position: Int): String {
        return tagList[position]
    }

    override fun getCount(): Int {
        return tagList.size
    }
}