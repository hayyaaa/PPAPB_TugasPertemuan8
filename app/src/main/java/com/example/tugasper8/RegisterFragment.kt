package com.example.tugasper8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tugasper8.databinding.FragmentRegisterBinding
import com.example.tugasper8.databinding.FragmentRegisterBinding.*

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root

        with(binding) {
            btnRegister.setOnClickListener {
                (activity as MainActivity).viewPager2.setCurrentItem(1, true)
            }
            txtLogin.setOnClickListener {
                (activity as MainActivity).viewPager2.setCurrentItem(1, true)
            }
        }

        return view
    }
}