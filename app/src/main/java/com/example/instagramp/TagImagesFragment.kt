package com.example.instagramp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.instagramp.databinding.FragmentTagImagesBinding


class TagImagesFragment : Fragment() {
    lateinit var binding:FragmentTagImagesBinding

    val arrTagImg = ArrayList<TagImgModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentTagImagesBinding.inflate(inflater,container,false)


        arrTagImg.apply {
            add(TagImgModel(R.drawable.aggresive_cat))
            add(TagImgModel(R.drawable.baby_fox))
            add(TagImgModel(R.drawable.cat))
            add(TagImgModel(R.drawable.cat_thief))
            add(TagImgModel(R.drawable.chilling))
            add(TagImgModel(R.drawable.panda))
            add(TagImgModel(R.drawable.duce))
            add(TagImgModel(R.drawable.fox))
            add(TagImgModel(R.drawable.game_boy))
            add(TagImgModel(R.drawable.happy_cat))
            add(TagImgModel(R.drawable.kid))
            add(TagImgModel(R.drawable.owl))
            add(TagImgModel(R.drawable.panda))
            add(TagImgModel(R.drawable.skating_panda))
            add(TagImgModel(R.drawable.party_bay))
            add(TagImgModel(R.drawable.singing_cat))
            add(TagImgModel(R.drawable.sleeping_boy))
            add(TagImgModel(R.drawable.playing_cat))
        }

        binding.RecTagImg.layoutManager = GridLayoutManager(activity,2)

        binding.RecTagImg.adapter = RecyclerTagImgAdapter(arrTagImg)

        return binding.root
    }


}