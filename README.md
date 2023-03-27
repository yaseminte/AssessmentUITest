# AssessmentUITest

"https://www.n11.com/" sitesine üye girişi yapılarak istenen ürün favorilere eklendi, silindi ve üye çıkış işlemi gerçekleştirildi. UI otomasyonu için Selenium WebDriver kullanıldı.

Programlama dili olarak Java, build tool olarak Maven, framework olarak Cucumber BDD, dependencies olarak Selenium.java, JUnit, raporlama aracı olarak Cucumber Reporting, IDE olarak Intellij kullanıldı. Cucumber BDD(Behaviour Driven Development-Davranış Tabanlı Geliştirme) yaklaşımı için kullanılmakta olan açık kaynak kodlu bir kütüphanedir.


OOP(Object Oriented Programming) konseptine uyarak POM(Page Object Model) dizayn modeline göre tasarlandı.

## Utilities dosyası

Utilities dosyamızda bize sürekli lazım olan classlarımız ve methodlarımız bulunmaktadır.

## Configuration.properties

properties dosyası key =  value olarak oluşturulmaktadır. Sürekli kullandığımız key-valueları burada saklarız. Buradaki bilgileri başka classlara çağırabilmek için utilities dosyasından ConfigReader classından yardım alırız. Config.reader classı içindeki method sayesinde bu dosyada bulunan bilgileri istediğimiz yere getirerek kullanmamızı sağlar. 

## TestRunner & Feature & StepDefinition

* Feature dosyasında ve step classında bir test case yazılırken takip ettiğimiz kullanıcı adımlarının her birini Java kodlarıyla method haline getirip kullanabiliyoruz. Selenium, feature dosyasında yazdığımız satırların bir method call olduğunu baştaki Gherkin kelimelerinden anlamaktadır. Given, When, Then ve And kelimeleri test caseleri okuyanlar için adımları anlamak adına kolaylık sağlar.

* Test case yazmaya feature dosyasından başlarız. Feature dosyalarının isimleri önemli değildir ancak uzantıları mutlaka .feature olmak zorundadır.

* Feature dosyasına test case adımlarını yazdıktan sonra java kodu daha önce yazılmamış olan adımlar highlighted olur ve öncelikle java adımlarını StepDefinition dosyasında step classı olarak oluştururuz. Testlerimizde java kodu yazılmamış eksik adımları bize vermesini istersek, testimizi Runner classından dryRun=true olarak çalıştırarak da bulabiliriz.

* Test koşumu bittikten sonra projemizde oluşan target dosyası içerisinden cucumber.reports.html dosyasına sağ tıklayıp open in -> Explorer -> adımlarını takip ederek teste ait raporlara ve ekran görüntülerine ulaşabiliriz. 
Projemizin raporlanması için, "Cucumber report" aracı kullanırken cucumber-report.html dosyasından sağ click Open İn’e tıklayıp Expolere’a tıkladığımızda localimizde bulunan rapora ilişkin dosya açılacaktır ve o dosyaya tıklandığında raporumuza erişim sağlanmaktadır.
Ayrıca Browser üzerinden de açma istediğimizde cucumber-report.html dosyasından sağ click Open İn’e tıklayıp Browser seçip herhangi bir browserı seçerek projemize ait rapora erişim sağlayabiliriz. Bazen browserda raporumuzu açmak istediğimizde "localhost 404 Not Found" hatası alabiliyoruz, bunun en önemli sebepleri şunlardır; <br/> 
Güvenlik duvarları veya port engelleri, Cucumber report sunucusunun çalışmasını engelleyebilir. <br/>
Cucumber report dosyalarının eksik veya yanlış adreste olması sebebiyle hata alınabilir. <br/>
Yanlış bir bağlantı adresi kullanılması durumunda, "localhost 404 Not Found" hatası alınabilir. <br/>
Yapılandırılmayan eksik adımlar da bu hataya sebebiyet verebilir. <br/>



<p align="left">




<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png">
<code><img title="Selenium" height="25" src="https://github.com/IsmailMertDemirci/IsmailMertDemirci/blob/main/images/Selenium.png"></code>
<img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg" title="Cucumber" alt="Cucumber" width="40" height="40"/>
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/git/git.png">
<code><img title="GitHub" height="25" src="https://github.com/IsmailMertDemirci/IsmailMertDemirci/blob/main/images/github.svg"></code>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="60" height="30"/> </a>
