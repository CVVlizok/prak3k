package com.example.prak3k.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.prak3k.R

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        // Ищем кнопку "Back"
        val buttonBack: Button = view.findViewById(R.id.btn_back)

        // Обрабатываем нажатие на кнопку "Back"
        buttonBack.setOnClickListener {
            findNavController().popBackStack()  // Возвращаемся на предыдущий фрагмент
        }

        return view
    }
}
