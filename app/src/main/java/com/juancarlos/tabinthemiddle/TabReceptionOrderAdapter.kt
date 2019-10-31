package com.juancarlos.tabinthemiddle

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabReceptionOrderAdapter(private val context: Context, fm: FragmentManager): FragmentPagerAdapter(fm) {

    private var tabNames: ArrayList<String> = ArrayList()
    private var fragments: ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabNames[position]
    }
    fun addFragment( fragment: Fragment, title:String ){
        tabNames.add(title)
        fragments.add(fragment)
    }
//    fun removeFragment(position:Int){
//        fragments.()
//    }
//    override fun notifyDataSetChanged() {
//        super.notifyDataSetChanged()
//    }

}