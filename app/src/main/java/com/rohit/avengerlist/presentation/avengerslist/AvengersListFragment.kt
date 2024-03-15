package com.rohit.avengerlist.presentation.avengerslist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rohit.avengerlist.databinding.FragmentAvengersListBinding


class AvengersListFragment : Fragment() {

    private lateinit var binding : FragmentAvengersListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAvengersListBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}