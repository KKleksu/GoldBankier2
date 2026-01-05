package Tests;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class RestApi {

      @Test
    public void restAssured() {


        String bankier = get("https://api.bankier.pl/quotes/public/commodities-section-chart/?symbols=gold&metrics=true&intraday=true&today=true").path("data.profile_data.last_value").toString();
        bankier=bankier.replace("[","");
        bankier=bankier.replace("]","");
        Float bankier1 = Float.parseFloat(bankier);
        System.out.println(bankier1);

          Float bodyTavex=given()
                  .get("https://market-data.tavex.pl/v1/spot-price/xignite-metals?symbol=XAUUSD")
                  .then()
                  .extract().path("data.mid");
          System.out.println("To jest print z extract: " +bodyTavex);

          when().
                  get("https://market-data.tavex.pl/v1/spot-price/xignite-metals?symbol=XAUUSD").
                  then().
                  statusCode(200).
                  body("data.mid",equalTo(bankier1));

//        String tavex = get("https://market-data.tavex.pl/v1/spot-price/xignite-metals?symbol=XAUUSD").path("data.mid").toString();
//
//        System.out.println(tavex);
//        Assert.assertTrue(bankier.equals(tavex));
    }

    @Test
    public void httpClient() throws IOException, InterruptedException {
        HttpClient clientBankier = HttpClient.newHttpClient();
        HttpRequest requestBankier = HttpRequest.newBuilder()
                .uri(URI.create("https://api.bankier.pl/quotes/public/commodities-section-chart/?symbols=gold&metrics=true&intraday=true&today=true"))
                .GET()
                .build();


        HttpResponse<String> responseBankier = clientBankier.send(requestBankier, HttpResponse.BodyHandlers.ofString());
        String bankier = responseBankier.body().toString();

        String[] myArray = bankier.split("\"last_value\"");
        String listaBankier = myArray[1];
        listaBankier=listaBankier.substring(2,9);
       listaBankier= listaBankier.replace(",","0");
         System.out.println("Kurs bankier: "+listaBankier);


        HttpClient clientTavex = HttpClient.newHttpClient();
        HttpRequest requestTavex = HttpRequest.newBuilder()
                .uri(URI.create("https://market-data.tavex.pl/v1/spot-price/xignite-metals?symbol=XAUUSD"))
                .GET()
                .build();

        HttpResponse<String> responseTavex = clientTavex.send(requestTavex, HttpResponse.BodyHandlers.ofString());
        String tavex = responseTavex.body().toString();
        String[] myArray2 = tavex.split("\"mid\"");

        String listaTavex = myArray2[1];
        listaTavex=listaTavex.substring(1,8);
        System.out.println("Kurs tavex: " +listaTavex);
        Assert.assertTrue(listaBankier.equals(listaTavex));

    }


}
