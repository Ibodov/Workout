package ibodov.smile.workout;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import ibodov.smile.workout.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 */

//Фрагмент должен расширять ListFragment, а не Fragment.
public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Workout.workouts.length];
        for (int i=0; i<names.length; i++) {
            //Создать массив строк с названиями комплексов упражнений.
            names[i] = Workout.workouts[i].getName();
        }

        //Создаем адаптер массива
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                //inflater.getContext - Получить контекст от LayoutInflater.
                inflater.getContext(), android.R.layout.simple_expandable_list_item_1, names);
        setListAdapter(adapter); //Связать адаптер массива со списковым представлением.

        return super.onCreateView(inflater, container, savedInstanceState);
        //Вызов метода onCreateView() суперкласса предоставляет макет по умолчанию для ListFragment.

    }


}