import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableTest {
    WebDriver driver = Util.getDriver();
    @Test
    public void tabletesting() {
        Table table = new Table();
        List<String> Kristóf = table.iterate_table();
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        Assertions.assertEquals(expected, Kristóf);
    }


    @Test
    public void tabletesting2() {
        Table.table_loop();
    }


    @Test
    public void demoblaze() {
        DemoBlaze.purchase();


    }

    @Test
    public void itcoffee() {
        Itcafé.itmethod();


    }


    @Test
    public void table_loop3() {
        Table.table_loop3();


    }

    @Test
    public void writing() throws IOException {
        ExtractText.write();

    }

    @Test
    public void alert_click() {
        alert.alertwindow();
    }


    @Test
    public void acme() {
        ACME.acme_site();
    }

    @Test
    public void book_reading() {
        compendium.booking();
    }


    @Test
    public void chan() {
        chan.fourchan();
    }

    @Test
    public void swagging() {
        Swag.swagger();
    }


    @Test
    public void bootstrap() {
        bootsrap.tables();

    }

    @Test
    public void lopped3() {
        bootsrap.table_looped();
    }


    @Test
    public void looped4() throws IOException {
        Table.table_loop4();
    }


    @Test
    public void hv_article() {
        hvg.news();
    }

    @Test
    public void summer() throws IOException {
        tourism_extract_text.skiing();
    }


    @Test
    public void finances() throws IOException {
        //  tourism_extract_text.business_new_page_extract_text();
    }


    @Test
    public void alert() {
        JavaScriptconfirmbox.alert_box();
    }


    @Test
    public void loopandprint() throws IOException {
        W3SCHOOLTABLE.w3school();


    }

    @Test
    public void table_extract_text() throws IOException {
        ExtractTableText.iterate_table();
    }

    @Test
    public void search() {
        Google.Google_search_button();
    }


    @Test
    public void gaming() {
        Steam.buy_checkout();
    }


    @Test //valamiért ez nem fut le...
    public void data_bonanza() {

    }


    @Test
    public void Startlap() {
        Startlap.start();
    }


    @Test
    public void Astra() throws IOException {
        AstraZeneca.medicine();
    }


    @Test
    public void JavaScript() {
        JavaScriptAlertBox.alert_click();
    }


    @Test
    public void NFR() {
        NRF.iteration();

    }

    @Test
    public void NRF2() {
        NRF.iteration2();
    }


    @Test
    public void table() {
        tableloop.table_iteration();
    }

    @Test
    public void tabl2(){
        tableloop.table_iteration2();
    }


    @Test
    public void paginage() throws IOException {
            Pagination.pagin();

    }


    @Test
    public void JavaScriptAlert(){
        JavaScriptAlertBoxConfirm.confirm();
    }


@Test
public void barter(){
        Bartervg.bartering();
}


@Test
public void four(){
        fourfourfour.negy();
}


@Test
public void ToolsQA(){
        ToolsQA.tool();
}

@Test
public void Gamivo(){
        Gamivo.shopping();
}


@Test
public void indiana(){
        indiana_edu.indiana();
        indiana_edu.text();
}


@Test
public void indiana_write_to_file() throws IOException {
indiana_edu.table_write_to_file();
}


@Test
public void SeleniumEasy(){
        SeleniumEasy.seleniumsum();
}

@Test
public void SeleniumSingleInput(){
        SeleniumEasy.inputfield();
}


@Test
public void alertwin() throws InterruptedException {
        SeleniumEasy.alertwindow();

}


@Test
public void magyarnarancs(){}
   // hungarian.magyar();




@Test
    public void IKK(){
        IKK.menuloop();
        IKK.clickOnNewsArticle("Pont Ott Parti");

}

@Test
    public void hvg_menu(){
        hvg.clickonmenu("Vállalkozás");
}


@Test
public void digital() {
    eDigital.open_menu();
    eDigital.shopper("TV, Audio és Konzol");
    eDigital.browse();
}


@Test
    public void blaze(){
        blaze.clickMenuButton("Monitors");
}



@Test
    public void mediamarkt(){
        Media.menuelement();
}



@Test
    public void Selenium(){
        SeleniumEasy.menza();
}



@Test
    public void auchan(){
    Auchan.tagname();
}




@Test
    public void FindAllLinksonSite(){
        FindAllLinksonSite.linkhuting();
}


@Test
   public void writetotable() throws IOException {
        DemoBlaze.table_iteration();

}


@Test
    public void IKK_ITERATE_TO_TABLE() throws IOException {
        IKK.cookie();
        IKK.navigate();
}





    @Test
    public void getTitleTest() throws IOException {
        IKK.cookies();
        List<String> result = IKK.fullListAlchemist();

    }



    @Test
    public void tablepress(){
        TablePress.table_iteration();
    }


    @Test
    public void tablepress2(){
        TablePress.table_iteration2();
    }



    @Test
    public void tablepress_print() throws IOException {
        TablePress.table_move_and_print();
    }


    @Test
    public void radio_button(){
        SeleniumEasy.radio();
    }


@Test
public void groupradiobutton(){
        SeleniumEasy.groupradio();
}



    @AfterEach
    public void Close () {
        driver.close();


    }






}







