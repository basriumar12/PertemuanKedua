package com.basri.pertemuankedua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var hasil = 0
    var nilaiSatu = 0
    var nilaiDua = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val modelProfil = ModelProfil()
//
//        modelProfil.alamat = " JL Arjuna"
//        modelProfil.nama = "Basri"
//        modelProfil.kelamin ="Laki-laki"
//        modelProfil.umur = "20"
//
//        Log.e("TAG","Model profil ${modelProfil.kelamin}")


        //aplikasi arimatika
        //btn butuh action klik

        btn_hitung.setOnClickListener {

            if (edt_nilai_satu.text.toString().isNullOrEmpty()){
                edt_nilai_satu.setError("Nilai satu tidak bisa kosong")
                Toast.makeText(this,"Nilai satu tidak bisa kosong",
                Toast.LENGTH_LONG).show()
                val parentId = findViewById<LinearLayoutCompat>(R.id.parent)
                Snackbar.make(parentId, "Nilai satu tidak bisa kosong", Snackbar.LENGTH_LONG)
                    .show()

            }
            else if (edt_nilai_dua.text.toString().isNullOrEmpty()){
                edt_nilai_dua.setError("Nilai dua tidak bisa kosong")
                Toast.makeText(this,"Nilai dua tidak bisa kosong",
                    Toast.LENGTH_LONG).show()
            } else{

                nilaiSatu = edt_nilai_dua.text.toString().toInt()
                nilaiDua = edt_nilai_dua.text.toString().toInt()

                //penjumlahan
                hasil = nilaiSatu + nilaiDua
                tv_result.text = "Hasil penjumalahan : $hasil"


            }


        }


    }
}