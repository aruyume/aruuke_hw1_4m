package com.example.aruuke_rakhmanova_01_4m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aruuke_rakhmanova_01_4m.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.apply {
            btnClick.setOnClickListener{
                val user = User(
                    etName.text.toString(),
                    etEmail.text.toString(),
                    etPassword.text.toString().toInt()
                )
                val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
                findNavController().navigate(direction)
            }
        }
    }
}