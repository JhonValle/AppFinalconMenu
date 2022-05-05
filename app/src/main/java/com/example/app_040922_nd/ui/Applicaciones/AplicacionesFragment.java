package com.example.app_040922_nd.ui.Applicaciones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.app_040922_nd.databinding.FragmentAplicacionesBinding;

public class AplicacionesFragment extends Fragment {


    private FragmentAplicacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAplicacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageButton imagespotify = binding.imagespotify;
        final ImageButton imagetiktok = binding.imagetiktok;
        final ImageButton imageInstagram = binding.imageInstagram;
        final ImageButton imageSnapchat = binding.imageSnapchat;

        imagespotify.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent clock = getActivity().getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                startActivity(clock); }});
        imagetiktok.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent music = getActivity().getPackageManager().getLaunchIntentForPackage("com.zhiliaoapp.musically");
                startActivity(music); }});
        imageInstagram.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent shazam = getActivity().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(shazam); }});
        imageSnapchat.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent steam = getActivity().getPackageManager().getLaunchIntentForPackage("com.snapchat.android");
                startActivity(steam); }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}