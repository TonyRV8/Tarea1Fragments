package com.example.tarea1fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        // Ejemplo de TextView
        val infoTextView: TextView = view.findViewById(R.id.infoTextView)
        infoTextView.text = "Este es un TextView de informaciónnn."

        // Ejemplo de ImageView (necesitarás una imagen en drawable, por ejemplo, 'ic_info')
        // val infoImageView: ImageView = view.findViewById(R.id.infoImageView)
        // infoImageView.setImageResource(R.drawable.ic_info)

        // Ejemplo de ProgressBar
        val progressBar: ProgressBar = view.findViewById(R.id.progressBar)
        progressBar.progress = 75 // Porcentaje de ejemplo

        return view
    }
}
