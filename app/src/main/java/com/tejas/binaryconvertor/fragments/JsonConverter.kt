package com.tejas.binaryconvertor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tejas.binaryconvertor.R
import com.tejas.binaryconvertor.databinding.FragmentJsonConverterBinding


class JsonConverter : Fragment() {

    private lateinit var binding:FragmentJsonConverterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_json_converter, container, false)
        binding= FragmentJsonConverterBinding.inflate(inflater, container, false)

        return binding.root
    }


}