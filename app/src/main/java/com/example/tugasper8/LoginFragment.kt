package com.example.tugasper8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tugasper8.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        with(binding) {
            btnLogin.setOnClickListener {
                val intent = Intent(context, WelcomeActivity::class.java)
                startActivity(intent)
            }
            txtRegister.setOnClickListener {
                (activity as MainActivity).viewPager2.setCurrentItem(0, true)
            }
        }

        return view
    }
}
