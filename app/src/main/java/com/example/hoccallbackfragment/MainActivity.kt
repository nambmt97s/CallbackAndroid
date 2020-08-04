package com.example.hoccallbackfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hoccallbackfragment.fragment.BlankFragment
import com.example.hoccallbackfragment.fragment.BlankFragment2
import com.example.hoccallbackfragment.model.Student

class MainActivity : AppCompatActivity(), BlankFragment.Behavior {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun sendData(student: Student) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragment2) as BlankFragment2
        fragment2.getData(student.name, student.age, student.email)
    }
}