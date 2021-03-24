package ibodov.smile.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Возвращает ссылку на фрагмент

        WorkoutDetailFragment frag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        // WorkoutDetailFragment. В макете активности этому фрагменту присвоен идентификатор detail_frag.
        frag.setWorkoutId(1); //Приказываем WorkoutDetailFragment вывести подробную информацию о произвольно
        // выбранном комплексе, чтобы убедиться в том, что все работает.
    }
}