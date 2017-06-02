package com.mokelab.demo.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Pager Adapter
 */
class PagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return PagerItemFragment.newInstance()
    }

    override fun getCount(): Int {
        return 4
    }
}