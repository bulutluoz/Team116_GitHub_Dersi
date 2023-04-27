package day01;

public class C02 {
    /*
    git.init komutu, bir workingDirectory'u git ile irtibatlandirir
             bu komut her proje icin sadece 1 kere calistirilir
             bu komut ile birlikte git icinde bulunulan klasoru kontrol etmeye baslar

    Bu klasorde her yedek almak istedigimizde
    commit yapmaliyiz.
    asagidaki 3 komut bizim dosyalarimizi her yedeklemek istedigimizde kullanilir

    1- git add .  : son kaydedilen versiyondan sonra
                    projede yapilan degisiklikleri belirler

    2- git commit -m "commit ismi" :
                    projenin son durumunu bir versiyon olarak kaydeder
                    burada "" icinde yazilan commit isminin
                    anlamli olmasinda fayda vardir.
                    ilerleyen asamalarda geri donus yapmak istersek
                    hangi commit'e donmek isteyecegimizi
                    aciklamalardan bulabiliriz

      git ile ilisiklendirsdigimiz dosyadaki class isimleri
      git durumuna gore renklenir

      kirmizi   : bu class herhangi bir versiyona eklenmedi
      mavi      : bu dosya bir versiyona eklendi
                  ama sonradan degisiklik yapilmis
      siyah     : bu class bir versiyonda son haliyle yedeklendi
                  sonrasinda hic bir degisiklik yok

     3- git push : local repo'da commit ettigimiz dosyalarimizi
                    uzak masaustu(GitHub)ne yollamak icin kullanilir.

                    Local bilgisayarda olusturdugumuz bir repo'yu
                    GitHub'a yollamak ve orada yedeklemek istiyorsak
                    oncelikle GitHub hesabi olusturmamiz
                    ve sonrasinda projemizi gonderecegimiz GitHub repo'sunu hazirlamamiz gerekir

                    Github'da yeni bir repository olusturdugumuzda
                    ilk kullanimda, local repo ile remote repo arasinda
                    baglanti kurmamiz gerekir


     */
}
