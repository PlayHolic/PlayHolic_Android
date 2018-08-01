package me.plic.playholic.ui.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.reactivex.subjects.PublishSubject
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import me.plic.playholic.R
import me.plic.playholic.data.RecentKeyword
import me.plic.playholic.ui.search.viewHolder.RecentKeywordViewHolder

class RecentKeywordAdapter(data: OrderedRealmCollection<RecentKeyword>?, autoUpdate: Boolean)
    : RealmRecyclerViewAdapter<RecentKeyword, RecentKeywordViewHolder>(data, autoUpdate) {


    val clickSubject: PublishSubject<RecentKeyword> = PublishSubject.create()
    val deleteClickSubject: PublishSubject<Int> = PublishSubject.create()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentKeywordViewHolder {
        return RecentKeywordViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_keyword_recent, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecentKeywordViewHolder, position: Int) {
        holder.apply {
            getItem(position)?.let {
                bindKeywordItemViewModel(it)
                getClickObservable(it).subscribe(clickSubject)
                getDeleteClickObservable(it.id).subscribe(deleteClickSubject)
            }
        }
    }
}