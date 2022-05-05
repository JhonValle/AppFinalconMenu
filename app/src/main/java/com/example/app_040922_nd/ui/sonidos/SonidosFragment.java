package com.example.app_040922_nd.ui.sonidos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentSonidosBinding;

public class SonidosFragment extends Fragment {

    private FragmentSonidosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SonidosViewModel sonidosViewModel =
                new ViewModelProvider(this).get(SonidosViewModel.class);

        binding = FragmentSonidosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageButton image1 = binding.image1;
        final ImageButton image2 = binding.image2;
        final ImageButton image3 = binding.image3;
        final ImageButton image4 = binding.image4;
        final ImageButton image5 = binding.image5;
        final ImageButton image6 = binding.image6;
        final ImageButton image7 = binding.image7;
        final ImageButton image8 = binding.image8;
        final ImageButton image9 = binding.image9;
        final ImageButton image10 = binding.image10;

        image1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.carro);
                mp.start(); }});
        image2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.caramba);
                mp.start(); }});
        image3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.donald);
                mp.start(); }});
        image4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.bob);
                mp.start(); }});
        image5.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.mario1);
                mp.start(); }});
        image6.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.bob1);
                mp.start(); }});
        image7.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.lobo);
                mp.start(); }});
        image8.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.pacman);
                mp.start(); }});
        image9.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.despertador);
                mp.start(); }});
        image10.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.talk);
                mp.start(); }});

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}