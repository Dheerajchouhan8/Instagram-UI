package com.example.instagramp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val fm: FragmentManager,val lf:Lifecycle):FragmentStateAdapter(fm,lf){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position==0){
            ProfileImageFragment()
        }
        else {
            TagImagesFragment()
        }
    }


}