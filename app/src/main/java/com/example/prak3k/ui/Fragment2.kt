package com.example.prak3k.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.prak3k.R

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        // Ищем кнопки в разметке
        val buttonNext: Button = view.findViewById(R.id.btn_next)
        val buttonBack: Button = view.findViewById(R.id.btn_back)

        // Обрабатываем нажатие на кнопку "Next"
        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)  // Переход на третий фрагмент
        }

        // Обрабатываем нажатие на кнопку "Back"
        buttonBack.setOnClickListener {
            findNavController().popBackStack()  // Возврат на первый фрагмент
        }

        return view
    }
}
