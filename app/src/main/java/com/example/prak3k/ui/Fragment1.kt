package com.example.prak3k.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.prak3k.R

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val buttonNext: Button = view.findViewById(R.id.btn_next)
        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)  // Навигация к Fragment2
        }

        return view
    }
}
