package com.tejas.binaryconvertor.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tejas.binaryconvertor.fragments.BinaryConverter
import com.tejas.binaryconvertor.fragments.JsonConverter
import com.tejas.binaryconvertor.fragments.RecipeApp

class TemplateAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {



    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position) {

            0->{
                return BinaryConverter()
            }
            1->{
                return JsonConverter()
            }
            2->{
                return RecipeApp()
            }
            else->{
                return BinaryConverter()
            }

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0->{
                return "Binary TO Decimal"
            }
            1->{
                return "CSV to JSON"
            }
            2->{
                return  "Dollar to Cents"
            }
        }


        return super.getPageTitle(position)
    }
}