package me.plic.playholic.bucket

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Bucket
import java.util.*

class BucketItemViewModel(bucket : Bucket) : BaseObservable() {

    val title : ObservableField<String> = ObservableField()
    val date : ObservableField<Date> = ObservableField()
    val location : ObservableField<String> = ObservableField()

    init{
        title.set(bucket.title)
        date.set(bucket.date)
        location.set(bucket.location)
    }
}