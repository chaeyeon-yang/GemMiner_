package com.example.gemminer

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.gemminer.databinding.FragmentArtistDetailBinding

class ArtistDetailFragment : Fragment() {
    lateinit var homeActivity: HomeActivity
    lateinit var artistDetailBinding: FragmentArtistDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        artistDetailBinding =  FragmentArtistDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_artist_detail, container, false)

    }


}