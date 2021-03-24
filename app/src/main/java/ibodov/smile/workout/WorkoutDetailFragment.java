package ibodov.smile.workout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment { //Класс расширяет класс Fragment системы Android.

    private long workoutId; //Идентификатор комплекса упражнений, выбранного пользователем. Позднее,
    // при выводе подробной информации, он будет использован для заполнения представлений фрагмента.

    @Override
    //Метод onCreateView() вызывается тогда, когда Android потребуется макет фрагмента.
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Сообщает Android, какой макет используется фрагментом (в данном случае fragment_workout_detail).
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
    //Макет фрагмента назначается вызовом inflater.inflate(R.layout.fragment_workout_detail,
    //container, false);

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();  //Метод getView() получает корневой объект View фрагмента. Далее
        // полученный объект используется для полуения ссылок на надписи, предназначенные для
        // названия и описания комплекса упражнений.
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }


    public void setWorkoutId(long id) { //Метод для присваивания идентификатора. Метод используется активностью для
        // передачи значения идентификатора фрагменту.
        this.workoutId = id;
    }




}