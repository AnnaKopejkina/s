package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Sprav extends AppCompatActivity {

    List<Popug> popugs = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprav);

popugs.add(new Popug("волнистый попугай", "Длина тела 17—19,8 см, выставочные особи длиной до 21—23 см. Длина крыла 9,5—10,5 см, хвоста — 8—10 см; вес 40—45 г.", R.drawable.voln, "острое цветное зрение, отличный слух"));
    popugs.add(new Popug("Какарик", "Длина их тела достигает 26 см, хвоста – 12, а масс – до 100 г. Средняя продолжительность жизни – 12-17 лет, характерная для их группы", R.drawable.kakar, "по иному называют прыгающими или бегающими"));
        popugs.add(new Popug("Корелла", "длина туловища 16 – 18 см длина хвоста 12 – 15 см крыло 15 -17 см", R.drawable.kor, "корелл можно сравнить с маленькими детьми"));
        popugs.add(new Popug("Ожереловый попугай", "размер от клюва до хвоста составляет 40 см или чуть более.", R.drawable.oj, "длинный ступенчатый хвост."));


        RecyclerView recyclerView = findViewById(R.id.list_popug);
        PopugAdapter adapter = new PopugAdapter(this, popugs);
    }

}