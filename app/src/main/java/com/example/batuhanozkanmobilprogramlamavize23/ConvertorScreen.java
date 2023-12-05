package com.example.batuhanozkanmobilprogramlamavize23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConvertorScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor_screen);
        EditText decimalEditText = (EditText) findViewById(R.id.decimalEditText);
        EditText byteEditText = (EditText) findViewById(R.id.byteEditText);
        EditText celciusEditText = (EditText) findViewById(R.id.celciusEditText);

        TextView decimalTextView = (TextView) findViewById(R.id.decimalTextView);
        TextView byteTextView = (TextView) findViewById(R.id.byteTextView);
        TextView celciusTextView = (TextView) findViewById(R.id.celciusTextView);

        Spinner decimalSpinner = (Spinner) findViewById(R.id.decimalSpinner);
        Spinner byteSpinner = (Spinner) findViewById(R.id.byteSpinner);
        Spinner celciusSpinner = (Spinner) findViewById(R.id.celciusSpinner);

        String[] decimalItems = new String[]{
                "to 2", "to 8", "to 16",
        };

        String[] byteItems = new String[]{
                "MB to KB", "MB to B", "MB to Kibi", "MB to Bit",
        };

        String[] celciusItems = new String[]{
                "C to F", "C to K",
        };

        ArrayAdapter<String> decimalSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, decimalItems);
        decimalSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        decimalSpinner.setAdapter(decimalSpinnerAdapter);

        ArrayAdapter<String> byteSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, byteItems);
        byteSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        byteSpinner.setAdapter(byteSpinnerAdapter);

        ArrayAdapter<String> celciusSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, celciusItems);
        celciusSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        celciusSpinner.setAdapter(celciusSpinnerAdapter);

        decimalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (!String.valueOf(decimalEditText.getText()).isEmpty() && String.valueOf(decimalEditText.getText()).matches("\\d+")) {
                    switch (selectedItem) {
                        case "to 2":
                            DecimalToBinary decimalToBinary = new DecimalToBinary();
                            String t = decimalEditText.getText().toString();
                            String result = decimalToBinary.decimalToBinary(Integer.parseInt(t));
                            decimalTextView.setText(result);
                            break;
                        case "to 8":
                            DecimalToOctal decimalToOctal = new DecimalToOctal();
                            String t1 = decimalEditText.getText().toString();
                            String result1 = decimalToOctal.decimalToOctal(Integer.parseInt(t1));
                            decimalTextView.setText(result1);
                            break;
                        case "to 16":
                            DecimalToHexadecimal decimalToHexadecimal = new DecimalToHexadecimal();
                            String t2 = decimalEditText.getText().toString();
                            String result2 = decimalToHexadecimal.decimalToHexadecimal(Integer.parseInt(t2));
                            decimalTextView.setText(result2);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        byteSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (!String.valueOf(byteEditText.getText()).isEmpty() && String.valueOf(byteEditText.getText()).matches("\\d+")) {
                    MegaByteToConvertors megaByteToConvertors = new MegaByteToConvertors();
                    switch (selectedItem) {
                        case "MB to KB":
                            String t = byteEditText.getText().toString();
                            String result = megaByteToConvertors.mbToKiloByte(Double.parseDouble(t));
                            byteTextView.setText(result);
                            break;
                        case "MB to B":
                            String t1 = byteEditText.getText().toString();
                            String result1 = megaByteToConvertors.mbToByte(Double.parseDouble(t1));
                            byteTextView.setText(result1);
                            break;
                        case "MB to Kibi":
                            String t2 = byteEditText.getText().toString();
                            String result2 = megaByteToConvertors.mbToKibiByte(Double.parseDouble(t2));
                            byteTextView.setText(result2);
                            break;
                        case "MB to Bit":
                            String t3 = byteEditText.getText().toString();
                            String result3 = megaByteToConvertors.mbToBit(Double.parseDouble(t3));
                            byteTextView.setText(result3);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        celciusSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (!String.valueOf(celciusEditText.getText()).isEmpty() && String.valueOf(celciusEditText.getText()).matches("\\d+")) {
                    DegreeConvertors degreeConvertors = new DegreeConvertors();
                    switch (selectedItem) {
                        case "C to F":
                            String t = celciusEditText.getText().toString();
                            String result = degreeConvertors.celciusToFahrt(Double.parseDouble(t));
                            celciusTextView.setText(result);
                            break;
                        case "C to K":
                            String t1 = celciusEditText.getText().toString();
                            String result1 = degreeConvertors.celciusToKelvin(Double.parseDouble(t1));
                            celciusTextView.setText(result1);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}