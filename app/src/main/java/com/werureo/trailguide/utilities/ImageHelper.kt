package com.werureo.trailguide.utilities

import android.content.Context

class ImageHelper {

    companion object {

        @JvmStatic
        fun getImageFromName(context: Context, name: String): Int =
                context.resources.getIdentifier(
                        name,
                        "drawable",
                        context.packageName
                )
    }
}