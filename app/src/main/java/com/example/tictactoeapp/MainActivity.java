package com.example.tictactoeapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toogleButon(v);
            }
        });
    }

    public void toogleButton(View v) {
        javafx.scene.control.Button b = (Button)v;
        if (" ".equals(b.getText().toString())){
            if (xTurn) {
                b.setText("X");
            } else {
                b.setText("O");
            }
            xTurn = !xTurn;
        }
    }
}
