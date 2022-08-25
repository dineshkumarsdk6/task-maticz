package com.task.maticz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.task.maticz.R
import com.task.maticz.databinding.LayoutFragmentIntro1Binding


class FragmentIntro1 : Fragment() {
    lateinit var binding: LayoutFragmentIntro1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = LayoutFragmentIntro1Binding.inflate(inflater, container, false)

        return binding.root
    }

}