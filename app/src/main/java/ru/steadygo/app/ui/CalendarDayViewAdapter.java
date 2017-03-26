package ru.steadygo.app.ui;

import android.provider.SyncStateContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.squareup.timessquare.CalendarCellView;
import com.squareup.timessquare.DayViewAdapter;

import ru.steadygo.app.R;
import ru.steadygo.app.util.Constants;

/**
 * Created by ser on 26.03.2017.
 */

public class CalendarDayViewAdapter implements DayViewAdapter {

    @Override
    public void makeCellView(CalendarCellView parent) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_calendar, null);
        parent.addView(layout);
        parent.setDayOfMonthTextView((TextView) layout.findViewById(R.id.day_view));
        Log.i(Constants.LOG_TAG, parent.getDayOfMonthTextView().getText().toString());
        Log.i(Constants.LOG_TAG, "ssssss");
    }
}
