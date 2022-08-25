package com.task.maticz.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.task.maticz.adapter.ViewPagerAdapter
import com.task.maticz.databinding.LayoutIntroBinding
import com.task.maticz.fragment.FragmentIntro1
import com.task.maticz.fragment.FragmentIntro2
import com.task.maticz.fragment.FragmentIntro3
import com.task.maticz.fragment.FragmentIntro4
import kotlinx.coroutines.*

class ActivityIntro : AppCompatActivity() {

    lateinit var binding: LayoutIntroBinding

    private val listFragment: ArrayList<Fragment> = ArrayList()
    private val listFragmentTitle: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewPager(binding.viewPager2)

        binding.imageViewBack.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })


        binding.textNext.setOnClickListener(View.OnClickListener {
            if (binding.textNext.text == "Get Started"){
                val intent = Intent(this@ActivityIntro, ActivityUserName::class.java)
                startActivity(intent)
                finish()
            } else {
                binding.viewPager2.currentItem = binding.viewPager2.currentItem + 1
            }
        })

        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val tab: TabLayout.Tab = binding.tabLayout.getTabAt(position)!!
                if (tab != null) {
                    tab.select()
                }

                if (position != 0) {
                    if (position == listFragmentTitle.size - 1) {
                        binding.textNext.text = "Get Started"
                    } else {
                        binding.textNext.text = "Next"
                    }
                }

            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })
    }

    private fun setupViewPager(viewPager: ViewPager2?) {

        listFragment.clear()

        val fragmentIntro1 = FragmentIntro1()
        listFragment.add(fragmentIntro1)

        val fragmentIntro2 = FragmentIntro2()
        listFragment.add(fragmentIntro2)

        val fragmentIntro3 = FragmentIntro3()
        listFragment.add(fragmentIntro3)

        val fragmentIntro4 = FragmentIntro4()
        listFragment.add(fragmentIntro4)

        listFragmentTitle.clear()
        listFragmentTitle.add("")
        listFragmentTitle.add("")
        listFragmentTitle.add("")
        listFragmentTitle.add("")

        val adapter = ViewPagerAdapter(this@ActivityIntro, listFragment)
        viewPager!!.adapter = adapter
        viewPager.isUserInputEnabled = false;

        TabLayoutMediator(
            binding.tabLayout, viewPager
        ) { tab: TabLayout.Tab, position: Int ->
            tab.text = listFragmentTitle[position]
        }.attach()
    }
}