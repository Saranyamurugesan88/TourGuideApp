package com.saranya.tripguideapp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.imageview.ShapeableImageView;
public class CityDetails extends AppCompatActivity {
    ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
    TextView city, description,duration,timetovisit, attr1name, attr1des,attr2name,attr2des, food1name, food1des, food2name,food2des;
    Button locationbtn;
    String location;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);
        mainimage = findViewById(R.id.citydetails_image);
        attr1img= findViewById(R.id.citydetails_place1image);
        attr2img= findViewById(R.id.citydetails_place2image);
        food1img= findViewById(R.id.citydetails_food1image);
        food2img= findViewById(R.id.citydetails_food2image);
        city= findViewById(R.id.citydetails_name);
        description= findViewById(R.id.citydetails_description);
        duration= findViewById(R.id.citydetails_tripduration);
        timetovisit= findViewById(R.id.citydetails_besttime);
        attr1name= findViewById(R.id.citydetails_place1name);
        attr2name= findViewById(R.id.citydetails_place2name);
        food1name= findViewById(R.id.citydetails_food1name);
        food2name= findViewById(R.id.citydetails_food2name);
        attr1des= findViewById(R.id.citydetails_place1description);
        attr2des= findViewById(R.id.citydetails_place2description);
        food1des= findViewById(R.id.citydetails_food1description);
        food2des= findViewById(R.id.citydetails_food2description);
        locationbtn= findViewById(R.id.citydetails_getlocationbtn);
        String city_str= getIntent().getStringExtra("putextra_city");
        if(city_str.equals("Agra"))
        {
            city.setText("Agra, Uttar Pradesh");
            attr1name.setText("Taj Mahal");
            attr2name.setText("Agra Fort");
            attr1des.setText("Taj Mahal is an ivory-white marble mausoleum in Agra.");
            attr2des.setText("Agra Fort is a UNESCO- World Heritage Site.");
            attr1img.setImageResource(R.drawable.agra);
            attr2img.setImageResource(R.drawable.agra_agrafort);
            food1name.setText("Agra Petha");
            food2name.setText("Bhalla");
            food1des.setText("Famous and Purest dessert in the world.");
            food2des.setText("Dahi bhalla is sumptuous dish made with curd.");
            food1img.setImageResource(R.drawable.agra_food_petha);
            food2img.setImageResource(R.drawable.agra_food_bhalla);
            description.setText("Agra is famous for its Mughal architecture and for being home to one of the Seven Wonders of the World, the Taj Mahal - a monument of incredible elegance and architectural perfection.");
            location = "https://www.google.co.in/maps/place/Agra,+Uttar+Pradesh/@27.176369,77.9386518,11z/data=!4m13!1m7!3m6!1s0x39740d857c2f41d9:0x784aef38a9523b42!2sAgra,+Uttar+Pradesh!3b1!8m2!3d27.1766701!4d78.0080745!3m4!1s0x39740d857c2f41d9:0x784aef38a9523b42!8m2!3d27.1766701!4d78.0080745";
            timetovisit.setText("October to April");
            duration.setText("2 to 3 Days");
            mainimage.setImageResource(R.drawable.agra);
        }
        if (city_str.equals("Amritsar")) {
            city.setText("Amritsar, Punjab");
            attr1name.setText("Golden Temple");
            attr2name.setText("Jallianwala Bagh");
            attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
            attr2des.setText("Jallianwala Bagh is a historic garden.");
            attr1img.setImageResource(R.drawable.amritsar_golden_temple);
            attr2img.setImageResource(R.drawable.amritsar_jallianwala_bagh);
            food1name.setText("Aloo Paratha");
            food2name.setText("Sarson ka Saag");
            food1des.setText("Tasty dish with lot of butter.");
            food2des.setText("A very popular dish mainly eaten with makke ki roti.");
            food1img.setImageResource(R.drawable.amritsar_food_paratha);
            food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
            description.setText("Amritsar was founded by Sri Guru Ramdass ji, the fourth guru of the Sikhs in about 1574 A.D. Before the city was founded, the area was covered with thick forests and had several lakes.");
            location = "https://www.google.co.in/maps/place/Amritsar,+Punjab/@31.633525,74.8000794,12z/data=!3m1!4b1!4m5!3m4!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642";
            timetovisit.setText("November to January");
            duration.setText("2 Days");
            mainimage.setImageResource(R.drawable.amritsar);
        }
        if(city_str.equals("Darjeeling"))
        {
            city.setText("Darjeeling, West Bengal");
            attr1name.setText("Batasia Loop");
            attr2name.setText("Tiger Hill");
            attr1des.setText("Famous Memorial place in Darjeeling.");
            attr2des.setText("Tiger Hill is a mountain in the Drass-kargil area of Ladakh.");
            attr1img.setImageResource(R.drawable.batasialoop);
            attr2img.setImageResource(R.drawable.tigerhill);
            food1name.setText("Kwati");
            food2name.setText("Aaloo Achar");
            food1des.setText("Kwati is Famous mixed soup in Darjeeling.");
            food2des.setText("Aaloo Achar is served as thali in Darjeeling.");
            food1img.setImageResource(R.drawable.kwati);
            food2img.setImageResource(R.drawable.aaloo_achar);
            description.setText("Darjeeling is a town and municipality in the northernmost region of the Indian state of West Bengal. Located in the Eastern Himalayas,. Famous attractions of darjeeling are Batasia Loop, Tiger hill etc.");
            location = "https://www.google.com/maps/place/Darjeeling,+West+Bengal/@27.0331949,88.2646751,13z/data=!3m1!4b1!4m5!3m4!1s0x39e42e654cf501bb:0x4175555979d4702a!8m2!3d27.0410218!4d88.2662745";
            timetovisit.setText("September to November");
            duration.setText("5 to 6 Days");
            mainimage.setImageResource(R.drawable.darjeeling);

        }
        if(city_str.equals("Jaipur"))
        {
            city.setText("Jaipur, Rajasthan");
            attr1name.setText("Jantar Mantar");
            attr2name.setText("Hawa Mahal");
            attr1des.setText("Instrument for Measuring the harmony of heaven.");
            attr2des.setText("Hawa mahal is Famous palace boasts of a pyramidal shape.");
            attr1img.setImageResource(R.drawable.jantar_mantar);
            attr2img.setImageResource(R.drawable.hawa_mahal);
            food1name.setText("Pyaaz Kachori");
            food2name.setText("Ghewar");
            food1des.setText("Pyaaz Kachori- A fried Pastry filled with spicy onion.");
            food2des.setText("Famous disc shaped sweet cake.");
            food1img.setImageResource(R.drawable.pyaaz_kachori);
            food2img.setImageResource(R.drawable.ghewar);
            description.setText("The Pink City, Jaipur is home to a large number of marvellous forts, gorgeous palaces and magnificent temples. These historic architectures, along with the vibrant culture of Jaipur, attract tourists from all over the world.");
            location = "https://www.google.com/maps/place/Jaipur,+Rajasthan/@26.8852108,75.7905578,11z/data=!3m1!4b1!4m5!3m4!1s0x396c4adf4c57e281:0xce1c63a0cf22e09!8m2!3d26.9124336!4d75.7872709";
            timetovisit.setText("December to March");
            duration.setText("3 to 4 Days");
            mainimage.setImageResource(R.drawable.jaipur);
        }
        if(city_str.equals("Kolkata"))
        {
            city.setText("Kolkata, West Bengal");
            attr1name.setText("Victoria Memorial");
            attr2name.setText("Howrah Bridge");
            attr1des.setText("A largest monument to a monarch in the world.");
            attr2des.setText("Howrah bridge is an iconic landmark in kolkata.");
            attr1img.setImageResource(R.drawable.victoria);
            attr2img.setImageResource(R.drawable.howrah_bridge);
            food1name.setText("Jhalmuri");
            food2name.setText("Kati roll");
            food1des.setText("Jhalmuri is a quick spicy puffed rice snack.");
            food2des.setText("Skewer-roasted kebab of meat and vegetables.");
            food1img.setImageResource(R.drawable.jhalmuri);
            food2img.setImageResource(R.drawable.kati_roll);
            description.setText("Kolkata is a city of colonial architecture, museums, art galleries, traditional food, temples, music and theatre. It is an amalgamation of traditional and modern. It is famous for its theatre and films.");
            location = "https://www.google.com/maps/place/Kolkata,+West+Bengal/@22.6759958,88.3297288,10z/data=!3m1!4b1!4m5!3m4!1s0x39f882db4908f667:0x43e330e68f6c2cbc!8m2!3d22.572646!4d88.363895";
            timetovisit.setText("November to February");
            duration.setText("10 Days");
            mainimage.setImageResource(R.drawable.kolkata);
        }
        if(city_str.equals("Udaipur"))
        {
            city.setText("Udaipur, Rajasthan");
            attr1name.setText("City Palace");
            attr2name.setText("Jagdish Temple");
            attr1des.setText("The Maharanas administered the their kingdom in this palace.");
            attr2des.setText("Famous hindu temple in udaipur.");
            attr1img.setImageResource(R.drawable.city_palace);
            attr2img.setImageResource(R.drawable.jagdish);
            food1name.setText("Daal Baati Churma");
            food2name.setText("Kachori");
            food1des.setText("Dal Bati Churma is the most popular item in Rajasthani cuisine.");
            food2des.setText("Kachori is a spicy deep-fried snack.");
            food1img.setImageResource(R.drawable.daal_baati);
            food2img.setImageResource(R.drawable.kachori);
            description.setText("The most romantic spot on the continent of India by British administrator James Tod. Udaipur is a tourist destination and is known for its history, culture, scenic locations and the Rajput-era palaces.");
            location = "https://www.google.com/maps/place/Udaipur,+Rajasthan/@24.6082862,73.7070585,13z/data=!3m1!4b1!4m5!3m4!1s0x3967e56550a14411:0xdbd8c28455b868b0!8m2!3d24.585445!4d73.712479";
            timetovisit.setText("September to March");
            duration.setText("7 Days");
            mainimage.setImageResource(R.drawable.udaipur);
        }
        if(city_str.equals("Varanasi"))
        {
            city.setText("Varanasi, Uttar Pradesh");
            attr1name.setText("Kashi Vishwanath Temple");
            attr2name.setText("Ganges River");
            attr1des.setText("Famous Hindu Temple dedicated to lord shiva.");
            attr2des.setText("A trans-boundary river of Asia");
            attr1img.setImageResource(R.drawable.kashi);
            attr2img.setImageResource(R.drawable.ganges);
            food1name.setText("Tamatar Chaat");
            food2name.setText("Chooda Matar");
            food1des.setText("Tamatar chaat is an flavorful tanginess with tinge of sweetness.");
            food2des.setText("Chooda matar is refreshing flavor for winter.");
            food1img.setImageResource(R.drawable.tamatar);
            food2img.setImageResource(R.drawable.chooda);
            description.setText("Varanasi is a city on the Ganges river in northern India that has a central place in pilgrimage, death, and mourning in the Hindu world.");
            location = "https://www.google.com/maps/place/Varanasi,+Uttar+Pradesh/@25.3207626,82.9911089,12z/data=!3m1!4b1!4m5!3m4!1s0x398e2db76febcf4d:0x68131710853ff0b5!8m2!3d25.3176452!4d82.9739144";
            timetovisit.setText("December to February");
            duration.setText("15 Days");
            mainimage.setImageResource(R.drawable.varanasi);
        }
        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });
    }
}
