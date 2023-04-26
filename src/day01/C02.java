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

     */
}
