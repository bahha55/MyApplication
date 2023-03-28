package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second,container,false)
        val button = view.findViewById<Button>(R.id.NavigateToNextScream)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_homeScreamFragment)
        }
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


}