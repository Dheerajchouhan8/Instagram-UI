package com.example.instagramp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramp.databinding.FragmentProfileBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy


class profileFragment : Fragment() {

    lateinit var binding:FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        binding.viewPager.adapter = ViewPagerAdapter(childFragmentManager,lifecycle)

        TabLayoutMediator(binding.tabLayout,binding.viewPager,object :
            TabConfigurationStrategy {
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                if (position==0){
                    tab.setIcon(R.drawable.baseline_grid_on_24)
                }
                else{
                    tab.setIcon(R.drawable.baseline_perm_contact_calendar_24)
                }
            }
        }).attach()

        return binding.root
    }



}
