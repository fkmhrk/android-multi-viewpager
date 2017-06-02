package com.mokelab.demo.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * PagerItemFragment shows item view
 */
class PagerItemFragment : Fragment() {
    companion object Factory {
        @JvmStatic fun newInstance() : PagerItemFragment {
            val fragment = PagerItemFragment()

            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.pager_item_fragment, container, false)
    }
}