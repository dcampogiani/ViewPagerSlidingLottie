package com.danielecampogiani.viewpagerslidinglottie.extensions

import android.support.v4.view.ViewPager

fun ViewPager.addOnPageScrolledListener(listener: (position: Int, positionOffset: Float, positionOffsetPixels: Int) -> Unit) {
    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            listener(position, positionOffset, positionOffsetPixels)
        }

        override fun onPageSelected(position: Int) {}
    })
}