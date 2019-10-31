package com.juancarlos.tabinthemiddle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.petroperushipment.ui.receptionOrder.tabsReceptionOrder.TabAttachments
import com.example.petroperushipment.ui.receptionOrder.tabsReceptionOrder.TabCompartments
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val fragmentPartOne: Fragment = TabCompartments()
    private val fragmentPartTwo: Fragment = TabAttachments()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = TabReceptionOrderAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        sectionsPagerAdapter.addFragment(fragmentPartOne,"1")
        sectionsPagerAdapter.addFragment(fragmentPartTwo,"2")
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

    }
}
