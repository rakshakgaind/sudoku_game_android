package com.project.sudoku_game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.project.sudoku_game.databinding.FragmentDifficultyBinding

class DifficultyFragment : Fragment() {

    lateinit var comm: Communicator
    lateinit var binding:FragmentDifficultyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDifficultyBinding.inflate(inflater, container, false)
        binding.apply {
            val easyButton: Button = easybutton
            val mediumButton: Button = mediumbutton
            val hardButton: Button = hardbutton

            comm = activity as Communicator

            easyButton.setOnClickListener {
                comm.passDataCom("easy")
               findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
            }
            mediumButton.setOnClickListener {
                comm.passDataCom("medium")
               findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
            }
            hardButton.setOnClickListener {
                comm.passDataCom("hard")
               findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
            }
            return root
        }


    }

}