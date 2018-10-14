package erikblanca.dsa.eetac.edu.upc.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button equals;
    private Button tan;
    private Button cos;
    private Button sin;
    private Button dote;

    private Button add;
    private Button sub;
    private Button mult;

    private TextView inOut;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "9");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "-");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inOut.setText(inOut.getText().toString() + "*");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String op = inOut.getText().toString();

                
                //int res = Integer.parseInt(op);
                //int res = Integer.valueOf(op).intValue();
                int res2 = 1+2/2;
                //int res = new "1+2/2".;
                //System.out.println(res);
                System.out.println(res2);



                String aux = op.replace(" ", "");
                String patron = "[^0-9][0-9]";
                Pattern p = Pattern.compile(patron);
                Matcher m = p.matcher(aux);

                int indiceActual = 0;
                Integer suma = 0;
                while (m.find(indiceActual+1)){
                    int longitud = m.start();
                    suma += Integer.valueOf(aux.substring(indiceActual, longitud));
                    indiceActual = longitud;
                }
                suma += Integer.valueOf(aux.substring(indiceActual));

                System.out.println(op + " = " + suma);
                inOut.setText(suma.toString());

            }
        });



    }

    private void setupUIViews(){
        zero = (Button)findViewById(R.id.butt0);
        one= (Button)findViewById(R.id.butt1);
        two= (Button)findViewById(R.id.butt2);
        three= (Button)findViewById(R.id.butt3);
        four= (Button)findViewById(R.id.butt4);
        five= (Button)findViewById(R.id.butt5);
        six= (Button)findViewById(R.id.butt6);
        seven= (Button)findViewById(R.id.butt7);
        eight= (Button)findViewById(R.id.butt8);
        nine= (Button)findViewById(R.id.butt9);
        equals= (Button)findViewById(R.id.buttEq);
        clear= (Button)findViewById(R.id.buttCE);
        inOut= (TextView) findViewById(R.id.InOut);

        add = (Button) findViewById(R.id.addButton);
        sub= (Button) findViewById(R.id.subButton);
        mult= (Button) findViewById(R.id.multButton);
    }

}
