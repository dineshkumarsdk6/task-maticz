package com.task.maticz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.task.maticz.R
import com.task.maticz.databinding.LayoutFragmentIntro3Binding


class FragmentIntro3 : Fragment() {
    lateinit var binding: LayoutFragmentIntro3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = LayoutFragmentIntro3Binding.inflate(inflater, container, false)

        return binding.root
    }

}