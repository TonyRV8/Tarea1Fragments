package com.example.tarea1fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)

        val actionTextView: TextView = view.findViewById(R.id.button_action_textview)
        val filledButton: MaterialButton = view.findViewById(R.id.material_button_filled)
        val outlinedButton: MaterialButton = view.findViewById(R.id.material_button_outlined)
        val textButton: MaterialButton = view.findViewById(R.id.material_button_text)
        val extendedFab: ExtendedFloatingActionButton = view.findViewById(R.id.extended_fab)

        filledButton.setOnClickListener {
            actionTextView.text = "Botón Relleno presionado"
        }

        outlinedButton.setOnClickListener {
            actionTextView.text = "Botón con Contorno presionado"
        }

        textButton.setOnClickListener {
            actionTextView.text = "Botón de Texto presionado"
        }

        extendedFab.setOnClickListener {
            actionTextView.text = "Botón FAB Extendido presionado"
        }

        return view
    }
}
