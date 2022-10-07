package com.project.sudoku_game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.project.sudoku_game.databinding.FragmentLaunchScreenBinding

class LaunchScreen : Fragment() {
    lateinit var binding: FragmentLaunchScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLaunchScreenBinding.inflate(inflater, container, false)
        binding.apply {
            val playButton = play
            playButton.setOnClickListener {
                findNavController().navigate(R.id.action_launchScreen_to_difficultyFragment)
            }
            val aboutButton = aboutButton
            aboutButton.setOnClickListener {
                findNavController().navigate(R.id.action_launchScreen_to_aboutFragment)
            }
            val solveButton = solver
            solveButton.setOnClickListener {
                findNavController().navigate(R.id.action_launchScreen_to_solverFragment)
            }
        }

        return binding.root
    }
}