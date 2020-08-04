package com.example.hoccallbackfragment.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.example.hoccallbackfragment.R
import com.example.hoccallbackfragment.model.Student
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {

    private lateinit var behavior: Behavior

    interface Behavior {
        fun sendData(student: Student)
    }


    fun setOnclickBehavior(behavior: BlankFragment.Behavior) {
        this.behavior = behavior
    }

    // behavior tham chieu den context
    // cast context thanh behavior
    override fun onAttach(context: Context) {
        super.onAttach(context)
        behavior = context as Behavior
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnClick.setOnClickListener {
            behavior.sendData(Student("Nguyen Nam", 20, "nambmt97s@gmail.com"))
        }
    }

}
