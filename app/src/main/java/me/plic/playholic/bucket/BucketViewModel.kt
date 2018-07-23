package me.plic.playholic.bucket

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.bucket.adapter.BucketAdapter
import me.plic.playholic.data.Bucket
import java.util.*

class BucketViewModel : BaseObservable(){

    @Bindable
    var buckets : ObservableArrayList<Bucket> = ObservableArrayList()

    val adapter = BucketAdapter().apply {
        buckets.add(Bucket("제목1", Date(), "대학로 대대대극장"))
        buckets.add(Bucket("제목2", Date(), "대학로 대대대극장"))
        buckets.add(Bucket("제목3", Date(), "대학로 대대대극장"))

        addItems(buckets)
    }
}