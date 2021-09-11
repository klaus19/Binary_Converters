package com.tejas.binaryconvertor.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tejas.binaryconvertor.databinding.FragmentDollarCentBinding



class RecipeApp : Fragment() {

     private lateinit var binding:FragmentDollarCentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_receipe_app, container, false)
        binding = FragmentDollarCentBinding.inflate(inflater, container, false)


        binding.btnConvert.setOnClickListener {
               dollarToCents()

        }

        binding.btnReset.setOnClickListener {
               binding.editDollars.setText("")
               binding.editCents.setText("")

        }

        return binding.root
    }

    private fun dollarToCents() {
       // var result = 1
        var dollars:Int = Integer.parseInt(binding.editDollars.text.toString())

        var valueCent:Int = dollars*100
          // result *=Integer.parseInt(valueCent.toString())

        return binding.editCents.setText(valueCent.toString())

    }


}