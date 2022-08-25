package com.task.maticz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.task.maticz.R
import com.task.maticz.databinding.LayoutFragmentIntro4Binding


class FragmentIntro4 : Fragment() {
    lateinit var binding: LayoutFragmentIntro4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = LayoutFragmentIntro4Binding.inflate(inflater, container, false)

        return binding.root
    }

}