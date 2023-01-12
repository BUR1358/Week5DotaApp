package com.example.week5DotaApp.fragments.contract

import androidx.annotation.StringRes

interface HasCustomTitle {

    @StringRes
    fun getTitleRes(): Int

}