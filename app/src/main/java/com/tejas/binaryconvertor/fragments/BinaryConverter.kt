package com.tejas.binaryconvertor.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.tejas.binaryconvertor.databinding.FragmentBinaryConverterBinding


class BinaryConverter : Fragment() {

    private lateinit var binding: FragmentBinaryConverterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_binary_converter, container, false)

        binding = FragmentBinaryConverterBinding.inflate(inflater, container, false)


        binding.textButton?.setOnClickListener {
            binToDEC()


        }

        binding.textButtonReset?.setOnClickListener {

            binding.txtDecimal.text = ""
            binding.binaryNumberEditText.setText("")

        }



        return binding.root
    }

    private fun binToDEC(): String {
        var num: Int = Integer.parseInt(binding.binaryNumberEditText.text.toString())
        var power: Int = 0
        var result = 0
        var remainder: Long

        while (num != 0) {
            remainder = (num % 10).toLong()
            num /= 10
            result += (remainder * Math.pow(2.0, power.toDouble())).toInt()
            ++power

        }

        return result.toString().also { binding.txtDecimal.text = it }
    }

}
