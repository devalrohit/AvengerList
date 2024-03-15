package com.rohit.avengerlist.presentation.avengersdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rohit.avengerlist.R
import com.rohit.avengerlist.databinding.FragmentAvengersDetailBinding


class AvengersDetailFragment : Fragment() {

    private lateinit var binding : FragmentAvengersDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAvengersDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}