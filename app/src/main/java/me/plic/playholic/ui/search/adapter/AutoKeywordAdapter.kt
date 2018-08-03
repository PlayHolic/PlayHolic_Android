package me.plic.playholic.ui.search.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.Filterable
import io.reactivex.subjects.PublishSubject
import me.plic.playholic.data.AutoKeyword
import me.plic.playholic.ui.search.viewHolder.AutoKeywordViewHolder

class AutoKeywordAdapter(context: Context?,
                         val resource: Int,
                         val itemList: MutableList<AutoKeyword>) : ArrayAdapter<AutoKeyword>(context, resource), Filterable {


    private var suggestions: MutableList<AutoKeyword> = mutableListOf() //auto complete keyword
    private var inputWord: String = "" //input Word

    private val clickSubject: PublishSubject<AutoKeyword> = PublishSubject.create()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View

        if (convertView == null) {
            view = LayoutInflater.from(parent?.context).inflate(resource, parent, false)

            AutoKeywordViewHolder(view).apply {
                bindAutoKeywordItemViewModel(getItem(position), inputWord)
                getClickObservable(getItem(position)).subscribe(clickSubject)
                view.tag = this
            }

        } else {
            convertView.tag as AutoKeywordViewHolder
            view = convertView
        }
        return view
    }


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): Filter.FilterResults {

                if (constraint != null) {
                    suggestions.clear()
                    inputWord = constraint.toString()

                    for (auto in itemList) {
                        if (auto.keyword.contains(inputWord)) {
                            suggestions.add(auto)
                        }
                    }

                    return FilterResults().apply {
                        values = suggestions
                        count = suggestions.size
                    }
                }

                return FilterResults()
            }

            override fun publishResults(constraint: CharSequence?, results: Filter.FilterResults?) {
                if (results != null && results.count > 0) {

                    this@AutoKeywordAdapter.clear()

                    (results.values as MutableList<*>?)?.also {
                        for (auto in it) {
                            if (auto is AutoKeyword) {
                                add(auto)
                            }
                        }
                        notifyDataSetChanged()
                    }
                }
            }
        }
    }
}
