package com.example.projectnoodle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.projectnoodle.R
import com.example.projectnoodle.databinding.FragmentMainPartBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MainPartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainPartFragment : Fragment() {
    private  lateinit var binding: FragmentMainPartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainPartBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navController = Navigation.findNavController(requireActivity(),
            R.id.mainPartNavigationFragment
        )
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
    }
}