package com.mokelab.demo.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokelab.demo.viewpager.databinding.PagerFragmentBinding

/**
 * PagerFragment shows ViewPager
 */
class PagerFragment : Fragment() {
    private var binding : PagerFragmentBinding? = null
    companion object Factory {
        @JvmStatic fun newInstance() : PagerFragment {
            val fragment = PagerFragment()

            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = PagerFragmentBinding.inflate(inflater, container, false)
        this.binding!!.viewPager.adapter = PagerAdapter(childFragmentManager)
        return this.binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this.binding?.unbind()
    }
}