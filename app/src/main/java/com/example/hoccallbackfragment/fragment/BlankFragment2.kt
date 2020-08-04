package com.example.hoccallbackfragment.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hoccallbackfragment.R
import com.example.hoccallbackfragment.model.Student
import kotlinx.android.synthetic.main.fragment_blank2.*

class BlankFragment2 : Fragment(),BlankFragment.Behavior {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)

        return view
    }

    fun getData(name: String, age: Int, email: String) {
        txtName.setText(name)
        txtAge.setText(age.toString())
        txtEmail.setText(email)
    }

    override fun sendData(student: Student) {
        txtName.text = student.name
    }

}