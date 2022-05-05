package com.example.app_040922_nd.ui.sitioweb;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentSitiowebBinding;
import com.example.app_040922_nd.ui.sitioweb.SitioWebViewModel;

public class SitioWebFragment extends Fragment {

    private FragmentSitiowebBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SitioWebViewModel sitiowebViewModel =
                new ViewModelProvider(this).get(SitioWebViewModel.class);

        binding = FragmentSitiowebBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView wv = binding.wv;
        EditText et_url = binding.txtWeb12;
        Button btn_ir = binding.btnIR;

        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("http://" + et_url.getText().toString());
            }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}