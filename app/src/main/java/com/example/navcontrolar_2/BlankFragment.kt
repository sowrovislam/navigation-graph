package com.example.navcontrolar_2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navcontrolar_2.databinding.FragmentBlank2Binding
import com.example.navcontrolar_2.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    lateinit var binding: FragmentBlankBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBlankBinding.inflate(inflater, container, false)





        binding.button.setOnClickListener {


           findNavController().navigate(R.id.action_blankFragment_to_blankFragment22)



        }










        return binding.root
    }



}