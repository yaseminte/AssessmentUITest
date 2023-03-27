# AssessmentUITest

"https://www.n11.com/" sitesine üye girişi yapılarak istenen ürün favorilere eklendi, silindi ve üye çıkış işlemi gerçekleştirildi. UI otomasyonu için Selenium WebDriver kullanıldı.

Programlama dili olarak Java, build tool olarak Maven, framework olarak Cucumber BDD, dependencies olarak Selenium.java, JUnit, raporlama aracı olarak Cucumber Reporting, IDE olarak Intellij kullanıldı. 


OOP(Object Oriented Programming) konseptine uyarak POM(Page Object Model) dizayn modeline göre tasarlandı.

## Utilities dosyası

Utilities dosyamızda bize sürekli lazım olan classlarımız ve methodlarımız bulunmaktadır.

## Configuration.properties

properties dosyası key =  value olarak oluşturulmaktadır. Sürekli kullandığımız key-valueları burada saklarız. Buradaki bilgileri başka classlara çağırabilmek için utilities dosyasından ConfigReader classından yardım alırız. Config.reader classı içindeki method sayesinde bu dosyada bulunan bilgileri istediğimiz yere getirerek kullanmamızı sağlar. 

## TestRunner & Feature

TestRunner classından çalıştırmak istediğimiz feature’ın tag name’ini girerek kodumuzu çalıştırabileceğimiz gibi doğrudan feature dosyasından da testimizi çalıştırabiliriz. 
Test koşumu bittikten sonra projemizde oluşan target dosyası içerisinden cucumber.reports.html dosyasına sağ tıklayıp open in -> Browser -> adımlarını takip ederek istediğimiz browser üzerinden teste ait raporlara ve ekran görüntülerine ulaşabiliriz. 



<p align="left">




<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png">
<code><img title="Selenium" height="25" src="https://github.com/IsmailMertDemirci/IsmailMertDemirci/blob/main/images/Selenium.png"></code>
<img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg" title="Cucumber" alt="Cucumber" width="40" height="40"/>
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/git/git.png">
<code><img title="GitHub" height="25" src="https://github.com/IsmailMertDemirci/IsmailMertDemirci/blob/main/images/github.svg"></code>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="60" height="30"/> </a>
