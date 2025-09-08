package com.example.tarea1fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.materialswitch.MaterialSwitch
import com.google.android.material.radiobutton.MaterialRadioButton

class SelectionElementsFragment : Fragment() {

    private lateinit var selectionStateTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_selection_elements, container, false)

        selectionStateTextView = view.findViewById(R.id.selection_state_textview)
        val checkBox: MaterialCheckBox = view.findViewById(R.id.material_checkbox)
        val radioGroup: RadioGroup = view.findViewById(R.id.material_radio_group)
        val switchMaterial: MaterialSwitch = view.findViewById(R.id.material_switch)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            updateSelectionState("CheckBox: ${if (isChecked) "Marcado" else "No Marcado"}")
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton: MaterialRadioButton = group.findViewById(checkedId)
            updateSelectionState("Radio: ${radioButton.text} seleccionado")
        }

        switchMaterial.setOnCheckedChangeListener { _, isChecked ->
            updateSelectionState("Switch: ${if (isChecked) "Activado" else "Desactivado"}")
        }

        // Estado inicial
        updateSelectionState("Estado de selección:")

        return view
    }

    private fun updateSelectionState(state: String) {
        selectionStateTextView.text = state
    }
}
