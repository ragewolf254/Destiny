package com.ragew.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button lowButton;
    TextView storyView;

    int m_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = (Button) findViewById(R.id.buttonTop);
        lowButton = (Button) findViewById(R.id.buttonBottom);
        storyView = (TextView) findViewById(R.id.storyTextView);

        m_index = 1;
        topButton.setText(R.string.T1_Ans1);
        lowButton.setText(R.string.T1_Ans2);
        storyView.setText(R.string.T1_Story);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m_index == 1){
                    topButton.setText(R.string.T3_Ans1);
                    lowButton.setText(R.string.T3_Ans2);
                    storyView.setText(R.string.T3_Story);
                    m_index = 3;
                } else if (m_index == 2){
                    topButton.setText(R.string.T3_Ans1);
                    lowButton.setText(R.string.T3_Ans2);
                    storyView.setText(R.string.T3_Story);
                    m_index = 3;
                }
                else if (m_index == 3){
                    storyView.setText(R.string.T6_End);
                    topButton.setVisibility(topButton.INVISIBLE);
                    lowButton.setVisibility(lowButton.INVISIBLE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m_index == 1){
                    topButton.setText(R.string.T2_Ans1);
                    lowButton.setText(R.string.T2_Ans2);
                    storyView.setText(R.string.T2_Story);
                    m_index = 2;
                } else if (m_index == 2){
                    storyView.setText(R.string.T4_End);
                    topButton.setVisibility(topButton.INVISIBLE);
                    lowButton.setVisibility(lowButton.INVISIBLE);
                }
                else if (m_index == 3){
                    storyView.setText(R.string.T5_End);
                    topButton.setVisibility(topButton.INVISIBLE);
                    lowButton.setVisibility(lowButton.INVISIBLE);
                }
            }
        });

    }
}
