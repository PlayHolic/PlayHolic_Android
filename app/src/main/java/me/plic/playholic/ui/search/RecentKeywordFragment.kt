package me.plic.playholic.ui.search

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.realm.Realm
import io.realm.Sort
import io.realm.kotlin.where
import me.plic.playholic.R
import me.plic.playholic.data.RecentKeyword
import me.plic.playholic.data.addRecentKeyword
import me.plic.playholic.data.deleteRecentKeyword
import me.plic.playholic.databinding.LayoutKeywordBinding
import me.plic.playholic.ui.search.adapter.RecentKeywordAdapter

class RecentKeywordFragment : Fragment() {

    private lateinit var binding: LayoutKeywordBinding
    val realm: Realm = Realm.getDefaultInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (realm.where<RecentKeyword>().findAll().size == 0) {
            for (i in 1..10) {
                addRecentKeyword(realm, i, "검색어 $i")
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.layout_keyword, container, false)

        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerSearch.apply {
            val dataSet = realm.where<RecentKeyword>().sort(RecentKeyword::date.name, Sort.DESCENDING).findAll()

            adapter = RecentKeywordAdapter(dataSet, true).apply {
                deleteClickSubject.subscribe {
                    deleteRecentKeyword(realm, it)
                }
            }
        }
    }
}