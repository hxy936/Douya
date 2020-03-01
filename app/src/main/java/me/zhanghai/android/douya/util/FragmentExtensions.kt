/*
 * Copyright (c) 2020 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.util

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.ArrayRes
import androidx.annotation.AttrRes
import androidx.annotation.BoolRes
import androidx.annotation.DimenRes
import androidx.annotation.Dimension
import androidx.annotation.IntegerRes
import androidx.annotation.InterpolatorRes
import androidx.fragment.app.Fragment
import me.zhanghai.android.douya.R

fun Fragment.getBoolean(@BoolRes id: Int) = requireContext().getBoolean(id)

fun Fragment.getDimension(@DimenRes id: Int) = requireContext().getDimension(id)

fun Fragment.getDimensionPixelOffset(@DimenRes id: Int) =
    requireContext().getDimensionPixelOffset(id)

fun Fragment.getDimensionPixelSize(@DimenRes id: Int) = requireContext().getDimensionPixelSize(id)

fun Fragment.getFloat(@DimenRes id: Int) = requireContext().getFloat(id)

fun Fragment.getInteger(@IntegerRes id: Int) = requireContext().getInteger(id)

fun Fragment.getInterpolator(@InterpolatorRes id: Int) = requireContext().getInterpolator(id)

fun Fragment.getStringArray(@ArrayRes id: Int) = requireContext().getStringArray(id)

fun Fragment.getBooleanByAttr(@AttrRes attr: Int) = requireContext().getBooleanByAttr(attr)

fun Fragment.getColorByAttr(@AttrRes attr: Int) = requireContext().getColorByAttr(attr)

fun Fragment.getColorStateListByAttr(@AttrRes attr: Int) =
    requireContext().getColorStateListByAttr(attr)

fun Fragment.getDimensionByAttr(@AttrRes attr: Int) = requireContext().getDimensionByAttr(attr)

fun Fragment.getDimensionPixelOffsetByAttr(@AttrRes attr: Int) =
    requireContext().getDimensionPixelOffsetByAttr(attr)

fun Fragment.getDimensionPixelSizeByAttr(@AttrRes attr: Int): Int =
    requireContext().getDimensionPixelSizeByAttr(attr)

fun Fragment.getDrawableByAttr(@AttrRes attr: Int) =
    requireContext().getDrawableByAttr(attr)

@Dimension
fun Fragment.dpToDimension(@Dimension(unit = Dimension.DP) dp: Float) =
    requireContext().dpToDimension(dp)

@Dimension
fun Fragment.dpToDimension(@Dimension(unit = Dimension.DP) dp: Int) =
    requireContext().dpToDimension(dp)

@Dimension
fun Fragment.dpToDimensionPixelOffset(@Dimension(unit = Dimension.DP) dp: Float) =
    requireContext().dpToDimensionPixelOffset(dp)

@Dimension
fun Fragment.dpToDimensionPixelOffset(@Dimension(unit = Dimension.DP) dp: Int) =
    requireContext().dpToDimensionPixelOffset(dp)

@Dimension
fun Fragment.dpToDimensionPixelSize(@Dimension(unit = Dimension.DP) dp: Float) =
    requireContext().dpToDimensionPixelSize(dp)

@Dimension
fun Fragment.dpToDimensionPixelSize(@Dimension(unit = Dimension.DP) dp: Int) =
    requireContext().dpToDimensionPixelSize(dp)

val Fragment.shortAnimTime
    get() = requireContext().shortAnimTime

val Fragment.mediumAnimTime
    get() = requireContext().mediumAnimTime

val Fragment.longAnimTime
    get() = requireContext().longAnimTime

fun Fragment.showToast(textRes: Int, duration: Int = Toast.LENGTH_SHORT) =
    requireContext().showToast(textRes, duration)

fun Fragment.showToast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) =
    requireContext().showToast(text, duration)

fun Fragment.startActivitySafe(intent: Intent, options: Bundle? = null) {
    try {
        startActivity(intent, options)
    } catch (e: ActivityNotFoundException) {
        showToast(R.string.activity_not_found)
    }
}

fun Fragment.startActivityForResultSafe(intent: Intent, requestCode: Int, options: Bundle? = null) {
    try {
        startActivityForResult(intent, requestCode, options)
    } catch (e: ActivityNotFoundException) {
        showToast(R.string.activity_not_found)
    }
}
