package net.mukhamadrizal.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class JuveAdapter extends BaseAdapter {

    Context context;
    String[] players;
    String[] positions;
    int[] numbers;
    LayoutInflater inflater;

    public JuveAdapter(Context context, String[] players, String[] positions, int[] numbers) {
        this.context = context;
        this.players = players;
        this.positions = positions;
        this.numbers = numbers;
        this.inflater = (LayoutInflater.from(context)) ;
    }

    @Override
    public int getCount() {
        return players.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.list_players,null);
        TextView tvPlayers= (TextView) v.findViewById(R.id.tv_name);
        TextView tvPositions = (TextView) v.findViewById(R.id.tv_pos);
        TextView tvNumber = (TextView) v.findViewById(R.id.tv_number);

        tvPlayers.setText(players[i]);
        tvPositions.setText(positions[i]);
        tvNumber.setText(numbers[i]+"");
        return v;
    }
}
