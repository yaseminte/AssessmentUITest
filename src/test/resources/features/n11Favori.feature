Feature: N11 Favori Urun Senaryosu

  @n11FavoriUrunEkleSil
  Scenario: Kullanici login olduktan sonra istenen urunu favorilere ekler, siler ve cikis yapar

    Given Kullanici n11 sitesine gider
    When Kullanici anasayfanin acildigini dogrular
    And Kullanici gecerli bilgilerle uye girisi yapar
    Then Kullanici basarili bir sekilde login oldugunu dogrular
    And Kullanici arama sekmesinden "Iphone" aratir
    Then Kullanici arama sonuclarindan "Iphone" aratildigini dogrular
    And Kullanici arama sonuc sayfasindan 2. sayfayi tiklar
    Then Kullanici 2. sayfanin acildigini dogrular
    And Kullanici sayfadaki 3. urunu favorilerine ekler
    And Kullanici favorilerim linkine tiklar
    Then Kullanici favorilerim sayfasinda oldugunu dogrular
    And Kullanici eklenen urunu favorilerden siler
    Then Kullanici urununun silindigini dogrular
    And Kullanici uye cikis islemi yapar



