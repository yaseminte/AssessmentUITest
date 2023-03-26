package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.N11Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class StepDef {

    N11Page n11Page = new N11Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici n11 sitesine gider")
    public void kullanici_n11_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici anasayfanin acildigini dogrular")
    public void kullanici_anasayfanin_acildigini_dogrular() throws IOException {
        String expectedUrl = ConfigReader.getProperty("url");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        ReusableMethods.screenshotAddReport();
    }

    @And("Kullanici gecerli bilgilerle uye girisi yapar")
    public void kullanici_gecerli_bilgilerle_uye_girisi_yapar() {
        ReusableMethods.jsClick(n11Page.girisYapButonu);
        n11Page.ePostaAdresiKutusu.sendKeys(ConfigReader.getProperty("ePosta"));
        n11Page.sifreKutusu.sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.jsClick(n11Page.loginButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici basarili bir sekilde login oldugunu dogrular")
    public void kullanici_basarili_bir_sekilde_login_oldugunu_dogrular() throws IOException {
        Assert.assertTrue(n11Page.hesabim.isDisplayed());
    }

    @And("Kullanici arama sekmesinden {string} aratir")
    public void kullanici_arama_sekmesinden_aratir(String arananKelime) {
        n11Page.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici arama sonuclarindan {string} aratildigini dogrular")
    public void kullanici_arama_sonuclarindan_aratildigini_dogrular(String arananKelime) throws IOException {
        Assert.assertTrue(n11Page.sonucYazisi.getText().contains(arananKelime));
    }

    @And("Kullanici arama sonuc sayfasindan {int}. sayfayi tiklar")
    public void kullanici_arama_sonuc_sayfasindan_sayfayi_tiklar(Integer sayfa) {
        int sayfaSirasi = sayfa - 1;
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(10);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(10);
        ReusableMethods.jsClick(n11Page.sayfalar.get(sayfaSirasi));
        ReusableMethods.waitFor(5);

    }

    @Then("Kullanici {int}. sayfanin acildigini dogrular")
    public void kullaniciSayfaninAcildiginiDogrular(int sayfaSayisi) throws IOException {
        int sayfaSirasi = sayfaSayisi - 1;
        Assert.assertTrue(n11Page.sayfalar.get(sayfaSirasi).isDisplayed());
    }

    @And("Kullanici sayfadaki {int}. urunu favorilerine ekler")
    public void kullanici_sayfadaki_urunu_favorilerine_ekler(Integer sira) {
        int urunSirasi = sira - 1;
        List<WebElement> urunlist = n11Page.ikinciSayfaUrunler;
        urunlist.get(urunSirasi).click();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici favorilerim linkine tiklar")
    public void kullanici_favorilerim_linkine_tiklar() {
        actions.moveToElement(n11Page.hesabim).perform();
        ReusableMethods.waitFor(2);
        n11Page.favorilerimListelerim.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici favorilerim sayfasinda oldugunu dogrular")
    public void kullanici_favorilerim_sayfasinda_oldugunu_dogrular() throws IOException {
        Assert.assertEquals("Favorilerim", n11Page.favorilerim.getText());
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici eklenen urunu favorilerden siler")
    public void kullaniciEklenenUrunuFavorilerdenSiler() {
        n11Page.favoriSilButon.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici urununun silindigini dogrular")
    public void kullaniciUrunununSilindiginiDogrular() throws IOException {
        String silindiUyarisi = n11Page.uyariMesaji.getText();
        Assert.assertTrue(silindiUyarisi.contains("Ürün, favorilerinden çıkarıldı."));
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici uye cikis islemi yapar")
    public void kullanici_uye_cikis_islemi_yapar() {
        actions.moveToElement(n11Page.hesabim).perform();
        ReusableMethods.waitFor(2);
        ReusableMethods.jsClick(n11Page.cikisYap);
    }
}
