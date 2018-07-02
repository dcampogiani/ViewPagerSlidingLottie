package com.danielecampogiani.viewpagerslidinglottie.extensions

import android.support.v4.view.ViewPager
import com.airbnb.lottie.LottieAnimationView

fun LottieAnimationView.setupWithViewPager(viewPager: ViewPager, scrollingStrategy: ScrollingStrategy = Full) {

    val adapter = viewPager.adapter
            ?: throw IllegalStateException("ViewPager adapter could not be null")

    val numPages = adapter.count

    viewPager.addOnPageScrolledListener { position, positionOffset, _ ->
        val progress = (position + positionOffset) / (numPages - 1)
        this.progress = scrollingStrategy.compute(progress)
    }
}

sealed class ScrollingStrategy {
    abstract fun compute(realProgress: Float): Float
}

object Full : ScrollingStrategy() {
    override fun compute(realProgress: Float) = realProgress
}

object Half : ScrollingStrategy() {
    override fun compute(realProgress: Float) = realProgress / 2
}