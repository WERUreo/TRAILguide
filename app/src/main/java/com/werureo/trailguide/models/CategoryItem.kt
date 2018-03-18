package com.werureo.trailguide.models

import android.os.Parcel
import android.os.Parcelable


data class CategoryItem(
        val name: String,
        val image: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoryItem> {
        override fun createFromParcel(parcel: Parcel): CategoryItem {
            return CategoryItem(parcel)
        }

        override fun newArray(size: Int): Array<CategoryItem?> {
            return arrayOfNulls(size)
        }
    }

}