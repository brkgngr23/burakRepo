import com.base.BaseTest;
import com.pages.Islemler;
import org.junit.Test;


public class DemoSiteTest extends BaseTest {
    Islemler islemler = new Islemler();

    @Test
    public void TS1() {

        openURL();
        String username= "burak";
        String password= "burak";
        String loginDurumu1= "**No login attempted**";
        String loginDurumu2= "**Failed Login**";
        String sayfaBasligi= "4. Login" ;
        String sayfaBilgiMesaj= "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";

        islemler
                .loginDurumuKontrolu(loginDurumu1)
                .sayfaBilgiMesajKontrol(sayfaBilgiMesaj)
                .sayfaBaslikKontrol(sayfaBasligi)
                .UsernameDoldur(username)
                .PasswordDoldur(password)
                .btnLogin()
                .loginDurumuKontrolu(loginDurumu2);
    }

    @Test
    public void TS2() {
        openURL();
        String username= "pragatichu";
        String password= "1234";
        String loginDurumu1= "**No login attempted**";
        String loginDurumu2= "**Successful Login**";
        String sayfaBasligi= "4. Login" ;
        String sayfaBilgiMesaj= "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";

        islemler
                .loginDurumuKontrolu(loginDurumu1)
                .sayfaBilgiMesajKontrol(sayfaBilgiMesaj)
                .sayfaBaslikKontrol(sayfaBasligi)
                .UsernameDoldur(username)
                .PasswordDoldur(password)
                .btnLogin()
                .loginDurumuKontrolu(loginDurumu2);
    }

    @Test
    public void TS3() {
        openURL();
        String username= "asd";
        String password= "1234";
        String loginDurumu1= "**No login attempted**";
        String sayfaBasligi= "4. Login" ;
        String sayfaBilgiMesaj= "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";
        String alertmesaj1= "Username too short.  The username must be at least 4 characters in length.";

        islemler
                .loginDurumuKontrolu(loginDurumu1)
                .sayfaBilgiMesajKontrol(sayfaBilgiMesaj)
                .sayfaBaslikKontrol(sayfaBasligi)
                .UsernameDoldur(username)
                .PasswordDoldur(password)
                .btnLogin()
                .loginHataKontroluKisa(alertmesaj1);


    }

    @Test
    public void TS4() {
        openURL();
        String username= "asdq";
        String password= "123";
        String loginDurumu1= "**No login attempted**";
        String sayfaBasligi= "4. Login" ;
        String sayfaBilgiMesaj= "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";
        String alertmesaj1= "Password too short.  The password must be at least 4 characters in length.";

        islemler
                .loginDurumuKontrolu(loginDurumu1)
                .sayfaBilgiMesajKontrol(sayfaBilgiMesaj)
                .sayfaBaslikKontrol(sayfaBasligi)
                .UsernameDoldur(username)
                .PasswordDoldur(password)
                .btnLogin()
                .loginHataKontroluKisa(alertmesaj1);


    }

}