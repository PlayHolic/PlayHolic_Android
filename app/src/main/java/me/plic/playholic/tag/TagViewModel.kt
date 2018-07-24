package me.plic.playholic.tag

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.tag.cast.TagCastAdapter
import me.plic.playholic.tag.crew.TagCrewAdapter

class TagViewModel : BaseObservable() {

    @Bindable
    val casts : ObservableArrayList<String> = ObservableArrayList()

    @Bindable
    val crews : ObservableArrayList<String> = ObservableArrayList()

    val castAdapter = TagCastAdapter().apply {
        casts.add("정선아")
        casts.add("홍광호")
        casts.add("옥주현")
        casts.add("조승우")
        casts.add("손승원")
        casts.add("브래드 리틀")
        casts.add("박강현")
        casts.add("문태유")
        casts.add("김성철")

        updateItems(casts)
    }

    val crewAdapter = TagCrewAdapter().apply {
        crews.add("매튜 가디너")
        crews.add("데이비스 스완")
        crews.add("박소영")
        crews.add("장진")
        crews.add("추민주")
        crews.add("존 캐어드")
        crews.add("브래드 리틀")
        crews.add("넬 발라반")
        crews.add("김태용")
        crews.add("트레버 넌")

        updateItems(crews)
    }


}