package com.example.instagramp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagramp.databinding.FragmentProfileImageBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class ProfileImageFragment : Fragment() {
    lateinit var binding: FragmentProfileImageBinding
    val arrimages= ArrayList<ProfileImageModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileImageBinding.inflate(inflater,container,false)


        arrimages.apply {
            add(ProfileImageModel(R.drawable.aggresive_cat))
            add(ProfileImageModel(R.drawable.baby_fox))
            add(ProfileImageModel(R.drawable.cat))
            add(ProfileImageModel(R.drawable.cat_thief))
            add(ProfileImageModel(R.drawable.chilling))
            add(ProfileImageModel(R.drawable.panda))
            add(ProfileImageModel(R.drawable.duce))
            add(ProfileImageModel(R.drawable.fox))
            add(ProfileImageModel(R.drawable.game_boy))
            add(ProfileImageModel(R.drawable.happy_cat))
            add(ProfileImageModel(R.drawable.kid))
            add(ProfileImageModel(R.drawable.owl))
            add(ProfileImageModel(R.drawable.panda))
            add(ProfileImageModel(R.drawable.skating_panda))
            add(ProfileImageModel(R.drawable.party_bay))
            add(ProfileImageModel(R.drawable.singing_cat))
            add(ProfileImageModel(R.drawable.sleeping_boy))
            add(ProfileImageModel(R.drawable.playing_cat))
        }

        binding.recyclerProfileImages.layoutManager= GridLayoutManager(activity,3)

        binding.recyclerProfileImages.adapter = RecyclerProfileImageAdapter(arrimages)

        return binding.root
    }

}