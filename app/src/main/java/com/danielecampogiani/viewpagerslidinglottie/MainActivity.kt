package com.danielecampogiani.viewpagerslidinglottie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.danielecampogiani.viewpagerslidinglottie.extensions.Half
import com.danielecampogiani.viewpagerslidinglottie.extensions.setupWithViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {
            setup()
        }
    }

    private fun setup() {
        val adapter = Adapter(getItems(), supportFragmentManager)
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        header.setupWithViewPager(pager, Half)
    }

    fun getItems() = listOf(
            Item("Beer"),
            Item("Cocktail"),
            Item("Soda")
    )
}
