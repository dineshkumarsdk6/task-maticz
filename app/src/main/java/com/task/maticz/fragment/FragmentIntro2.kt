package com.task.maticz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.task.maticz.R
import com.task.maticz.databinding.LayoutFragmentIntro2Binding


class FragmentIntro2 : Fragment() {
    lateinit var binding: LayoutFragmentIntro2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = LayoutFragmentIntro2Binding.inflate(inflater, container, false)

        return binding.root
    }

}