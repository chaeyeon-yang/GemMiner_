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
    lateinit var mainActivity: HomeActivity
    lateinit var artistDetailBinding: FragmentArtistDetailBinding


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as HomeActivity
    }

    override fun onStart() {
        super.onStart()
        mainActivity.findViewById<Button>(R.id.go_basket).setOnClickListener {
            Toast.makeText(mainActivity,"장바구니에 담겼습니다.",Toast.LENGTH_SHORT).show()
        }
    }


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