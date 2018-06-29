package theosolutions.quizapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    RadioButton question2_choice2;
    // Question 3
    RadioButton question3_choice4;
    // Question 4
    RadioButton question4_choice3;
    // Question 5
    CheckBox question5__checkBox1;
    CheckBox question5_checkBox2;
    CheckBox question5_checkBox3;
    CheckBox question5_checkBox4;
    // Question 6
    CheckBox question6_checkBox1;
    CheckBox question6_checkBox2;
    CheckBox question6_checkBox3;
    CheckBox question6_checkBox4;
    // Question 7
    EditText question7_editText;
    // Question 8
    EditText question8_editText;
    // Question 9
    EditText question9_editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score = 0;
        int answer2_score = 0 ;
        int answer3_score = 0;
        int answer4_score = 0;
        int answer5_score = 0;
        int answer6_score = 0;
        int answer7_score = 0;
        int answer8_score = 0;
        int answer9_score = 0;
        int final_score = 0;

        // Question 1 - Correct Answer is #3

        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //Question 2 - correct answer is # 2

        Boolean answer2;

        question2_choice2 = (RadioButton) this.findViewById(R.id.question2_choice2);
        answer2 = question2_choice2.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //Question 3 - correct answer #4

        Boolean answer3;

        question3_choice4 = (RadioButton) this.findViewById(R.id.question3_choice4);
        answer3 = question3_choice4.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // Question 4  - correct answer #3 oxygen

        Boolean answer4;

        question4_choice3 = (RadioButton) this.findViewById(R.id.question4_choice3);
        answer4 = question4_choice3.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // Question 5  - Correct Answers are #1 Raises blood pressure #3 Increases rate and depth of breathing
        //#4 Constricts blood vessels of the skin

        Boolean answer5_checkBox1;
        Boolean answer5_checkBox2;
        Boolean answer5_checkBox3;
        Boolean answer5_checkBox4;
        CheckBox question5_checkBox1 = (CheckBox) this.findViewById(R.id.question5_checkBox1);
         question5_checkBox2 = (CheckBox) this.findViewById(R.id.question5_checkBox2);
         question5_checkBox3 = (CheckBox) this.findViewById(R.id.question5_checkBox3);
         question5_checkBox4 = (CheckBox) this.findViewById(R.id.question5_checkBox4);
        answer5_checkBox1 = question5_checkBox1.isChecked();
        answer5_checkBox2 = question5_checkBox2.isChecked();
        answer5_checkBox3 = question5_checkBox3.isChecked();
        answer5_checkBox4 = question5_checkBox4.isChecked();
        if (answer5_checkBox1 && !answer5_checkBox2 && answer5_checkBox3 && answer5_checkBox4) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        // Question 6  - Correct Answers are #2 oogenesis #3 spermatogenesis

        Boolean answer6_checkBox1;
        Boolean answer6_checkBox2;
        Boolean answer6_checkBox3;
        Boolean answer6_checkBox4;
        question6_checkBox1 = (CheckBox) this.findViewById(R.id.question6_checkBox1);
        question6_checkBox2 = (CheckBox) this.findViewById(R.id.question6_checkBox2);
        question6_checkBox3 = (CheckBox) this.findViewById(R.id.question6_checkBox3);
        question6_checkBox4 = (CheckBox) this.findViewById(R.id.question6_checkBox4);
        answer6_checkBox1 = question6_checkBox1.isChecked();
        answer6_checkBox2 = question6_checkBox2.isChecked();
        answer6_checkBox3 = question6_checkBox3.isChecked();
        answer6_checkBox4 = question6_checkBox4.isChecked();
        if (!answer6_checkBox1 && answer6_checkBox2 && answer6_checkBox3 && !answer6_checkBox4) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        // Question 7 - Correct Answer is "amniotic fluid"

        EditText question7_answer = (EditText) findViewById(R.id.question7_editText);
        Editable answerEditable = question7_answer.getText();
        String answer7 = answerEditable.toString().toLowerCase();
        if (answer7.equals("amniotic fluid ")) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question 8 - Correct Answer is "fallopian tube"

        EditText question8_answer = (EditText) findViewById(R.id.question8_editText);
        Editable answerEditable2 = question8_answer.getText();
        String answer8 = answerEditable2.toString().toLowerCase();
        if (answer8.equals("fallopian tube ")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // Question 9 - Correct Answer is "sertoli"

        EditText question9_answer = (EditText) findViewById(R.id.question9_editText);
        Editable answerEditable3 = question9_answer.getText();
        String answer9 = answerEditable3.toString().toLowerCase();
        if (answer9.equals("sertoli ")) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        //Calculate Final Score

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score;

        //Final Score and Corresponding message

        if (final_score == 9) {
            resultsDisplay = "Congratulations you scored 9/9";
        } else if(final_score >= 5 && final_score < 9) {
            resultsDisplay = "You scored " + final_score +"/9";
        } else if (final_score > 0 && final_score < 5 ){
            resultsDisplay = "You can do better, you scored " + final_score +"/9";
        } else {
            resultsDisplay = "Sorry you scored" + final_score +"/9. please try again";
        }

        //message after clicking submit answer button

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}