package com.example.rakumeshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.*

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DisplayRoute : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_route)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // 座標を定義する
        val pfu_lng   = LatLng(36.725783, 136.706290)
        val shop1_lng = LatLng(36.722293, 136.697797)
        val shop2_lng = LatLng(36.709256, 136.700018)
        val shop3_lng = LatLng(36.714351, 136.701878)
        //val shop4_lng = LatLng(36.752386, 136.713166)


        // コメントの定義
        val pfu_str   = "Marker in PFU"
        val shop1_str = "大阪屋"
        val shop2_str = "イオンかほく"
        val shop3_str = "Aコープ"
        //val shop4_str = "どんたく"


        // PFUを中心としてズームする  15Fでちょうどいい
        val cu = CameraUpdateFactory.newLatLngZoom(pfu_lng, 14.5F)

        // マーカーセット
        mMap.addMarker(MarkerOptions().position(pfu_lng).title(pfu_str))
        mMap.addMarker(MarkerOptions().position(shop1_lng).title(shop1_str))
        mMap.addMarker(MarkerOptions().position(shop2_lng).title(shop2_str))
        mMap.addMarker(MarkerOptions().position(shop3_lng).title(shop3_str))
        //mMap.addMarker(MarkerOptions().position(shop4_lng).title(shop4_str))


        // 表示をズームする
        mMap.moveCamera(cu)
    }
}
