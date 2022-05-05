package com.example.app_040922_nd.ui.calculadora;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_040922_nd.R;
import com.example.app_040922_nd.databinding.FragmentCalculadoraBinding;

import org.mariuszgromada.math.mxparser.Expression;


public class CalculadoraFragment extends Fragment {


    TextView textView1, textView2;
    Button btnParentesis1, btnParentesis2, btnAns, btndelete, btnLimpiar, btnnumber7, btnnumber8, btnnumber9,
            btnporcentaje, btnraiz, btnnumber4, btnnumber5, btnnumber6, btnmultiplicacion, btndivision, btnnumber1, btnnumber2,
            btnnumber3, btnsuma, btnresta, btnnumber0, btnpunto, btnigual;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_calculadora, container, false);
        //------------------------------------------------------------------------------------------
        textView1 = (TextView)view.findViewById(R.id.textView1);
        textView2 = (TextView)view.findViewById(R.id.textView2);

        btnParentesis2 = (Button)view.findViewById(R.id.btnParentesis2);
        btnParentesis1 = (Button)view.findViewById(R.id.btnParentesis1);
        btnLimpiar = (Button)view.findViewById(R.id.btnLimpiar);
        btnAns = (Button)view.findViewById(R.id.btnAns);
        btndelete = (Button)view.findViewById(R.id.btndelete);

        btnraiz = (Button)view.findViewById(R.id.btnraiz);
        btnporcentaje = (Button)view.findViewById(R.id.btnporcentaje);
        btnmultiplicacion = (Button)view.findViewById(R.id.btnmultiplicacion);
        btndivision = (Button)view.findViewById(R.id.btndivision);
        btnsuma = (Button)view.findViewById(R.id.btnsuma);
        btnresta = (Button)view.findViewById(R.id.btnresta);
        btnigual = (Button)view.findViewById(R.id.btnigual);
        btnpunto = (Button)view.findViewById(R.id.btnpunto);

        btnnumber0 = (Button)view.findViewById(R.id.btnnumber0);
        btnnumber1 = (Button)view.findViewById(R.id.btnnumber1);
        btnnumber2 = (Button)view.findViewById(R.id.btnnumber2);
        btnnumber3 = (Button)view.findViewById(R.id.btnnumber3);
        btnnumber4 = (Button)view.findViewById(R.id.btnnumber4);
        btnnumber5 = (Button)view.findViewById(R.id.btnnumber5);
        btnnumber6 = (Button)view.findViewById(R.id.btnnumber6);
        btnnumber7 = (Button)view.findViewById(R.id.btnnumber7);
        btnnumber8 = (Button)view.findViewById(R.id.btnnumber8);
        btnnumber9 = (Button)view.findViewById(R.id.btnnumber9);
        //
        btnParentesis2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                textView1.setText(String.format("%s)", textView1.getText()));
            }
        });
        btnParentesis1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                textView1.setText(String.format("%s(", textView1.getText()));
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                textView1.setText(""); textView2.setText("");
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                if (!textView1.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText().toString().substring(0, textView1.getText().toString().length()-1));
                }
            }
        });
        btnnumber0.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "0");
            }
        });
        btnnumber1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "1");
            }
        });
        btnnumber2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "2");
            }
        });
        btnnumber3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "3");
            }
        });
        btnnumber4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "4");
            }
        });
        btnnumber5.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "5");
            }
        });
        btnnumber6.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "6");
            }
        });
        btnnumber7.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "7");
            }
        });
        btnnumber8.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "8");
            }
        });
        btnnumber9.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("number", "9");
            }
        });


        btnporcentaje.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", "%");
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", "x");
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", "÷");
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", "+");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", "-");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                checkChar("operator", ".");
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String replacedString = textView1.getText().toString();
                replacedString = replacedString.replace('÷','/');
                replacedString = replacedString.replace('x','*');
                replacedString = replacedString.replace(',','.');
                replacedString = replacedString.replace("(","*(");
                Expression exp = new Expression(replacedString);
                textView2.setText(String.valueOf(exp.calculate()));
                checkChar("operator", "=");
            }});


        return view;
    }

    public void checkChar(String inType, String value){
        if (inType.equals("number")) {
            textView1.setText(String.format("%s%s", textView1.getText(), value));
        }
        else {
            if (!textView1.getText().toString().isEmpty()){
                String lc = textView1.getText().toString().substring(textView1.getText().toString().length() - 1);    // Ultimo caracter

                if (inType.equals("operator")){
                    if (lc.equals("0") || lc.equals("1") || lc.equals("2") || lc.equals("3") || lc.equals("4") || lc.equals("5") || lc.equals("6") || lc.equals("7") || lc.equals("8") || lc.equals("9")) {
                        textView1.setText(String.format("%s%s", textView1.getText(), value));
                    }
                }
            }
        }
    }
}

