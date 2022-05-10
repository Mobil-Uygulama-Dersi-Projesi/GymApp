package com.alperen.gymapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alperen.gymapp.Adapters.ExerciseAdapter
import com.alperen.gymapp.Exercise
import com.alperen.gymapp.R
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.activity_youtube.*


class ExerciseActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var exerciseList: ArrayList<Exercise>
    private lateinit var exerciseAdapter: ExerciseAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        exerciseList = ArrayList()

        exerciseList.add(Exercise(R.drawable.chairdips,"Chair Dips",
        "Düz bir bench üzerine eller omuz genişliğinde açıklanarak sabitlenir.Mesafe ne kadar kısa olursa kişinin kendisini kaldırması da o kadar kolay olacaktır.Eller sabitlendikten sonra ayaklar kırılmayacak şekilde uzatılır.Harekete alışabilmek ve nefes kontrolünü sağlayabilmek için bir kere olmak şartı ile dirseklerin kitlenmesi yapılabilir.Set süresince dirsekler bir daha kitlenmemelidir.Bu durumun sebebi ise yükün eklem bölgesinde değil arka kolda olmasını sağlamak içindir." +
                "Nefes alınır ve yaklaşık 2 saniye sonunda vücut aşağıya doğru salınır.Dip noktaya ulaşıldığında 1 saniye kadar beklenilir ve sonrasında nefes verilerek 1,5 saniye sonrasında yükselişe geçilir." +
                "Tepe noktaya ulaşıldığında dirsekler kitlenmeden yaklaşık 1 saniye kadar beklenilir ve ardından tekrar inişe geçilir." +
                "Bench dips hareketi 4 set ve 10 tekrar şeklinde yapılmaktadır.10 tekrarın kolay bir şekilde yapılmasından sonraki süreçte ayaklar başka bir benche uzatılır ve karın üzerine ağırlık koyularak egzersize devam edilir."

        ))
        exerciseList.add(Exercise(R.drawable.lungs,"Lungs",
        "Ayaklar kalça genişliğinde açılarak, iki girya front rack pozunda tutularak," +
                "ayakta durulur.Bir bacak ile arkaya doğru önemli bir lunge adımı atılır." +
                "Giryalar göğüs hizasında kalmalıdır.Arka diz zemine değdirilir," +
                "daha sonra öndeki ayak topuğuna yüklenilerek," +
                "hareket ters şekilde uygulanır ve kişi doğrulur." +
                "Diğer bacakla aynı uygulama tekrar edilir ve her tekrar için bacak değişimi yapılır."
        ))
        exerciseList.add(Exercise(R.drawable.plank,"Plank",
        "Plank egzersizini etkili ve verimli bir şekilde uygulamak için" +
                "dikkat etmen gereken birkaç nokta var.Öncelikle, beline yük bindirmemek adına" +
                "egzersizi uygularken karın ve kalça kaslarının aktif olduğundan emin olmalısın." +
                "Boynunu uzun kullanmalı,karşıya ya da havaya bakmaya çalışırken boyun kaslarını" +
                "sıkıştırmamalısın.Gözlerin yerde, yani yoga matına bakar şekilde olmalı." +
                "Dirseklerin tam olarak omuzlarının altında konumlanmalı." +
                "Omurgan ve sırtın düz olmadığı takdirde,yine belini ya da sırtını" +
                "zedeleyebilirsin.Plank egzersizindeki temel amaç,doğru pozisyonu bozmadan" +
                "mümkün olduğunca uzun süre boyunca hareketsiz kalmaktır.Ağırlığını dirseklerine ve ayaklarına eşit olarak dağıtmaya çalışmalısın." +
                "Özellikle plank egzersizlerine yeni başlıyorsan,plank pozisyonunda bekleme süreni zaman içinde uzatabilirsin."

        ))

        exerciseList.add(Exercise(R.drawable.pullups,"Pullups",
        "Barfiks çok iyi bir sırt hareketi olmakla birlikte tüm vücudu çalıştırır diyebiliriz." +
                "Barfiks barını omuz hizasında ya da biraz geniş tutmalıyız.Ayaklarımız bileklerimiz üst üste gelecek şekilde durmalıyız.Nefesimizi vererek kendimizi göğse kadar,yukarı çekmeliyiz,nefesimizi alarak geri aşağıya doğru bırakmalıyız.Bu hareketi yaparken tüm kaslarınızı kasarsanız daha iyi yaparsınız." +
                "Omuzlarınızı kulağınıza doğru çekmediğinizden emin olun.Dirseklerinizi kilitlemeyin." +
                "Kolaylaştırmak için,uzun direnç bandından destek alabilirsiniz.Direnç bandını demire dolayın ve bir ayağınızı içinden geçirin."

       ))

        exerciseList.add(Exercise(R.drawable.pushups,"Pushups",
        "Bu egzersiz evde yapılan egzersiz sınıfına girer ve uzun süre yapıldığında omuz arka kol göğüs ve baldır kaslarında mükemmel denecek biçimde değişiklikler göreceksiniz." +
                "Yere yüz üstü yatarak kalça kollardan güç alarak yukarı kaldırılır ve baş kollar ile aynı hizada ve kol arasında boştadır." +
                "Eller arasındaki boşluk omuz genişliğindedir." +
                "Nefes vererek kol kırılır ve gövde kol arasından yay çizerek baş yukarı kalkar ve kalça düzelir ve yere yaklaşır tekrar nefes vererek ilk pozisyona ters  bir yay çizerek dönülür."
       ))

        exerciseList.add(Exercise(R.drawable.sideplank,"Side Plank",
        "Sol kolumuzun dirseği omuz hizasında" +
                "yere dik gelecek şekilde konumlandırıyoruz." +
                "Ayaklarımız üst üste olacak şekilde durup kendimizi dirseğimizin" +
                "ve bir ayağımızın üzerinde kaldırıyoruz." +
                "Diğer kolumuz vücudumuzun üstünde duracaktır." +
                "Başlangıç olarak 15 saniye durabilirsiniz." +
                "Güçlendikçe bu süreyi uzatabiliriz." +
                "15 saniye yaptıktan sonra diğer tarafa geçmeliyiz."

        ))
        exerciseList.add(Exercise(R.drawable.squates,"Squates",
        "Squat hareketi ayakta başlar.Ayaklar omuz hizasında açıktır.Eller önce iki yanda durur,yere çömelirken eller birleşir." +
                "Başın dik ve bakışların ileri doğru olmalı." +
                "Göğsünü yukarıda tut.Ayaktayken nefes alıp, çömelirken verebilirsin.Tersini de deneyebilirsin.Kendin için en uygun nefesi keşfet." +
                "Belini düz tutmak için enerji harcama, doğal kıvrımında kalsın." +
                "Kendi gücüne göre kalça ve basenler yere paralel veya inebildiğin kadar aşağıda olabilir.Topuklarının üzerine oturmadan tabii." +
                "Dizlerin ayak uçlarının önüne geçmemesi hareketin genel bütünlüğü açısından önemli." +
                "Ayak tabanların yere düz bassın, ağırlığını topuklarına ver.Biraz daha zorlaşsın istersen ayak parmaklarını kaldırmayı dene."

        ))

        exerciseList.add(Exercise(R.drawable.star_jump,"Star Jump",
        "Ayaklarınla birlikte dur.Dizlerinizi hafifçe bükün.Kollarını yanlarına koy." +
                "Dizlerinizi bükün ve kendinizi bir çömelme pozisyonuna indirin.Hafifçe öne eğilmek.Ellerinizi indirin ve çömelirken önünüze hafifçe getirin;böylece çömelme dibinde diz hizasında olurlar." +
                "Olabildiğince yükseğe zıpla.Aynı zamanda, kollarınızı havaya ve dışa V konumunda kaldırın.Kollarınızı da uzatılmış halde bacaklarınızı ters V pozisyonuna açın.Vücut bir yıldızın ana hatlarını oluşturur." +
                "Atlamadan inerken kollarınızı ve bacaklarınızı getirin.Ayaklarınızla birlikte yere inin ve dizleriniz hafifçe eğildi." +
                "Kollarınız yanlarda ve dizleriniz hafifçe bükülmüş olarak ayağa kalkın.Kendinizi bir çömelme pozisyonuna geri indirin.İnişi yaptıktan sonra tekrar yukarı bastırarak ve kollarınızı ve bacaklarınızı yıldız sıçramasına doğru uzatarak egzersizi tekrarlayın."

        ))



        exerciseAdapter = ExerciseAdapter(exerciseList)
        recyclerView.adapter = exerciseAdapter

        exerciseAdapter.onItemClick = {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("exercise",it)
            startActivity(intent)
        }

    }

}