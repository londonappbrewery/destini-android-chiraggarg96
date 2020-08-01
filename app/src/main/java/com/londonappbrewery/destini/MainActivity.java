package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mUpperButton;
    Button mLowerButton;
    TextView mStoryTextView;
    int mStatusCount =1;

    QuestionAnswer[] mQA=new QuestionAnswer[]{
            new QuestionAnswer(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new QuestionAnswer(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new QuestionAnswer(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new QuestionAnswer(R.string.T4_End),
            new QuestionAnswer(R.string.T5_End),
            new QuestionAnswer(R.string.T6_End)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null)
        {
            mStatusCount=savedInstanceState.getInt("StatusCount");
        }


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mUpperButton=(Button) findViewById(R.id.buttonTop );
        mLowerButton=(Button) findViewById(R.id.buttonBottom);
        mStoryTextView=(TextView) findViewById(R.id.storyTextView);
        int count=1;

        update();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mUpperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStatusCount==1)
                    mStatusCount=3;
                else if (mStatusCount==2)
                    mStatusCount=3;
                else if (mStatusCount==3)
                    mStatusCount=6;
                update();
            }

        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mLowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStatusCount==1)
                    mStatusCount=2;
                else if (mStatusCount==2)
                    mStatusCount=4;
                else if (mStatusCount==3)
                    mStatusCount=5;
                update();
            }

        });

    }
    public void update()
    {
        if(mStatusCount >0 && mStatusCount <4 ) {
            mStoryTextView.setText(mQA[mStatusCount-1].getStory());
            mUpperButton.setText(mQA[mStatusCount-1].getAnswerOne());
            mLowerButton.setText(mQA[mStatusCount-1].getAnswerTwo());
        }
        else
        {
            mStoryTextView.setText(mQA[mStatusCount-1].getStory());
            mUpperButton.setVisibility(View.GONE);
            mLowerButton.setVisibility(View.GONE);
        }
    }
    @Override
protected void onSaveInstanceState(Bundle outState)
    {
super.onSaveInstanceState(outState);
outState.putInt("StatusCount",mStatusCount);
    }


}
